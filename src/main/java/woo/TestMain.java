package woo;

import com.clickhouse.client.ClickHouseClient;
import com.clickhouse.client.ClickHouseException;
import com.clickhouse.client.ClickHouseNode;
import com.clickhouse.client.ClickHouseProtocol;
import com.clickhouse.client.ClickHouseResponse;
import com.clickhouse.client.config.ClickHouseClientOption;
import com.clickhouse.client.http.config.ClickHouseHttpOption;
import com.clickhouse.client.http.config.HttpConnectionProvider;
import com.clickhouse.data.ClickHouseRecord;
import com.clickhouse.jdbc.ClickHouseConnection;
import com.clickhouse.jdbc.ClickHouseDriver;
import com.clickhouse.jdbc.ClickHouseStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by wujianchao on 2022/12/13.
 */
public class TestMain {
    // driver/client localhost:8123
    public static void main(String[] args) throws SQLException, ClickHouseException {
        System.out.println("Usage : driver/client localhost:8123");

        String address = args.length == 2 ? args[1] : "localhost:8123";
        String pwd = address.contains("localhost") ? "" : "NTliOGQ3YjRiY2MyNTc4";

        if (args.length > 0 && args[0].equals("client"))
            byClient(address, pwd);
        else
            byDriver(address, pwd);
    }

    private static void byDriver(String address, String pwd) throws SQLException {
        ClickHouseDriver driver = new ClickHouseDriver();
        Properties properties = new Properties();
        //        properties.setProperty("http_connection_provider", HttpConnectionProvider.APACHE_HTTP_CLIENT.name());
        properties.setProperty(ClickHouseHttpOption.CONNECTION_PROVIDER.getKey(), HttpConnectionProvider.APACHE_HTTP_CLIENT.name());
        properties.setProperty("socket_ip_tos", "144");
        System.out.println("Will set IP DSCP to 144");
        properties.setProperty("user", "default");
        properties.setProperty("password", pwd);
        System.out.println("Use http provider " + properties.getProperty("http_connection_provider"));
        ClickHouseConnection conn = driver.connect("jdbc:clickhouse:http://" + address, properties);
        ClickHouseStatement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select 1");
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }
        conn.close();
        statement.close();
        rs.close();
    }

    private static void byClient(String address, String pwd) throws ClickHouseException {
        ClickHouseNode endpoint = ClickHouseNode.of("http://" + address);
        try (ClickHouseClient client = ClickHouseClient.newInstance(ClickHouseProtocol.HTTP);
                ClickHouseResponse response = client.connect(endpoint) // or client.connect(endpoints)
                        // you'll have to parse response manually if using a different format
//                        .format(ClickHouseFormat.RowBinaryWithNamesAndTypes)
                        .option(ClickHouseHttpOption.CONNECTION_PROVIDER, HttpConnectionProvider.APACHE_HTTP_CLIENT)
                        .option(ClickHouseClientOption.SOCKET_IP_TOS, 144)
                        .query("select 1)")
                        .executeAndWait()) {
            // or response.stream() if you prefer stream API
            for (ClickHouseRecord r : response.records()) {
                int num = r.getValue(0).asInteger();
                System.out.println(num);
            }
        }
    }
}
