package woo.sql.analyzer;

import woo.sql.ast.AggregateFunctionCall;
import woo.sql.ast.BinaryArithmetic;
import woo.sql.ast.BinaryPredicate;
import woo.sql.ast.BooleanLiteral;
import woo.sql.ast.CastExpr;
import woo.sql.ast.ColumnRef;
import woo.sql.ast.CompoundPredicate;
import woo.sql.ast.DateLiteral;
import woo.sql.ast.DoubleLiteral;
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
import woo.sql.ast.Literal;
import woo.sql.ast.NullLiteral;
import woo.sql.ast.Predicate;
import woo.sql.ast.QueryRelation;
import woo.sql.ast.QueryStatement;
import woo.sql.ast.Relation;
import woo.sql.ast.SelectList;
import woo.sql.ast.SelectListItem;
import woo.sql.ast.SelectRelation;
import woo.sql.ast.SortItem;
import woo.sql.ast.StatementBase;
import woo.sql.ast.StringLiteral;
import woo.sql.ast.Subquery;
import woo.sql.ast.SubqueryRelation;
import woo.sql.ast.TableRelation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujianchao on 2022/11/23.
 */
public abstract class AstVisitor<R, C> {

    public R visit(Node node, C context) {
        return node.accept(this, context);
    }

    protected R visitTerminalNode(Node node, C context) {
        return null;
    }

    protected R defaultResult() {
        return null;
    }

    /**
     * Visit children for expr who has `getChildren` method
     */
    protected R visitChildren(Expr expr, C context) {
        R result = defaultResult();
        int n = expr.getChildren().size();
        for (Expr child : expr.getChildren()) {
            if (!shouldVisitNextChild(child, result)) {
                break;
            }
            R childResult = child.accept(this, context);
            result = aggregateResult(result, childResult);
        }
        return result;
    }

    /**
     * Visit children for other node types
     */
    protected R visitChildren(List<Node> children, C context) {
        R result = defaultResult();
        for (Node node : children) {
            if (!shouldVisitNextChild(node, result)) {
                break;
            }
            R childResult = node.accept(this, context);
            result = aggregateResult(result, childResult);
        }
        return result;
    }

    protected R aggregateResult(R result, R nextResult) {
        return nextResult;
    }

    protected boolean shouldVisitNextChild(Node child, R result) {
        return true;
    }

    /*------------------------------- visit nodes ------------------------------------*/

    public R visitQueryStatement(QueryStatement node, C context) {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(node.getQueryRelation());
        return visitChildren(nodeList, context);
    }

    public R visitQueryRelation(QueryRelation node, C context) {
        List<Node> nodeList = new ArrayList<>();
        if (node.getOrderBys() != null && !node.getOrderBys().isEmpty())
            nodeList.addAll(node.getOrderBys());
        if (node.getLimit() != null)
            nodeList.add(node.getLimit());
        return visitChildren(nodeList, context);
    }

    public R visitLimitElement(LimitElement node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitSortItem(SortItem node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitSelectRelation(SelectRelation node, C context) {
        List<Node> nodeList = new ArrayList<>();
        if (node.getRelation() != null)
            nodeList.add(node.getRelation());
        if (node.getPredicate() != null)
            nodeList.add(node.getPredicate());
        if (node.getGroupBy() != null) {
            nodeList.add(node.getGroupBy());
        }
        if (node.getHaving() != null) {
            nodeList.add(node.getHaving());
        }
        nodeList.add(node.getSelectList());
        if (node.getOrderBys() != null && !node.getOrderBys().isEmpty())
            nodeList.addAll(node.getOrderBys());
        if (node.getLimit() != null)
            nodeList.add(node.getLimit());
        return visitChildren(nodeList, context);
    }

    public R visitExpr(Expr node, C context) {
        return visitChildren(node, context);
    }

    public R visitSelectList(SelectList node, C context) {
        List<Node> nodeList = new ArrayList<>(node.getItemList());
        return visitChildren(nodeList, context);
    }

    public R SelectListItem(SelectListItem node, C context) {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(node.getExpr());
        return visitChildren(nodeList, context);
    }

    public R visitExprList(ExprList node, C context) {
        List<Node> nodeList = new ArrayList<>(node.getExprList());
        return visitChildren(nodeList, context);
    }

    public R visitExistsPredicate(ExistsPredicate node, C context) {
        return visitChildren(node, context);
    }

    public R visitAggregateFunctionCall(AggregateFunctionCall node, C context) {
        return visitChildren(node, context);
    }

    public R visitBinaryArithmetic(BinaryArithmetic node, C context) {
        return visitChildren(node, context);
    }

    public R visitBinaryPredicate(BinaryPredicate node, C context) {
        return visitChildren(node, context);
    }

    public R visitBooleanLiteral(BooleanLiteral node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitCastExpr(CastExpr node, C context) {
        return visitChildren(node, context);
    }

    public R visitColumnRef(ColumnRef node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitCompoundPredicate(CompoundPredicate node, C context) {
        return visitChildren(node, context);
    }

    public R visitDateLiteral(DateLiteral node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitDoubleLiteral(DoubleLiteral node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitFunctionCall(FunctionCall node, C context) {
        return visitChildren(node, context);
    }

    public R visitIdentifier(Identifier node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitInPredicate(InPredicate node, C context) {
        return visitChildren(node, context);
    }

    public R visitIntLiteral(IntLiteral node, C context) {
        return visitChildren(node, context);
    }

    public R visitIsNullExpr(IsNullExpr node, C context) {
        return visitChildren(node, context);
    }

    public R visitJoinRelation(JoinRelation node, C context) {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(node.getLeft());
        nodeList.add(node.getRight());
        nodeList.add(node.getCriteria());
        return visitChildren(nodeList, context);
    }

    public R visitLiteral(Literal node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitNullLiteral(NullLiteral node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitPredicate(Predicate node, C context) {
        return visitChildren(node, context);
    }

    public R visitRelation(Relation node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitStatementBase(StatementBase node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitStringLiteral(StringLiteral node, C context) {
        return visitTerminalNode(node, context);
    }

    public R visitSubquery(Subquery node, C context) {
        return visitChildren(node, context);
    }

    public R visitSubqueryRelation(SubqueryRelation node, C context) {
        List<Node> nodeList = new ArrayList<>();
        return visitChildren(nodeList, context);
    }

    public R visitTableRelation(TableRelation node, C context) {
        return visitTerminalNode(node, context);
    }

}
