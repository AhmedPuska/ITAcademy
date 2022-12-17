package entitiy;

//import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataProvider {

    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + Config.dbhost + "/" + Config.dbname, Config.dbuser, Config.dbpass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

}
