package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.TableName;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class ColumnRef extends Expr{
    private String name;
    private TableName table;

    public ColumnRef(String name) {
        this.name = name;
    }

    public ColumnRef(String name, TableName table) {
        this.name = name;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableName getTable() {
        return table;
    }

    public void setTable(TableName table) {
        this.table = table;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitColumnRef(this, context);
    }
}
