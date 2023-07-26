package woo.sql.ast;

import woo.sql.analyzer.Analyzer;
import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;
import woo.sql.analyzer.PrimitiveType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujianchao on 2022/11/25.
 */
public class Expr implements Node {
    protected PrimitiveType type;
    protected List<Expr> children;

    public Expr(){
        children = new ArrayList<>();
    }

    public void analyze(Analyzer analyzer) {
//        analyzer.analyze(this);
    }

    public PrimitiveType getType() {
        return type;
    }

    public void setType(PrimitiveType type) {
        this.type = type;
    }

    public List<Expr> getChildren() {
        return children;
    }

    public void setChildren(List<Expr> children) {
        this.children = children;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitExpr(this, context);
    }
}
