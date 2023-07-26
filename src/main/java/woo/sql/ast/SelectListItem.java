package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;
import woo.sql.analyzer.TableName;

/**
 * Created by wujianchao on 2022/11/25.
 */
public class SelectListItem implements Node {
    /**
     * select col as alia
     */
    private Expr expr;
    private String alias;

    /**
     * select * or select table.*
     */
    private boolean isStar;
    private TableName tableName;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isStar() {
        return isStar;
    }

    public void setStar(boolean star) {
        isStar = star;
    }

    public TableName getTableName() {
        return tableName;
    }

    public void setTableName(TableName tableName) {
        this.tableName = tableName;
    }

    public boolean isSingleIterm() {
        return isStar;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.SelectListItem(this, context);
    }
}
