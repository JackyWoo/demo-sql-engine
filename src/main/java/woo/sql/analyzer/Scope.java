package woo.sql.analyzer;

/**
 * Created by wujianchao on 2022/11/25.
 */

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Scope represent the namespace used for resolved
 * scope include all fields in this namespace
 */
public class Scope {
    private Scope parent;
    private final RelationId relationId;
    private final RelationFields relationFields;
    private boolean isLambdaScope = false;

    public Scope(RelationId relationId, RelationFields relation) {
        this.relationId = relationId;
        this.relationFields = relation;
    }

    public Scope(Scope parent) {
        this.relationId = RelationId.anonymous();
        List<Field> fieldList = Lists.newArrayList();
        relationFields = new RelationFields(fieldList);
        this.parent = parent;
        isLambdaScope = true;
    }


    public RelationId getRelationId() {
        return relationId;
    }

    public boolean isLambdaScope() {
        return isLambdaScope;
    }

    public RelationFields getRelationFields() {
        return relationFields;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }
}
