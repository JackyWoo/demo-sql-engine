package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;

/**
 * Created by wujianchao on 2022/11/25.
 */
public class LimitElement implements Node {
    private int limit;
    private int offset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitLimitElement(this, context);
    }
}
