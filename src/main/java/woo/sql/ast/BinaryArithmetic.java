package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class BinaryArithmetic extends Expr {

    public enum Operator {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE
    }

    private Operator op;

    public BinaryArithmetic(Operator op, Expr left, Expr right) {
        this.op = op;
        this.children.add(left);
        this.children.add(right);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitBinaryArithmetic(this, context);
    }
}
