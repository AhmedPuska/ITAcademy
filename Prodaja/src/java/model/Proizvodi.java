package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Proizvodi {
    private int proizvodi_id;
    private String ime_proizvoda;
    private String opis;
    private int cijena;

    public int getProizvodi_id() {
        return proizvodi_id;
    }

    public void setProizvodi_id(int proizvodi_id) {
        this.proizvodi_id = proizvodi_id;
    }

    public String getIme_proizvoda() {
        return ime_proizvoda;
    }

    public void setIme_proizvoda(String ime_proizvoda) {
        this.ime_proizvoda = ime_proizvoda;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
    
    public static String prikazProizvoda() throws ClassNotFoundException {
        
        StringBuilder prikaz_proizvoda = new StringBuilder();
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
            
            Statement st = conn.createStatement();
            st.executeQuery("select * from proizvodi");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                prikaz_proizvoda.append(rs.getInt("proizvodi_id"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getString("ime_proizvoda"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getString("opis"));
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
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
            
            if (ime_proizvoda != null && !(ime_proizvoda.isEmpty()) && opis != null && !(opis.isEmpty()) && String.valueOf(cijena) != null && !(String.valueOf(cijena).isEmpty())) {
                Statement st = conn.createStatement();
                st.execute("insert into proizvodi (ime_proizvoda, opis, cijena) values ('" + ime_proizvoda + "', '" + opis + "', '" + cijena + "')");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void obrisiProizvod() throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
            Statement st = conn.createStatement();
            st.execute("delete from proizvodi where ime_proizvoda = '" + ime_proizvoda + "'");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
