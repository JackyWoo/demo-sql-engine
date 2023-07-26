package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.TableName;

/**
 * Created by wujianchao on 2022/12/9.
 */
public class SubqueryRelation extends Relation {
    private QueryRelation queryRelation;

    public QueryRelation getQueryRelation() {
        return queryRelation;
    }

    public void setQueryRelation(QueryRelation queryRelation) {
        this.queryRelation = queryRelation;
    }

    public void setAlias(TableName alias) {
        this.alias = alias;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitSubqueryRelation(this, context);
    }
}
