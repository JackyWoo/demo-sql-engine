package woo.sql.parser;

import com.google.common.collect.Lists;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import woo.sql.analyzer.Node;
import woo.sql.analyzer.QualifiedName;
import woo.sql.analyzer.SyntaxException;
import woo.sql.analyzer.TableName;
import woo.sql.analyzer.PrimitiveType;
import woo.sql.ast.AggregateFunctionCall;
import woo.sql.ast.BinaryArithmetic;
import woo.sql.ast.BinaryPredicate;
import woo.sql.ast.BooleanLiteral;
import woo.sql.ast.CastExpr;
import woo.sql.ast.ColumnRef;
import woo.sql.ast.CompoundPredicate;
import woo.sql.ast.DateLiteral;
import woo.sql.ast.DoubleLiteral;
import woo.sql.ast.EmptyStmt;
import woo.sql.ast.ExistsPredicate;
import woo.sql.ast.Expr;
import woo.sql.ast.ExprList;
import woo.sql.ast.FunctionCall;
import woo.sql.ast.Identifier;
import woo.sql.ast.InPredicate;
import woo.sql.ast.IntLiteral;
import woo.sql.ast.IsNullExpr;
import woo.sql.ast.JoinRelation;
import woo.sql.ast.LimitElement;
import woo.sql.ast.NullLiteral;
import woo.sql.ast.QueryRelation;
import woo.sql.ast.QueryStatement;
import woo.sql.ast.Relation;
import woo.sql.ast.SelectList;
import woo.sql.ast.SelectListItem;
import woo.sql.ast.SelectRelation;
import woo.sql.ast.SortItem;
import woo.sql.ast.StringLiteral;
import woo.sql.ast.Subquery;
import woo.sql.ast.SubqueryRelation;
import woo.sql.ast.TableRelation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Translate an ANTLR4 AST to Node AST.
 * 1. Can have different Parser layer
 * 2. Simplify original AST
 * Created by wujianchao on 2022/11/23.
 */
public class AstBuilder extends TernalBaseVisitor<Node> {

    @Override
    public Node visitSingleStatement(TernalParser.SingleStatementContext ctx) {
        if (ctx.statement() != null) {
            return visit(ctx.statement());
        } else {
            return new EmptyStmt();
        }
    }

    @Override
    public Node visitQueryStatement(TernalParser.QueryStatementContext context) {
        QueryRelation queryRelation = (QueryRelation) visit(context.queryRelation());
        return new QueryStatement(queryRelation);
    }

    @Override
    public Node visitQueryRelation(TernalParser.QueryRelationContext ctx) {
        // order by
        List<SortItem> orderByElements = new ArrayList<>();
        if (ctx.ORDER() != null) {
            ctx.sortItem().forEach(item -> orderByElements.add((SortItem) visitSortItem(item)));
        }

        // limit
        LimitElement limitElement = null;
        if (ctx.limitElement() != null)
            limitElement = (LimitElement) visit(ctx.limitElement());

        QueryRelation queryRelation = (QueryRelation) visit(ctx.selectRelation());

        queryRelation.setLimit(limitElement);
        queryRelation.setOrderBys(orderByElements);

        return queryRelation;
    }

    @Override
    public Node visitSortItem(TernalParser.SortItemContext ctx) {
        SortItem sortItem = new SortItem();
        // expression
        sortItem.setExpr((Expr) visit(ctx.expression()));
        // order
        SortItem.Order order = SortItem.Order.ASC;
        if (ctx.ordering != null) {
            order = ctx.ordering.getType() == TernalLexer.ASC ? SortItem.Order.ASC : SortItem.Order.DESC;
        }
        sortItem.setOrder(order);
        // null order
        SortItem.NullOrdering nullOrdering = SortItem.NullOrdering.FIRST;
        if (ctx.nullOrdering != null) {
            nullOrdering = ctx.nullOrdering.getType() == TernalLexer.FIRST ? SortItem.NullOrdering.FIRST : SortItem.NullOrdering.LAST;
        }
        sortItem.setNullOrdering(nullOrdering);
        return sortItem;
    }

    @Override
    public Node visitLimitElement(TernalParser.LimitElementContext ctx) {
        LimitElement limitElement = new LimitElement();
        limitElement.setLimit(Integer.parseInt(ctx.limit.getText()));
        if (ctx.offset != null) {
            limitElement.setOffset(Integer.parseInt(ctx.offset.getText()));
        }
        return limitElement;
    }

    @Override
    public Node visitSelectRelation(TernalParser.SelectRelationContext ctx) {

        SelectRelation selectRelation = new SelectRelation();

        // select
        List<SelectListItem> itemList = new ArrayList<>();
        for (TernalParser.SelectItemContext selectCtx : ctx.selectItem()) {
            itemList.add((SelectListItem) visit(selectCtx));
        }
        SelectList selectList = new SelectList();
        selectList.setItemList(itemList);
        selectRelation.setSelectList(selectList);

        // from
        Relation relation = (Relation) visit(ctx.relation());
        selectRelation.setRelation(relation);

        // where
        Expr predicate = (Expr) visit(ctx.where);
        selectRelation.setPredicate(predicate);

        // group by
        ExprList groupBy = (ExprList) visit(ctx.groupBy);
        selectRelation.setGroupBy(groupBy);

        // having
        Expr having = (Expr) visit(ctx.having);
        selectRelation.setHaving(having);

        return selectRelation;
    }

    @Override
    public Node visitExpressionList(TernalParser.ExpressionListContext ctx) {
        List<Expr> exprList = visit(ctx.expression(), Expr.class);
        return new ExprList(exprList);
    }

    @Override
    public Node visitSelectSingle(TernalParser.SelectSingleContext ctx) {
        SelectListItem selectListItem = new SelectListItem();
        selectListItem.setStar(false);
        selectListItem.setExpr((Expr) visit(ctx.expression()));
        if (ctx.identifier() != null)
            selectListItem.setAlias(((Identifier) visit(ctx.identifier())).getName());
        return selectListItem;
    }

    @Override
    public Node visitSelectAll(TernalParser.SelectAllContext ctx) {
        SelectListItem selectListItem = new SelectListItem();
        selectListItem.setStar(true);
        if (ctx.qualifiedName() != null) {
            selectListItem.setTableName(TableName.parseFrom(getQualifiedName(ctx.qualifiedName())));
        }
        return selectListItem;
    }

    @Override
    public Node visitDigitIdentifier(TernalParser.DigitIdentifierContext ctx) {
        return new Identifier(ctx.getText());
    }

    @Override
    public Node visitUnquotedIdentifier(TernalParser.UnquotedIdentifierContext ctx) {
        return new Identifier(ctx.getText());
    }

    @Override
    public Node visitBackQuotedIdentifier(TernalParser.BackQuotedIdentifierContext ctx) {
        return new Identifier((ctx.getText().substring(1, ctx.getText().length() - 1)));
    }

    @Override
    public Node visitRelation(TernalParser.RelationContext ctx) {
        if (ctx.joinRelation().isEmpty()) {
            return visit(ctx.relationPrimary());
        } else {
            Relation left = (Relation) visit(ctx.relationPrimary());
            List<JoinRelation> joinRelations = visit(ctx.joinRelation(), JoinRelation.class);
            for (JoinRelation joinRelation : joinRelations) {
                joinRelation.setLeft(left);
                left = joinRelation;
            }
            //  TODO first or last
            return joinRelations.get(0);
        }
    }

    @Override
    public Node visitTable(TernalParser.TableContext ctx) {
        TableName tableName = TableName.parseFrom(getQualifiedName(ctx.qualifiedName()));
        TableRelation table = new TableRelation();
        table.setName(tableName);
        if (ctx.alias != null) {
            table.setAlias(new TableName(((Identifier)visit(ctx.alias)).getName()));
        }
        return table;
    }

    @Override
    public Node visitJoinRelation(TernalParser.JoinRelationContext ctx) {
        JoinRelation joinRelation = new JoinRelation();
        joinRelation.setType(getType(ctx.joinType()));
        joinRelation.setCriteria((Expr) visit(ctx.joinCriteria()));
        joinRelation.setRight((Relation) visit(ctx.rightRelation));
        return joinRelation;
    }

    @Override
    public Node visitJoinCriteria(TernalParser.JoinCriteriaContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Node visitSubqueryWithAlias(TernalParser.SubqueryWithAliasContext ctx) {
        SubqueryRelation subqueryRelation = new SubqueryRelation();
        subqueryRelation.setQueryRelation((QueryRelation) visit(ctx.subquery()));
        if (ctx.alias != null) {
            subqueryRelation.setAlias(new TableName(((Identifier)visit(ctx.alias)).getName()));
        }
        return subqueryRelation;
    }

    @Override
    public Node visitLogicalNot(TernalParser.LogicalNotContext ctx) {
        return new CompoundPredicate(CompoundPredicate.Operator.NOT, Lists.newArrayList((Expr)visit(ctx.expression())));
    }

    @Override
    public Node visitLogicalBinary(TernalParser.LogicalBinaryContext ctx) {
        CompoundPredicate.Operator op;
        if (ctx.operator.getType() == TernalLexer.AND || ctx.operator.getType() == TernalLexer.LOGICAL_AND)
            op = CompoundPredicate.Operator.ADD;
        else
            op = CompoundPredicate.Operator.OR;
        return new CompoundPredicate(op, Lists.newArrayList((Expr)visit(ctx.left), (Expr)visit(ctx.right)));
    }

    @Override
    public Node visitIsNull(TernalParser.IsNullContext ctx) {
        return new IsNullExpr(ctx.NOT() != null, (Expr) visit(ctx.booleanExpression()));
    }

    @Override
    public Node visitComparison(TernalParser.ComparisonContext ctx) {
        BinaryPredicate.Operator op = getComparisionOperator((((TerminalNode) ctx.comparisonOperator().children.get(0)).getSymbol()));
        return new BinaryPredicate(op, (Expr) visit(ctx.left), (Expr) visit(ctx.right));
    }

    @Override
    public Node visitInList(TernalParser.InListContext ctx) {
        boolean isNot = ctx.NOT() != null;
        return new InPredicate(isNot, (Expr) visit(ctx.value), visit(ctx.expressionList().expression(), Expr.class));
    }

    @Override
    public Node visitInSubquery(TernalParser.InSubqueryContext ctx) {
        boolean isNot = ctx.NOT() != null;
        QueryRelation query = (QueryRelation) visit(ctx.queryRelation());

        return new InPredicate(isNot, (Expr) visit(ctx.value), Lists.newArrayList(new Subquery(query)));
    }

    @Override
    public Node visitArithmeticBinary(TernalParser.ArithmeticBinaryContext ctx) {
        BinaryArithmetic.Operator op = getArithmericOperator(ctx.operator);
        return new BinaryArithmetic(op, (Expr) visit(ctx.left), (Expr) visit(ctx.right));
    }

    @Override
    public Node visitNullLiteral(TernalParser.NullLiteralContext ctx) {
        return new NullLiteral();
    }

    @Override
    public Node visitNumericLiteral(TernalParser.NumericLiteralContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public Node visitIntegerValue(TernalParser.IntegerValueContext ctx) {
        return new IntLiteral(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Node visitDoubleValue(TernalParser.DoubleValueContext ctx) {
        return new DoubleLiteral(Double.parseDouble(ctx.getText()));
    }

    @Override
    public Node visitBooleanValue(TernalParser.BooleanValueContext ctx) {
        return  new BooleanLiteral(ctx.TRUE() != null);
    }

    @Override
    public Node visitString(TernalParser.StringContext ctx) {
        String unquotedString;
        if (ctx.SINGLE_QUOTED_TEXT() != null) {
            unquotedString = ctx.SINGLE_QUOTED_TEXT().getText();
        } else {
            unquotedString = ctx.DOUBLE_QUOTED_TEXT().getText();
        }
        unquotedString = unquotedString.substring(1, unquotedString.length() - 1);
        return new StringLiteral(unquotedString);
    }

    @Override
    public Node visitDateLiteral(TernalParser.DateLiteralContext ctx) {

        return new DateLiteral(((StringLiteral) visit(ctx.string())).getValue(), ctx.DATETIME() != null);
    }

    @Override
    public Node visitAggregationFunctionCall(TernalParser.AggregationFunctionCallContext ctx) {
        return super.visitAggregationFunctionCall(ctx);
    }

    @Override
    public Node visitSimpleFunctionCall(TernalParser.SimpleFunctionCallContext ctx) {
        String functionName = getQualifiedName(ctx.qualifiedName()).toString();
        return new FunctionCall(functionName, visit(ctx.expression(), Expr.class));
    }

    @Override
    public Node visitAggregationFunction(TernalParser.AggregationFunctionContext ctx) {
        String functionName = ctx.getChild(0).getText();
        return new AggregateFunctionCall(functionName, visit(ctx.expression(), Expr.class));
    }

    @Override
    public Node visitColumnReference(TernalParser.ColumnReferenceContext ctx) {
        if (ctx.identifier() != null) {
            Identifier col = (Identifier) visit(ctx.identifier());
            return new ColumnRef(col.getName());
        } else {
            QualifiedName fullName = getQualifiedName(ctx.qualifiedName());
            return new ColumnRef(fullName.getName(), TableName.parseFrom(fullName.getParent()));
        }
    }

    @Override
    public Node visitParenthesizedExpression(TernalParser.ParenthesizedExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Node visitExists(TernalParser.ExistsContext ctx) {
        return new ExistsPredicate(new Subquery((QueryRelation) visit(ctx.queryRelation())));
    }

    @Override
    public Node visitCast(TernalParser.CastContext ctx) {
        return new CastExpr((Expr) visit(ctx.expression()), getType(ctx.type()));
    }

    // ------------------------------------------- Util Functions -------------------------------------------

    private PrimitiveType getType(TernalParser.TypeContext ctx) {
        PrimitiveType t;
        if (ctx.BOOLEAN() != null) {
            t = PrimitiveType.BOOLEAN;
        } else if (ctx.UNSIGNED() != null && ctx.TINYINT() != null) {
            t = PrimitiveType.UNSIGNED_TINYINT;
        } else if (ctx.UNSIGNED() != null && ctx.TINYINT() != null) {
            t = PrimitiveType.UNSIGNED_TINYINT;
        } else if (ctx.UNSIGNED() == null && ctx.TINYINT() != null) {
            t = PrimitiveType.TINYINT;
        } else if (ctx.UNSIGNED() != null && ctx.SMALLINT() != null) {
            t = PrimitiveType.UNSIGNED_SMALLINT;
        } else if (ctx.UNSIGNED() == null && ctx.SMALLINT() != null) {
            t = PrimitiveType.SMALLINT;
        } else if (ctx.UNSIGNED() != null && ctx.INT() != null) {
            t = PrimitiveType.UNSIGNED_INT;
        } else if (ctx.UNSIGNED() == null && ctx.INT() != null) {
            t = PrimitiveType.INT;
        } else if (ctx.BIGINT() != null) {
            t = PrimitiveType.BIGINT;
        }  else if (ctx.FLOAT() != null) {
            t = PrimitiveType.FLOAT;
        }  else if (ctx.DOUBLE() != null) {
            t = PrimitiveType.DOUBLE;
        }  else if (ctx.DATE() != null) {
            t = PrimitiveType.DATE;
        }  else if (ctx.DATETIME() != null) {
            t = PrimitiveType.DATETIME;
        }  else if (ctx.CHAR() != null) {
            t = PrimitiveType.CHAR;
        }  else if (ctx.STRING() != null) {
            t = PrimitiveType.STRING;
        } else {
            throw new SyntaxException("Unknown type " + ctx.getText());
        }
        return t;
    }

    private BinaryPredicate.Operator getComparisionOperator(Token node) {
        switch (node.getType()) {
            case TernalParser.EQ:
                return BinaryPredicate.Operator.EQ;
            case TernalParser.NEQ:
                return BinaryPredicate.Operator.NEQ;
            case TernalParser.LT:
                return BinaryPredicate.Operator.LT;
            case TernalParser.LTE:
                return BinaryPredicate.Operator.LTE;
            case TernalParser.GT:
                return BinaryPredicate.Operator.GT;
            case TernalParser.GTE:
                return BinaryPredicate.Operator.GTE;
            case TernalParser.EQ_FOR_NULL:
                return BinaryPredicate.Operator.EQ_FOR_NULL;
        }

        throw new IllegalArgumentException("Unsupported operator: " + node.getText());
    }

    private BinaryArithmetic.Operator getArithmericOperator(Token node) {
        switch (node.getType()) {
            case TernalParser.PLUS_SYMBOL:
                return BinaryArithmetic.Operator.PLUS;
            case TernalParser.MINUS_SYMBOL:
                return BinaryArithmetic.Operator.MINUS;
            case TernalParser.SLASH_SYMBOL:
                return BinaryArithmetic.Operator.DIVIDE;
            case TernalParser.ASTERISK_SYMBOL:
                return BinaryArithmetic.Operator.MULTIPLY;
        }

        throw new IllegalArgumentException("Unsupported operator: " + node.getText());
    }

    private QualifiedName getQualifiedName(TernalParser.QualifiedNameContext context) {
        List<String> parts = visit(context.identifier(), Identifier.class).stream()
                .map(Identifier::getName)
                .collect(Collectors.toList());
        return QualifiedName.of(parts);
    }

    private JoinRelation.Type getType(TernalParser.JoinTypeContext joinType) {
        if (joinType.INNER() != null)
            return JoinRelation.Type.INNER;
        else if (joinType.LEFT() != null)
            return JoinRelation.Type.LEFT_OUTER;
        else if (joinType.RIGHT() != null)
            return JoinRelation.Type.RIGHT_OUTER;
        else if (joinType.CROSS() != null)
            return JoinRelation.Type.CROSS;
        else
            throw new SyntaxException("Unsupported join type " + joinType.getText());
    }

    private <T> List<T> visit(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        return contexts.stream()
                .map(this::visit)
                .map(clazz::cast)
                .collect(toList());
    }

    private <T> List<T> visitIfPresent(List<? extends ParserRuleContext> contexts, Class<T> clazz) {
        if (contexts != null && contexts.size() != 0) {
            return contexts.stream()
                    .map(this::visit)
                    .map(clazz::cast)
                    .collect(toList());
        } else {
            return null;
        }
    }

    private Node visitIfPresent(ParserRuleContext context) {
        if (context != null) {
            return visit(context);
        } else {
            return null;
        }
    }

}
