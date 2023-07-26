package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.PrimitiveType;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class CastExpr extends Expr{
    private PrimitiveType toType;
    public CastExpr(Expr expr, PrimitiveType type) {
        children.add(expr);
        this.toType = type;
    }


    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitCastExpr(this, context);
    }
}
