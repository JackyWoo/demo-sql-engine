package woo.sql.ast;

import woo.sql.analyzer.AnalysisException;
import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;
import woo.sql.analyzer.RelationFields;
import woo.sql.analyzer.Scope;
import woo.sql.analyzer.TableName;

/**
 * Created by wujianchao on 2022/11/25.
 */
public abstract class Relation implements Node {
    private Scope scope;
    protected TableName alias;

    public Relation() {
    }

    public Scope getScope() {
        if (scope == null) {
            throw new AnalysisException("Scope is null");
        }
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public RelationFields getRelationFields() {
        return scope.getRelationFields();
    }

    public void setAlias(TableName alias) {
        this.alias = alias;
    }

    public TableName getAlias() {
        return alias;
    }

    public TableName getResolveTableName() {
        return alias;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitRelation(this, context);
    }

}