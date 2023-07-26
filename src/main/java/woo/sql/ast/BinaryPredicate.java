package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class BinaryPredicate extends Predicate {
    public enum Operator {
        EQ,
        NEQ,
        LT,
        LTE,
        GT,
        GTE,
        EQ_FOR_NULL,
    }

    private Operator op;

    public BinaryPredicate(Operator op, Expr left, Expr right) {
        this.op = op;
        this.children.add(left);
        this.children.add(right);
    }

    public Operator getOp() {
        return op;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitBinaryPredicate(this, context);
    }
}
