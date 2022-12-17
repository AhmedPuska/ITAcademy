
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prodaja {
    private int kupac;  
    private int proizvod;  
      
    public int getKupac(){  
      return kupac;  
    }  
    public int getProizvod(){  
      return proizvod;  
    }  
    public void setKupac(int kupac) {  
      this.kupac = kupac;  
    }  
    public void setProizvod(int proizvod) {  
      this.proizvod= proizvod;  
    }  
      
    public static void prodaja(int kupac, int proizvod) throws ClassNotFoundException {  
        
      Class.forName("com.mysql.jdbc.Driver");  
      try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica","root", "");) {  
          
        Statement st = conn.createStatement();  
         
        st.executeQuery("select korpa from kupci where id='" + String.valueOf(kupac) + "'");  
        ResultSet rs = st.getResultSet();  
        String korpa = null;  
        while(rs.next())  
          korpa = rs.getString("korpa");  
          
        st.executeQuery("select ime_proizvoda from proizvodi where id='" + String.valueOf(proizvod) + "'");  
        ResultSet rs2 = st.getResultSet();  
        String imeProizvoda = null;  
        while(rs2.next())  
          imeProizvoda = rs2.getString("ime_proizvoda");  
          
        if (korpa == null)   
          st.execute("update kupci set korpa='" + imeProizvoda + ", " + "' where id='" + String.valueOf(kupac) + "'");  
        else  
          st.execute("update kupci set korpa='" + korpa + imeProizvoda + ", " + "' where id='" + String.valueOf(kupac) + "'");  
          
        st.execute("delete from proizvodi where id='" + String.valueOf(proizvod) + "'");  
                
      } catch (SQLException ex) {  
        System.out.println("Error in database connection: \n" + ex.getMessage());  
      }  
      
    }  
    
    
    
//    public static void prodaja(int kupac, int proizvodi) throws ClassNotFoundException {
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {
//            
//            Statement st = conn.createStatement();
//            st.executeQuery("select ")
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
}