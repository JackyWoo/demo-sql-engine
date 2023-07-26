package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.SyntaxException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class DateLiteral extends Literal{
    private Date value;
    boolean withTime;

    public DateLiteral(String value, boolean withTime) {
        SimpleDateFormat format = new SimpleDateFormat(withTime ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd");
        try {
            this.value = format.parse(value);
        } catch (ParseException e) {
            throw new SyntaxException("Illegal date format");
        }
    }

    public Date getValue() {
        return value;
    }

    @Override
    public String getStringValue() {
        return value.toString();
    }

    @Override
    public long getLongValue() {
        return value.getTime();
    }

    @Override
    public double getDoubleValue() {
        return value.getTime();
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitDateLiteral(this, context);
    }
}
