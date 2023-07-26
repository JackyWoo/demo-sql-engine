package woo.sql;

import woo.sql.analyzer.AstPrinter;
import woo.sql.analyzer.Node;
import woo.sql.ast.QueryStatement;
import woo.sql.parser.SqlParser;

/**
 * Created by wujianchao on 2022/11/23.
 */
public class Main {

    public static void main(String[] args) {
        String sql = "" +
                "select " +
                "      name, count(*) as cc " +
                "   from school.scores " +
                "   where " +
                "       grade > 1 and grade < 3 " +
                "   group by name " +
                "   having " +
                "       cc > 10 " +
                "order by cc desc " +
                "limit 10";
        Node tree = new SqlParser().parse(sql);
        System.out.println(tree instanceof QueryStatement);

        // print tree
        AstPrinter printer = new AstPrinter();
        printer.print(tree);


    }
}
