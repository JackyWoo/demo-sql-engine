package woo.sql.analyzer;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;

import java.util.List;
import java.util.Objects;

/**
 * Created by wujianchao on 2022/11/25.
 */
public class TableName {
    private String catalog;
    private String tbl;
    private String db;
    private String fullDb;

    public TableName() {

    }

    public TableName(String tbl) {
        this(null, null, tbl);
    }

    public TableName(String db, String tbl) {
        this(null, db, tbl);
    }

    public TableName(String catalog, String db, String tbl) {
        this.catalog = catalog;
        this.db = db;
        this.tbl = tbl;
    }

    public void analyze(Analyzer analyzer) throws AnalysisException {
        if (Strings.isNullOrEmpty(catalog)) {
            catalog = analyzer.getDefaultCatalog();
        }

        if (Strings.isNullOrEmpty(db)) {
            db = analyzer.getDefaultDb();
        }

        if (Strings.isNullOrEmpty(tbl)) {
            throw new AnalysisException("Table name is null");
        }
    }

    public void normalization() {
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getTbl() {
        return tbl;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    // for rename table
    public void setTbl(String tbl) {
        this.tbl = tbl;
    }

    public boolean isEmpty() {
        return tbl.isEmpty();
    }

    public String getCatalogAndDb() {
        return Joiner.on(".").skipNulls().join(catalog, db);
    }

    /**
     * Returns true if this name has a non-empty database field and a non-empty
     * table name.
     */
    public boolean isFullyQualified() {
        return db != null && !db.isEmpty() && !tbl.isEmpty();
    }

    public String getNoClusterString() {
        if (db == null) {
            return tbl;
        } else {
            return db + "." + tbl;
        }
    }

    @Override
    public String toString() {
        if (db == null) {
            return tbl;
        } else {
            return db + "." + tbl;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof TableName) {
            return toString().equals(other.toString());
        }
        return false;
    }

    public String toSql() {
        StringBuilder stringBuilder = new StringBuilder();
        if (db != null) {
            stringBuilder.append("`").append(db).append("`.");
        }
        stringBuilder.append("`").append(tbl).append("`");
        return stringBuilder.toString();
    }

    public static TableName of(String catalog, String db, String tbl) {
        return new TableName(catalog, db, tbl);
    }

    public static TableName parseFrom(String input) {
        Objects.requireNonNull(input, "input");
        String[] parts = input.split(".");
        if (parts.length > 3)
            throw new IllegalArgumentException("Invalid table name");
        TableName tableName = new TableName();
        if (parts.length >= 1) {
            tableName.setTbl(parts[parts.length - 1]);
        }
        if (parts.length >= 2) {
            tableName.setDb(parts[parts.length - 2]);
        }
        if (parts.length == 3) {
            tableName.setCatalog(parts[parts.length - 3]);
        }
        return tableName;
    }

    public static TableName parseFrom(QualifiedName name) {
        Objects.requireNonNull(name, "name");
        List<String> parts = name.getParts();
        if (parts.size() > 3)
            throw new IllegalArgumentException("Invalid table name");
        TableName tableName = new TableName();
        if (parts.size() >= 1) {
            tableName.setTbl(parts.get(parts.size() - 1));
        }
        if (parts.size() >= 2) {
            tableName.setDb(parts.get(parts.size() - 2));
        }
        if (parts.size() == 3) {
            tableName.setCatalog(parts.get(0));
        }
        return tableName;
    }

    public static TableName parseFrom(List<String> name) {
        Objects.requireNonNull(name, "name");
        List<String> parts = name;
        if (parts.size() > 3)
            throw new IllegalArgumentException("Invalid table name");
        TableName tableName = new TableName();
        if (parts.size() >= 1) {
            tableName.setTbl(parts.get(parts.size() - 1));
        }
        if (parts.size() >= 2) {
            tableName.setDb(parts.get(parts.size() - 2));
        }
        if (parts.size() == 3) {
            tableName.setCatalog(parts.get(0));
        }
        return tableName;
    }

}
