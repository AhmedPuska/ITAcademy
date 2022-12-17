package entitiy;

//import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataProvider {

    private Connection conn = null;

    public void getConnection() throws SQLException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + Config.dbhost + "/" + Config.dbname, Config.dbuser, Config.dbpass);
        } catch (SQLException ex) {

        } finally {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL("jdbc:mysql://localhost");
        ds.setDatabaseName("travel");
        ds.setUser("root");
        ds.setPassword("");
        Connection conn = ds.getConnection();

        System.out.println(!conn.isClosed() ? "Successfully connected to database" : "Failed to connect");

        conn.close();
    }
}
