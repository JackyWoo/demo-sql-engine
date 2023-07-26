package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/11/24.
 */
public class QueryStatement extends StatementBase {
    private QueryRelation queryRelation;

    public QueryStatement(QueryRelation queryRelation) {
        this.queryRelation = queryRelation;
    }

    public QueryRelation getQueryRelation() {
        return queryRelation;
    }

    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitQueryStatement(this, context);
    }
}
