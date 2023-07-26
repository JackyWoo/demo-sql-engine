package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;

/**
 * Created by wujianchao on 2022/12/9.
 */
public class Identifier implements Node {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitIdentifier(this, context);
    }
}
