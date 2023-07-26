package woo.metadata;

import woo.sql.analyzer.TableName;
import woo.sql.analyzer.Type;

/**
 * Created by wujianchao on 2022/12/23.
 */
public class MetaDataMgr {
    private Catalog catalog;
    private static MetaDataMgr INSTANCE;
    public static MetaDataMgr instance() {
        if (INSTANCE == null) {
            synchronized (MetaDataMgr.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MetaDataMgr();
                }
            }
        }

        return INSTANCE;
    }

    static {
        // register metadata
        instance().catalog = new Catalog("default");

        Database db = new Database("default", "school");
        INSTANCE.catalog.addDatabase(db);

        Column[] columns = {
                Column.of("name", Type.STRING),
                Column.of("grade", Type.INT),
                Column.of("course", Type.STRING),
                Column.of("score", Type.INT),
        };

        Table table = new Table(TableName.of("default", "school", "scores"), columns);
        db.addTable(table);
    }

    public Database getDatabase(String name) {
        return instance().catalog.getDatabase(name);
    }

    public Table getTable(TableName name) {
        if (instance().catalog.getDatabase(name.getDb()) == null)
            return null;
        return instance().catalog.getDatabase(name.getDb()).getTable(name);
    }
}
