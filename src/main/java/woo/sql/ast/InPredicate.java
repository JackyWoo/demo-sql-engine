package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

import java.util.List;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class InPredicate extends Predicate {
    private boolean isNot;

    public InPredicate(boolean isNot, Expr value, List<Expr> inList) {
        this.isNot = isNot;
        children.add(value);
        children.addAll(inList);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitInPredicate(this, context);
    }
}
