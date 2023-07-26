package woo.metadata;

import woo.sql.analyzer.Type;

/**
 * Created by wujianchao on 2022/12/23.
 */
public class Column {
    private String name;
    private Type type;

    public Column(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public static Column of(String name, Type type) {
        return new Column(name, type);
    }

}
