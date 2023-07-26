package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;

import java.util.List;

/**
 * Created by wujianchao on 2022/12/8.
 */
public class ExprList implements Node {
    private List<Expr> exprList;

    public ExprList(List<Expr> exprList) {
        this.exprList = exprList;
    }

    public List<Expr> getExprList() {
        return exprList;
    }

    public void setExprList(List<Expr> exprList) {
        this.exprList = exprList;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitExprList(this, context);
    }
}
