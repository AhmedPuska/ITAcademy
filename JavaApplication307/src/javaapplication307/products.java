package javaapplication307;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class products implements AHMOResponse{
    
    public static void main(String[] args) throws SQLException, IOException {
        products p = new products();
//        p.proces(null);
    }
    public void proces(OutputStream izlaz) throws SQLException, IOException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/g4_englez","root","");
        ResultSet rs = conn.createStatement().executeQuery("select * from products");
        StringBuilder sb = new StringBuilder();
        sb.append("<table border='1'>");
        sb.append("<tr><td>id</td><td>name</td><td>price</td><td>picture</td><td>tip</td><td>nastanju</td></tr>");
        while (rs.next()) {
            sb.append("<tr><td>");
            sb.append(rs.getInt("id"));
            sb.append("</td><td>");
            sb.append(rs.getString("name"));
            sb.append("</td><td>");
            sb.append(rs.getDouble("price"));
            sb.append("</td><td>");
            sb.append(rs.getString("picture"));
            sb.append("</td><td>");
            sb.append(rs.getString("tip"));
            sb.append("</td><td>");
            sb.append(rs.getBoolean("nastanju"));
            sb.append("</td></tr>");
            
        }
        sb.append("</table>");
        izlaz.write(sb.toString().getBytes());
        System.out.println(sb.toString());
            
        
    }
}
