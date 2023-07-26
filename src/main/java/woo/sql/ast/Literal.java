package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class Literal extends Expr {

    public long getLongValue() {
        return 0;
    }

    public String getStringValue() {
        return "";
    }

    public double getDoubleValue() {
        return 0D;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitLiteral(this, context);
    }
}
