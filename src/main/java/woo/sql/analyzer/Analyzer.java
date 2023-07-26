package woo.sql.analyzer;

import woo.exec.Context;
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
 * Created by wujianchao on 2022/11/25.
 */
public class Analyzer {

    public void analyze(Node node, Context context) {
        new Visitor().analyze(node, context);
    }

    public String getDefaultCatalog() {
        return "default_catalog";
    }

    public String getDefaultDb() {
        return "default";
    }

    static class Visitor extends AstVisitor<Void, Context> {

        public Void analyze(Node node, Context context) {
            return visit(node, context);
        }

        public Void visitQueryStatement(QueryStatement node, Context context) {
//            return new QueryAnalyzer(context).analyze(node);
            return null;
        }
//
//        public Void visitQueryRelation(QueryRelation node, Context context) {
//            return super.visitQueryRelation(node, context);
//        }
//
//        public Void visitLimitElement(LimitElement node, Context context) {
//            return super.visitLimitElement(node, context);
//        }
//
//        public Void visitSortItem(SortItem node, Context context) {
//            return super.visitSortItem(node, context);
//        }
//
//        public Void visitSelectRelation(SelectRelation node, Context context) {
//            return super.visitSelectRelation(node, context);
//        }
//
//        public Void visitExpr(Expr node, Context context) {
//            return super.visitExpr(node, context);
//        }
//
//        public Void visitSelectList(SelectList node, Context context) {
//            return super.visitSelectList(node, context);
//        }
//
//        public Void SelectListItem(SelectListItem node, Context context) {
//            return super.SelectListItem(node, context);
//        }
//
//        public Void visitExprList(ExprList node, Context context) {
//            return super.visitExprList(node, context);
//        }
//
//        public Void visitExistsPredicate(ExistsPredicate node, Context context) {
//            return super.visitExistsPredicate(node, context);
//        }
//
//        public Void visitAggregateFunctionCall(AggregateFunctionCall node, Context context) {
//            return super.visitAggregateFunctionCall(node, context);
//        }
//
//        public Void visitBinaryArithmetic(BinaryArithmetic node, Context context) {
//            return super.visitBinaryArithmetic(node, context);
//        }
//
//        public Void visitBinaryPredicate(BinaryPredicate node, Context context) {
//            return super.visitBinaryPredicate(node, context);
//        }
//
//        public Void visitBooleanLiteral(BooleanLiteral node, Context context) {
//            return super.visitBooleanLiteral(node, context);
//        }
//
//        public Void visitCastExpr(CastExpr node, Context context) {
//            return super.visitCastExpr(node, context);
//        }
//
//        public Void visitColumnRef(ColumnRef node, Context context) {
//            return super.visitColumnRef(node, context);
//        }
//
//        public Void visitCompoundPredicate(CompoundPredicate node, Context context) {
//            return super.visitCompoundPredicate(node, context);
//        }
//
//        public Void visitDateLiteral(DateLiteral node, Context context) {
//            return super.visitDateLiteral(node, context);
//        }
//
//        public Void visitDoubleLiteral(DoubleLiteral node, Context context) {
//            return super.visitDoubleLiteral(node, context);
//        }
//
//        public Void visitFunctionCall(FunctionCall node, Context context) {
//            return super.visitFunctionCall(node, context);
//        }
//
//        public Void visitIdentifier(Identifier node, Context context) {
//            return super.visitIdentifier(node, context);
//        }
//
//        public Void visitInPredicate(InPredicate node, Context context) {
//            return super.visitInPredicate(node, context);
//        }
//
//        public Void visitIntLiteral(IntLiteral node, Context context) {
//            return super.visitIntLiteral(node, context);
//        }
//
//        public Void visitIsNullExpr(IsNullExpr node, Context context) {
//            return super.visitIsNullExpr(node, context);
//        }
//
//        public Void visitJoinRelation(JoinRelation node, Context context) {
//            return super.visitJoinRelation(node, context);
//        }
//
//        public Void visitLiteral(Literal node, Context context) {
//            return super.visitLiteral(node, context);
//        }
//
//        public Void visitNullLiteral(NullLiteral node, Context context) {
//            return super.visitNullLiteral(node, context);
//        }
//
//        public Void visitPredicate(Predicate node, Context context) {
//            return super.visitPredicate(node, context);
//        }
//
//        public Void visitRelation(Relation node, Context context) {
//            return super.visitRelation(node, context);
//        }
//
//        public Void visitStatementBase(StatementBase node, Context context) {
//            return super.visitStatementBase(node, context);
//        }
//
//        public Void visitStringLiteral(StringLiteral node, Context context) {
//            return super.visitStringLiteral(node, context);
//        }
//
//        public Void visitSubquery(Subquery node, Context context) {
//            return super.visitSubquery(node, context);
//        }
//
//        public Void visitSubqueryRelation(SubqueryRelation node, Context context) {
//            return super.visitSubqueryRelation(node, context);
//        }
//
//        public Void visitTableRelation(TableRelation node, Context context) {
//            return super.visitTableRelation(node, context);
//        }
    }

}
