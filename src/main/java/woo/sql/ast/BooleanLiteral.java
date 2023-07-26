package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class BooleanLiteral extends Literal{
    private boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        return value ? "TRUE" : "FALSE";
    }

    @Override
    public long getLongValue() {
        return value ? 1 : 0;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitBooleanLiteral(this, context);
    }
}
