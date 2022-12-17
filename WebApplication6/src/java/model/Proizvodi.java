
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Proizvodi {
    private int id;
    private String ime_proizvoda;
    private int stanje;
    private int cijena;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme_proizvoda() {
        return ime_proizvoda;
    }

    public void setIme_proizvoda(String ime_proizvoda) {
        this.ime_proizvoda = ime_proizvoda;
    }

    public int getStanje() {
        return stanje;
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
    
    public static String prikazProizvoda() throws ClassNotFoundException, SQLException {
        StringBuilder prikaz_proizvoda = new StringBuilder();
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {
            
            Statement st = conn.createStatement();
            st.executeQuery("select * from proizvodi");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                prikaz_proizvoda.append(rs.getInt("id"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getString("ime_proizvoda"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getInt("stanje"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getInt("cijena"));
                prikaz_proizvoda.append("\n");
            }
        } catch (SQLException ex) {
            prikaz_proizvoda.append(ex.getMessage());
        }
        return prikaz_proizvoda.toString();
    }
    
    public void unosProizvoda() throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {
            
            if (ime_proizvoda != null && !(ime_proizvoda.isEmpty()) && String.valueOf(stanje) != null && !(String.valueOf(stanje).isEmpty())  && Integer.valueOf(cijena) != null) {
                Statement st = conn.createStatement();
                st.execute("insert into proizvodi(ime_proizvoda, stanje, cijena) values ('" + ime_proizvoda + "', " + stanje + ", " + cijena + ")");
            }
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}