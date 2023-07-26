package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

import java.util.List;

/**
 * Created by wujianchao on 2022/11/24.
 */
public class QueryRelation extends Relation {

    private List<SortItem> orderBys;
    private LimitElement limit;

    public List<SortItem> getOrderBys() {
        return orderBys;
    }

    public void setOrderBys(List<SortItem> orderBys) {
        this.orderBys = orderBys;
    }

    public LimitElement getLimit() {
        return limit;
    }

    public void setLimit(LimitElement limit) {
        this.limit = limit;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitQueryRelation(this, context);
    }
}
