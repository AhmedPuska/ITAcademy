
package javaapplication67;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JavaApplication67 {
    static void f(int x){
x=25;
}
    public static void main(String[] args) throws SQLException {
        int a = 10;
        f(a);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Id korisnika? ");
        String idKorisnika= scanner.nextLine();
        System.out.println("Id skina?");
        String idSkin = scanner.nextLine();
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/skins","root","");
        
        ResultSet rs =  conn.createStatement().executeQuery("select price from skins where id ="+idSkin);
        rs.next();
        
        double price = rs.getDouble("price");
        Statement st = conn.createStatement();
        st.execute("update skins set stock = stock -1 where id = "+idSkin);
        st.execute("update users set balance = balace -"+price + "where id = " + idKorisnika);
        st.execute("");
        System.out.println(price);
    }
    
}
