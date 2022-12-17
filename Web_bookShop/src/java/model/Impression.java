package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Impression {
    private int id;
    private String username;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public static String allImpression() throws ClassNotFoundException, SQLException {
        
        StringBuilder all_impressions = new StringBuilder();
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/guestbook", "root", "");) {
            
            Statement st = conn.createStatement();
            st.executeQuery("select username, text from impression");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                
                all_impressions.append(rs.getString("username"));
                all_impressions.append(": ");
                all_impressions.append(rs.getString("text"));
                all_impressions.append("\n");
            }
        } catch (SQLException ex) {
            all_impressions.append(ex. getMessage());
        }
        return all_impressions.toString();
    }
    
    public void insertImpression() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/guestbook", "root", "");) {
            
            if (username != null && !(username.isEmpty()) && text != null && !(text.isEmpty())) {
                Statement st = conn.createStatement();
                st.execute("insert into impression (username, text) values ('" + username + "', '" + text + "')");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
    
    public void removeImpression() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/guestbook", "root", "");) {
            
            Statement st = conn.createStatement();
            st.execute("delete from impression where username = '" + username + "'");
            
        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
}