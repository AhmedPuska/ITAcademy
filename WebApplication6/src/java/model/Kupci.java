
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Kupci {
    int id;
    String name;
    int naStanju;
    String adresa_kupca;
    private String email_kupca;
    private String korpa;

    public String getKorpa() {
        return korpa;
    }

    public void setKorpa(String korpa) {
        this.korpa = korpa;
    }

    public String getAdresa_kupca() {
        return adresa_kupca;
    }

    public void setAdresa_kupca(String adresa_kupca) {
        this.adresa_kupca = adresa_kupca;
    }

    public String getEmail_kupca() {
        return email_kupca;
    }

    public void setEmail_kupca(String email_kupca) {
        this.email_kupca = email_kupca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNaStanju() {
        return naStanju;
    }

    public void setNaStanju(int naStanju) {
        this.naStanju = naStanju;
    }
    public Kupci () {
        
    }
    
    public Kupci (int id, String name, int naStanju) {
        this.id=id;
        this.name=name;
        this.naStanju=naStanju;
    }
    
//    public static String prikazKupaca() throws ClassNotFoundException, SQLException {
        
        
//    public static List<Kupci> prikazKupaca() {
//        StringBuilder prikaz_kupaca = new StringBuilder();
//    
//        List<Kupci> products = new ArrayList<>();
//    //    Connection conn = null;
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {
//            ResultSet rs = conn.createStatement().executeQuery("select * from kupci");
//            while(rs.next()) {
//                Kupci k = new Kupci(
//                        rs.getInt("id"), rs.getString("name"), rs.getInt("nastanju"));
//                System.out.println("");
//                products.add(k);
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } 
//        return products;
//    }
//    return prikazKupaca().toString();
//    }
    
    public static String prikazKupaca() throws ClassNotFoundException, SQLException {
        StringBuilder prikaz_kupaca = new StringBuilder();
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {
            
            Statement st = conn.createStatement();
            st.executeQuery("select * from kupci");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                String korpa = rs.getString("korpa");
                if(rs.getString("korpa")== null)
                    korpa = "Korpa je prazna";
                prikaz_kupaca.append(rs.getInt("id"));
                prikaz_kupaca.append(": ");
                prikaz_kupaca.append(rs.getString("ime_kupca"));
                prikaz_kupaca.append(": ");
                prikaz_kupaca.append(rs.getString("adresa_kupca"));
                prikaz_kupaca.append(": ");
                prikaz_kupaca.append(rs.getString("email_kupca"));
                prikaz_kupaca.append(": ");
                prikaz_kupaca.append(rs.getInt("nastanju"));
                prikaz_kupaca.append("  // U korpi: ");  
                prikaz_kupaca.append(korpa);  
                prikaz_kupaca.append("\n");  
            }
        } catch (SQLException ex) {
            prikaz_kupaca.append(ex.getMessage());
        }
        return prikaz_kupaca.toString();
    }

    
    public void unosKupaca() throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {
            
            if (name != null && !(name.isEmpty()) && String.valueOf(naStanju) != null && !(String.valueOf(naStanju).isEmpty()) && email_kupca != null && !(email_kupca.isEmpty()) && adresa_kupca != null && !(adresa_kupca.isEmpty()) ) {
                Statement st = conn.createStatement();
                st.execute("insert into kupci(ime_kupca, nastanju, adresa_kupca, email_kupca) values ('" + name + "', '" + naStanju + "' , '" + adresa_kupca + "', '" + email_kupca + "')");
            }
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
//    @Override
//    public String toString() {
//        return "Id: " + id + "\tName: " + name + "\tNa Stanju: " + naStanju ;
//    }

    
}