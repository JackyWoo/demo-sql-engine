package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class IntLiteral extends Literal{

    private int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    @Override
    public long getLongValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        return String.valueOf(value);
    }

    @Override
    public double getDoubleValue() {
        return value;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitIntLiteral(this, context);
    }
}
