/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication120;
import java.sql.*;
public class DbBroker {
    public static DbBroker instance;
    private Connection conn;
    private DbBroker() { }
    public void query(String q) throws SQLException
    {
        Statement st = conn.createStatement();
        st.execute(q);
    }
    public static DbBroker getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        if(DbBroker.instance==null)
        {
            DbBroker.instance = new DbBroker();
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
             instance.conn = DriverManager.getConnection ("jdbc:mysql://localhost/test", "root", "");
        }
        return instance;
    }
}