package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/9.
 */
public class JoinRelation extends Relation {

    public enum Type {
        INNER,
        LEFT_OUTER,
        RIGHT_OUTER,
        CROSS
    }

    private Relation left;
    private Relation right;
    private Expr criteria;
    private Type type;

    public Relation getLeft() {
        return left;
    }

    public void setLeft(Relation left) {
        this.left = left;
    }

    public Relation getRight() {
        return right;
    }

    public void setRight(Relation right) {
        this.right = right;
    }

    public Expr getCriteria() {
        return criteria;
    }

    public void setCriteria(Expr criteria) {
        this.criteria = criteria;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitJoinRelation(this, context);
    }
}
