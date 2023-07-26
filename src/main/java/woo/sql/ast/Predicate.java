package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.PrimitiveType;

/**
 * Created by wujianchao on 2022/12/20.
 */
public class Predicate extends Expr {
    public Predicate() {
        type = PrimitiveType.BOOLEAN;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitPredicate(this, context);
    }
}
