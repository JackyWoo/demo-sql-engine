package woo.sql.analyzer;

/**
 * Created by wujianchao on 2022/12/23.
 */
public class Type {
    public static Type BOOLEAN = new Type(PrimitiveType.BOOLEAN);
    public static Type TINYINT = new Type(PrimitiveType.TINYINT);
    public static Type UNSIGNED_TINYINT = new Type(PrimitiveType.UNSIGNED_TINYINT);
    public static Type SMALLINT = new Type(PrimitiveType.SMALLINT);
    public static Type UNSIGNED_SMALLINT = new Type(PrimitiveType.UNSIGNED_SMALLINT);
    public static Type UNSIGNED_INT = new Type(PrimitiveType.UNSIGNED_INT);
    public static Type INT = new Type(PrimitiveType.INT);
    public static Type BIGINT = new Type(PrimitiveType.BIGINT);
    public static Type FLOAT = new Type(PrimitiveType.FLOAT);
    public static Type DOUBLE = new Type(PrimitiveType.DOUBLE);
    public static Type DATE = new Type(PrimitiveType.DATE);
    public static Type DATETIME = new Type(PrimitiveType.DATETIME);
    public static Type TIME = new Type(PrimitiveType.TIME);
    public static Type CHAR = new Type(PrimitiveType.CHAR);
    public static Type STRING = new Type(PrimitiveType.STRING);
    public static Type VOID = new Type(PrimitiveType.VOID);

    private PrimitiveType type;

    public Type(PrimitiveType type) {
        this.type = type;
    }

    public boolean isAssignableFrom(Type o) {
        return type.isAssignableFrom(o.getType());
    }

    public boolean canCastTo(Type o) {
        return type.canCastTo(o.getType());
    }

    public boolean identical(Type o) {
        return getType() == o.getType();
    }

    public PrimitiveType getType() {
        return type;
    }
}
