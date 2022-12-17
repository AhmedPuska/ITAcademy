package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Podaci {
    public static Connection conn() throws SQLException {
        
        return DriverManager.getConnection("jdbc:mysql://localhost/g4_englez","root","");
    }
    
    public static ObservableList<Product> getProducts() {
        
        Connection conn = null;
        ObservableList<Product> res = FXCollections.observableArrayList();
        try {
            conn = conn();
            
            ResultSet rs = conn.createStatement().executeQuery("select * from products");
            
            while(rs.next()) {
//                for (int i = 0; i < 20; i++) {
                    Product p = new Product();
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setPrice(rs.getDouble("price"));
                    res.add(p);
//                }
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conn = null;
        }
        return res;
    }
    
    public static void sell(int id, double price) {
        
        Connection conn = null;
        try {
            conn = conn();
            
            conn.createStatement().execute("insert into sales (product, amount) values (" + id + "," + price +")");
            
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conn = null;
        }
    }
    
    public static void insert(String name, double price, String picture, boolean inStock, String tip) {
        Connection conn = null;
        try {
            conn = conn();
            
            PreparedStatement st = conn.prepareStatement("insert into products values (null, ? ,?, ?, ?, ?)");
            
            st.setString(1, name);
            st.setDouble(2, price);
            st.setString(3, picture);
            st.setString(4, tip);
            st.setBoolean(5, inStock);           
 
            st.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conn = null;
        }
    }
    
    public static boolean login(String userName, String password) {
        boolean rezultat = false;
        Connection conn = null;
        try {
            conn = conn();
            
            PreparedStatement st = conn.prepareStatement("select *from users where username = ? and password = md5(?)");
            st.setString(1, userName);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            
            rezultat = rs.next();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conn = null;
        }
        return rezultat;
    }
}