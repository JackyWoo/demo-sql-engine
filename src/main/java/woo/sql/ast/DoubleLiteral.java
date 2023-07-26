package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class DoubleLiteral extends Literal {
    private double value;

    public DoubleLiteral(double value) {
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        return Double.toString(value);
    }

    @Override
    public long getLongValue() {
        return (long) value;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitDoubleLiteral(this, context);
    }
}
