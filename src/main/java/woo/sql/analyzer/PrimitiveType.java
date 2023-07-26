package woo.sql.analyzer;

/**
 * Created by wujianchao on 2022/11/29.
 */
public enum PrimitiveType {
    BOOLEAN(Family.BOOLEAN, 1, ""),
    TINYINT(Family.INT, 1, ""),
    UNSIGNED_TINYINT(Family.INT, 1, ""),
    SMALLINT(Family.INT, 2, ""),
    UNSIGNED_SMALLINT(Family.INT, 2, ""),
    UNSIGNED_INT(Family.INT, 4, ""),
    INT(Family.INT, 4, ""),
    BIGINT(Family.INT, 8, ""),
    FLOAT(Family.FLOAT, 4, ""),
    DOUBLE(Family.FLOAT, 8, ""),
    DATE(Family.DATE, 8, ""),
    DATETIME(Family.DATE, 8, ""),
    TIME(Family.DATE, 8, ""),
    CHAR(Family.CHAR, 2, ""),
    STRING(Family.STRING, -1, ""),
    VOID(Family.VOID, 1, "");

    public enum Family {
        BOOLEAN,
        INT,
        FLOAT,
        DATE,
        STRING,
        VOID,
        CHAR
    };

    PrimitiveType(Family family, int size, String desc) {
        this.family = family;
        this.size = size;
        this.desc = desc;
    }

    private Family family;
    private int size;
    private String desc;


    public boolean isIntegerFamily() {
        return family == Family.INT;
    }

    public boolean isFloatFamily() {
        return family == Family.FLOAT;
    }

    public boolean isDateFamily() {
        return family == Family.DATE;
    }

    public boolean isAssignableFrom(PrimitiveType o) {
        if (this == o)
            return true;
        if (isIntegerFamily() && o.isIntegerFamily() && getSize() >= o.getSize()) {
            return true;
        }
        if (isFloatFamily() && o.isFloatFamily() && getSize() >= o.getSize()) {
            return true;
        }
        return false;
    }

    public boolean canCastTo(PrimitiveType o) {
        if (this == o)
            return true;
        if (isIntegerFamily() && o.isIntegerFamily()) {
            return true;
        }
        if (isFloatFamily() && o.isFloatFamily()) {
            return true;
        }
        return false;
    }


    public int getSize() {
        return size;
    }

    public String getDesc() {
        return desc;
    }
}
