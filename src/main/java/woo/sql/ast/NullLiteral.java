package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class NullLiteral extends Literal{

    @Override
    public String getStringValue() {
        return "Null";
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitNullLiteral(this, context);
    }

}
