
package com.shop.business;

import com.shop.model.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Wallet {
    
    public double getBalance(int id) {
        
        Connection conn = null;
        try {
            conn = Database.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select balance from users where id = " + id);
            if (res.next()) {
                return res.getDouble("balance");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return 0;
    }
    
    public boolean withdraw(int id, double amount) {
        boolean success = false;
        
        Connection conn = null;
        try {
            conn = Database.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("select balance from users where id = " + id);
            if (!res.next()) {
                return false;
            }
            if (res.getDouble("balance")-amount <0) {
                return false;
            }
            st.execute("update users set balance = balance - " + amount + " where id = " + id);
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        return success;
    }
    
    public boolean deposit(int id, double amount) {
        boolean success = false;
        
        Connection conn = null;
        try {
            conn = Database.getConnection();
            Statement st = conn.createStatement();
            st.execute("update users set balance = balance + " + amount + " where id = " + id);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        return success;
    }
    
    public static void main(String[] args) {
        Wallet w = new Wallet();
        System.out.println(w.getBalance(2));
    }
}