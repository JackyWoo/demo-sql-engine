package woo.sql.analyzer;

import woo.sql.analyzer.AstVisitor;

/**
 * Created by wujianchao on 2022/11/23.
 */
public interface Node {

    default <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        throw new RuntimeException("Not implement accept function");
    }
}
