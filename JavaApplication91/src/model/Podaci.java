package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Podaci {
    public static Connection conn() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/users","root","");
    }
    public static boolean login(String username, String password){
        boolean rezultat = false;
        Connection conn = null;
        try {
            conn = conn();
            PreparedStatement st = conn.prepareStatement("select * from users where username = ? and password = md5(?)");
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            rezultat = rs.next();
            
        } catch (SQLException ex) {
            
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return rezultat;
    }
}
