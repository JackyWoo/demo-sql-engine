package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

import java.util.List;

/**
 * querySpecification
 *
 * Created by wujianchao on 2022/11/25.
 */
public class SelectRelation extends QueryRelation {

    private SelectList selectList;
    /**
     * Relations referenced in From clause. The Relation can be a CTE/table
     * reference a subquery or two relation joined together.
     */
    private Relation relation;
    /**
     * Output field expr such in `as k + 1 as col1` col1 is the output field.
     */
    private List<Expr> outputExpr;

    private Expr predicate;
    private ExprList groupBy;
    private Expr having;

    public SelectList getSelectList() {
        return selectList;
    }

    public void setSelectList(SelectList selectList) {
        this.selectList = selectList;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public List<Expr> getOutputExpr() {
        return outputExpr;
    }

    public void setOutputExpr(List<Expr> outputExpr) {
        this.outputExpr = outputExpr;
    }

    public Expr getPredicate() {
        return predicate;
    }

    public void setPredicate(Expr predicate) {
        this.predicate = predicate;
    }

    public ExprList getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(ExprList groupBy) {
        this.groupBy = groupBy;
    }

    public Expr getHaving() {
        return having;
    }

    public void setHaving(Expr having) {
        this.having = having;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitSelectRelation(this, context);
    }
}
