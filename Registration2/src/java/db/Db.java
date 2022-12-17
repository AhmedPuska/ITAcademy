package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db {

    public void registration(String firstname, String lastname, String email, String password, String bday, char gender) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + Config.dbhost + "/" + Config.dbname, Config.dbuser, Config.dbpass);
            Statement st = conn.createStatement();
            String query = "insert into registration values (null, '"
                    + firstname
                    + "', '" + lastname
                    + "', '" + email
                    + "', '" + password
                    + "', '" + bday
                    + "', '" + gender
                    + "')";
            st.execute(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
