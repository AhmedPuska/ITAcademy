package registerfx1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

    Model model;

    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/podaci", "root", "");
        return conn;
    }

    public void registration(String firstname, String lastname, String email, String password, Object bday, Object gender) throws SQLException {
        try {
            Connection conn = getConnection();
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
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
