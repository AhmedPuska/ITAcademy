/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication209;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DbConnection {
    public Connection conn;
    
    public Pule pule;
    
    private static DbConnection instance;
            
    private DbConnection() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "");
    }
    
    public static DbConnection getInstance() throws SQLException{
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
}
