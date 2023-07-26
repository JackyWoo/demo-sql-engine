package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class IsNullExpr extends Expr {
    private boolean isNotNull;

    public IsNullExpr(Expr child) {
        this.children.add(child);
    }

    public IsNullExpr(boolean isNotNull, Expr child) {
        this.isNotNull = isNotNull;
        this.children.add(child);
    }

    public boolean isNotNull() {
        return isNotNull;
    }

    public void setNotNull(boolean notNull) {
        isNotNull = notNull;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitIsNullExpr(this, context);
    }
}
