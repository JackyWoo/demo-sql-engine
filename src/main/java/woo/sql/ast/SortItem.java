package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;

/**
 * Created by wujianchao on 2022/12/8.
 */
public class SortItem implements Node {

    public enum Order {
        ASC,
        DESC
    }

    public enum NullOrdering {
        FIRST,
        LAST
    }

    private Expr expr;
    private Order order;
    private NullOrdering nullOrdering;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public NullOrdering getNullOrdering() {
        return nullOrdering;
    }

    public void setNullOrdering(NullOrdering nullOrdering) {
        this.nullOrdering = nullOrdering;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitSortItem(this, context);
    }
}
