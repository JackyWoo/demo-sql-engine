package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;

import java.util.List;

/**
 * Created by wujianchao on 2022/12/21.
 */
public class AggregateFunctionCall extends FunctionCall {

    public AggregateFunctionCall(String name, List<Expr> argus) {
        super(name, argus);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitAggregateFunctionCall(this, context);
    }
}
