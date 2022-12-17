/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author userpublic class JavaApplication86 {

 */
public class JavaApplication86 {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel", "root", "");
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery("select * from person");
        String[] columns = new String[res.getMetaData().getColumnCount()];
        for (int i = 0; i < columns.length; i++) {
            System.out.println((columns[i]=res.getMetaData().getColumnName(i+1))+"\t");
        }
        System.out.println();
        while(res.next()){
            for (int i = 0; i < columns.length; i++) {
                System.out.println(res.getString(columns[i])+"\t");
            }
            System.out.println();
        }
    }
    
}
