package javaapplication287;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Baza {
    
    public Connection conn = null;

    public void conn() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
    }

    public void showbase() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery("show databases");
        while (res.next()) {
            System.out.println(res.getString(1));
        }
    }

    public void deleteBase(String name) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
        String sql = "drop database if exists ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, "");
        st.execute();
        showbase();
    }

    public void createBase(String name) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
        String sql = "create database "+name+"";
        Statement st = conn.createStatement();
//        st.setString(1, name);
//        int Result = st.executeUpdate("CREATE DATABASE "+name+"");
        st.execute(sql);
    }
    

}
