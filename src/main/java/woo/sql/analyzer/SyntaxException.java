package woo.sql.analyzer;

/**
 * Created by wujianchao on 2022/12/9.
 */
public class SyntaxException extends RuntimeException {

    public SyntaxException(String msg) {
        super(msg);
    }
}
