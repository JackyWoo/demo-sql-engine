package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.TableName;

/**
 * Created by wujianchao on 2022/11/29.
 */
public class TableRelation extends Relation {
    private TableName name;

    public TableName getName() {
        return name;
    }

    public void setName(TableName name) {
        this.name = name;
    }

    public void setAlias(TableName alias) {
        this.alias = alias;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitTableRelation(this, context);
    }
}
