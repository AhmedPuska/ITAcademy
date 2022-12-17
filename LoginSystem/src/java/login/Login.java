package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.UUID;
import redis.clients.jedis.Jedis;

public class Login {
    
    public static void main(String[] args) {
        System.out.println(login("ahmed", "ahmed"));
    }
    
    public static String login(String username, String password) {
        
        String token = "";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/users", "root", "");
            ResultSet rs = conn.createStatement().executeQuery("select * from user where username = '" + username + "' and password = '" + password + "'");
            if (rs.next()) {
                int userid = rs.getInt("id");
                String usrname = rs.getString("username");
                token = UUID.randomUUID().toString();
                
                Jedis redis = new Jedis("localhost");
                redis.set(token, userid + "|" + usrname);
                redis.expire(token, 30);
                
                
            } else {
                
            }
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return token;
    }
}