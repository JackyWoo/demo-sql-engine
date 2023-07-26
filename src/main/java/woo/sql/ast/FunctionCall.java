package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

import java.util.List;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class FunctionCall extends Expr {
    private String name;

    public FunctionCall(String name, List<Expr> argus) {
        this.name = name;
        this.children.addAll(argus);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitFunctionCall(this, context);
    }
}
