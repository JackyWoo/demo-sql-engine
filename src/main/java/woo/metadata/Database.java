package woo.metadata;

import woo.sql.analyzer.TableName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class Database {
    private final String catalog;
    private final String name;
    private final Map<String, Table> tables;

    public Database(String catalog, String name) {
        this.catalog = catalog;
        this.name = name;
        this.tables = new HashMap<>();
    }

    public Database(String catalog, String name, Map<String, Table> tables) {
        this.catalog = catalog;
        this.name = name;
        this.tables = tables;
    }

    public void addTable(Table table) {
        tables.put(table.getName().getTbl(), table);
    }

    public Table getTable(String name) {
        return tables.get(name);
    }

    public Table getTable(TableName name) {
        return tables.get(name.getTbl());
    }

    public String getCatalog() {
        return catalog;
    }

    public String getName() {
        return name;
    }
}
