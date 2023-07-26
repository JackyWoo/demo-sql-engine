package woo.metadata;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class Catalog {
    private final String name;
    private final Map<String, Database> databases;

    public Catalog(String name) {
        this.name = name;
        this.databases = new HashMap<>();
    }
    public Catalog(String name, Map<String, Database> databases) {
        this.name = name;
        this.databases = databases;
    }

    public String getName() {
        return name;
    }

    public Map<String, Database> getDatabases() {
        return databases;
    }

    public Database getDatabase(String name) {
        return databases.get(name);
    }

    public void addDatabase(Database database) {
        databases.put(database.getName(), database);
    }
}
