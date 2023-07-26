package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.SyntaxException;

import java.util.List;

/**
 * Not, And, OR expression
 *
 * Created by wujianchao on 2022/12/20.
 */
public class CompoundPredicate extends Predicate {

    public enum Operator {
        NOT,
        ADD,
        OR,
    }

    private Operator op;
    public CompoundPredicate(Operator op, List<Expr> operands) {
        this.op = op;
        if (op == Operator.NOT && operands.size() != 1) {
            throw new SyntaxException("Not can hive only one operand");
        }
        children.addAll(operands);
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitCompoundPredicate(this, context);
    }
}
