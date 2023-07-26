package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class StringLiteral extends Literal{
    private final String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        return value;
    }

    @Override
    public long getLongValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getDoubleValue() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitStringLiteral(this, context);
    }
}
