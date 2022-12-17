package com.shop.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/g4_wallet", "root", "");
        } catch(Exception ex) {
            ex.printStackTrace();
            if (conn!=null) {
                conn.close();
            }
        }
        return conn;
    }
}