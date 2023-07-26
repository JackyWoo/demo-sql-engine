package woo.metadata;

import woo.sql.analyzer.TableName;

import java.util.Map;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class Table {

    private TableName name;
    private Column[] columns;
    private Map<String, Column> columnMap;

    public Table(TableName name, Column[] columns) {
        this.name = name;
        this.columns = columns;
        for (Column col : columns) {
            columnMap.put(col.getName(), col);
        }
    }

    public TableName getName() {
        return name;
    }

    public Column[] getColumns() {
        return columns;
    }

    public Column getColumn(String name) {
        return columnMap.get(name);
    }

    public Column getColumn(int idx) {
        return columns[idx];
    }


}
