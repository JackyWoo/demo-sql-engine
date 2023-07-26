package woo.calculator.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by wujianchao on 2022/11/21.
 */
public class CalVisitor extends CalculatorBaseVisitor<Integer> {

    Map<String, Integer> cache = new HashMap<>();

    @Override
    public Integer visitProg(CalculatorParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }


    @Override
    public Integer visitExpression(CalculatorParser.ExpressionContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
        String id = ctx.VAR().getText();
        if (!cache.containsKey(id))
            cache.put(id, visit(ctx.expr()));
        return cache.get(id);
    }

    @Override
    public Integer visitBlank(CalculatorParser.BlankContext ctx) {
        return 0;
    }

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        if (Objects.equals(ctx.op.getText(), "*")) {
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(0)) / visit(ctx.expr(1));
        }
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        if (Objects.equals(ctx.op.getText(), "+")) {
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(0)) - visit(ctx.expr(1));
        }
    }

    @Override
    public Integer visitLiteral(CalculatorParser.LiteralContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitVariable(CalculatorParser.VariableContext ctx) {
        return cache.getOrDefault(ctx.getText(), 0);
    }

    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
