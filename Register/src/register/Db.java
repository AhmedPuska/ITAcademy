package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Db {

    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/podaci", "root", "");
        return conn;
    }

    public void registration(String firstname, String lastname, String email, String password, String bday, char gender) throws SQLException {
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            conn.setAutoCommit(false);
            String query = "insert into registration values (null, '"
                    + firstname
                    + "', '" + lastname
                    + "', '" + email
                    + "', '" + password
                    + "', '" + bday
                    + "', '" + gender
                    + "')";
            st.execute(query);
            int answer = JOptionPane.showConfirmDialog(null, "Confirm", null, JOptionPane.YES_NO_OPTION);
            switch (answer) {
                case JOptionPane.YES_OPTION:
                    conn.commit();
                    break;
                case JOptionPane.NO_OPTION:
                    conn.rollback();
                    break;
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
