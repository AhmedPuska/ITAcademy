package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Proizvodi {
    private String name;  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_proizvoda() {
        return id_proizvoda;
    }

    public void setId_proizvoda(int id_proizvoda) {
        this.id_proizvoda = id_proizvoda;
    }
    private int id_proizvoda;
    
    public static String prikazProizvoda() throws ClassNotFoundException, SQLException {  
      StringBuilder prikaz_proizvoda = new StringBuilder();  
      Class.forName("com.mysql.jdbc.Driver");  
        
      try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnicaDB", "root", "");) {  
    
        Statement st = conn.createStatement();  
        st.executeQuery("select proizvodi_id, naziv_proizvoda from proizvodi");  
        ResultSet rs = st.getResultSet();  
    
        while (rs.next()) {  
          prikaz_proizvoda.append(rs.getString("proizvodi_id"));  
          prikaz_proizvoda.append(": ");  
          prikaz_proizvoda.append(rs.getString("naziv_proizvoda"));  
          prikaz_proizvoda.append("\n");  
        }  
    
      } catch (SQLException ex) {  
        prikaz_proizvoda.append(ex.getMessage());  
      }  
      return prikaz_proizvoda.toString();   
    }  
      
    public void kreiranjeProizvoda() throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");  
        
      try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnicaDB","root", "");) {  
    
        if (name != null && !(name.isEmpty())) {  
    
          Statement st = conn.createStatement();  
          st.execute("insert into proizvodi (naziv_proizvoda) values ('" + name + "')");  
        }  
      } catch (SQLException ex) {  
        System.out.println("Error in database connection: \n" + ex.getMessage());  
      }  
    }  
      
    public void brisanjeProizvoda() throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");  
        
      try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnicaDB","root","");) {  
    
        Statement st = conn.createStatement();  
        st.execute("delete from proizvodi where naziv_proizvoda='" + name + "'");  
        
      } catch (SQLException ex) {  
        System.out.println("Errorrrr: \n" + ex.getMessage());  
      }  
      
    }  
}