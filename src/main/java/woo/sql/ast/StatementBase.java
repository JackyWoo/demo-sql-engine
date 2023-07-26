package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;

/**
 * Created by wujianchao on 2022/11/24.
 */
public class StatementBase implements Node {
    public String originStmt;

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitStatementBase(this, context);
    }
}
