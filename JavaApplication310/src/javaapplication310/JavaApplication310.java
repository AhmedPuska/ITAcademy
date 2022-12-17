package javaapplication310;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication310 {

    public static void main(String[] args) throws InterruptedException {
        while (true) {

            Connection conn = null;

            try {
                conn = Database.getConnection();
                ResultSet rs = conn.createStatement().executeQuery("select * from products");
                StringBuilder sb = new StringBuilder();
                sb.append("<products>");
                while (rs.next()) {
                    sb.append("<product id='" + rs.getInt("id") + "'>");
                    sb.append("<naziv>" + rs.getString("naziv") + "</naziv>");
                    sb.append("<cijena>" + rs.getDouble("cijena") + "</cijena>");
                    sb.append("</product>");
                }
                sb.append("</products>");
                new FileOutputStream("C:\\Users\\user\\Documents\\rad\\java vjezbe\\WebApplication16\\build\\web\\products.xml").write(sb.toString().getBytes());

            } catch (Exception e) {

            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                    }
                }
            }
            Thread.sleep(30000);
        }

    }
}
