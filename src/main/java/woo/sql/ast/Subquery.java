package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class Subquery extends Expr{
    private QueryRelation queryRelation;

    public Subquery(QueryRelation queryRelation) {
        this.queryRelation = queryRelation;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitSubquery(this, context);
    }


}
