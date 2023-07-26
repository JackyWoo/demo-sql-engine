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

/**
 * Created by wujianchao on 2023/1/10.
 */
public class AstPrinter extends AstVisitor<Void, Integer> {

    private final int identFactor;

    public AstPrinter() {
        this.identFactor = 4;
    }

    public AstPrinter(int identFactor) {
        this.identFactor = identFactor;
    }

    public void print(Node node) {
        visit(node, 0);
    }

    protected void printName(Node node, Integer depth) {
        if (depth == null)
            depth = 0;
        assert depth >= 0;
        String out = " ".repeat(depth * identFactor) +
                node.getClass().getSimpleName();
        System.out.println(out);
    }

    public Void visitQueryStatement(QueryStatement node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitQueryStatement(node, depth);
    }

    public Void visitQueryRelation(QueryRelation node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitQueryRelation(node, depth);
    }

    public Void visitLimitElement(LimitElement node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitLimitElement(node, depth);
    }

    public Void visitSortItem(SortItem node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitSortItem(node, depth);
    }

    public Void visitSelectRelation(SelectRelation node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitSelectRelation(node, depth);
    }

    public Void visitExpr(Expr node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitExpr(node, depth);
    }

    public Void visitSelectList(SelectList node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitSelectList(node, depth);
    }

    public Void SelectListItem(SelectListItem node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.SelectListItem(node, depth);
    }

    public Void visitExprList(ExprList node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitExprList(node, depth);
    }

    public Void visitExistsPredicate(ExistsPredicate node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitExistsPredicate(node, depth);
    }

    public Void visitAggregateFunctionCall(AggregateFunctionCall node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitAggregateFunctionCall(node, depth);
    }

    public Void visitBinaryArithmetic(BinaryArithmetic node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitBinaryArithmetic(node, depth);
    }

    public Void visitBinaryPredicate(BinaryPredicate node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitBinaryPredicate(node, depth);
    }

    public Void visitBooleanLiteral(BooleanLiteral node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitBooleanLiteral(node, depth);
    }

    public Void visitCastExpr(CastExpr node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitCastExpr(node, depth);
    }

    public Void visitColumnRef(ColumnRef node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitColumnRef(node, depth);
    }

    public Void visitCompoundPredicate(CompoundPredicate node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitCompoundPredicate(node, depth);
    }

    public Void visitDateLiteral(DateLiteral node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitDateLiteral(node, depth);
    }

    public Void visitDoubleLiteral(DoubleLiteral node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitDoubleLiteral(node, depth);
    }

    public Void visitFunctionCall(FunctionCall node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitFunctionCall(node, depth);
    }

    public Void visitIdentifier(Identifier node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitIdentifier(node, depth);
    }

    public Void visitInPredicate(InPredicate node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitInPredicate(node, depth);
    }

    public Void visitIntLiteral(IntLiteral node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitIntLiteral(node, depth);
    }

    public Void visitIsNullExpr(IsNullExpr node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitIsNullExpr(node, depth);
    }

    public Void visitJoinRelation(JoinRelation node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitJoinRelation(node, depth);
    }

    public Void visitLiteral(Literal node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitLiteral(node, depth);
    }

    public Void visitNullLiteral(NullLiteral node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitNullLiteral(node, depth);
    }

    public Void visitPredicate(Predicate node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitPredicate(node, depth);
    }

    public Void visitRelation(Relation node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitRelation(node, depth);
    }

    public Void visitStatementBase(StatementBase node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitStatementBase(node, depth);
    }

    public Void visitStringLiteral(StringLiteral node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitStringLiteral(node, depth);
    }

    public Void visitSubquery(Subquery node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitSubquery(node, depth);
    }

    public Void visitSubqueryRelation(SubqueryRelation node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitSubqueryRelation(node, depth);
    }

    public Void visitTableRelation(TableRelation node, Integer depth) {
        printName(node, depth);
        depth++;
        return super.visitTableRelation(node, depth);
    }

}
