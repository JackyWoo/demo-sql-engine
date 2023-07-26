package woo.sql.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import woo.sql.analyzer.Node;

/**
 * Created by wujianchao on 2022/11/24.
 */
public class SqlParser {

    public Node parse(String sql) {
        TernalLexer lexer = new TernalLexer(new CaseInsensitiveStream(CharStreams.fromString(sql)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TernalParser parser = new TernalParser(tokens);
        TernalParser.SqlStatementsContext tree = parser.sqlStatements();

        return new AstBuilder().visitSingleStatement(tree.singleStatement(0));
    }

}
