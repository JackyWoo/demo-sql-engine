package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class ExistsPredicate extends Predicate {
    public ExistsPredicate(Subquery subquery) {
        children.add(subquery);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitExistsPredicate(this, context);
    }
}
