package woo.calculator.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by wujianchao on 2022/11/21.
 */
public class CalParser {
    private final CalVisitor visitor = new CalVisitor();

    public int parse(String statement) {

        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.prog();

        return visitor.visit(tree);
    }
}
