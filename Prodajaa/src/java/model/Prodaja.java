package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prodaja")
public class Prodaja {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prodaja_id")
    private int prodaja_id;
    
//    private int kupac_id;
    
    @Column(name = "datum")
    private Date datum = new Date();
    
    @Column(name = "kolicina")
    private int kolicina;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "proizvodiprodaja",
            joinColumns = {
                @JoinColumn(name = "prodaja_id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "proizvodi_id")
            }
    )
    private Set<Proizvodi> proizvodis;

    public Set<Proizvodi> getProizvodis() {
        return proizvodis;
    }
    
    public void setProizvodis(Set<Proizvodi> proizvodis) {
        this.proizvodis = proizvodis;
    }
    
//    void setProizvodis(Set<Proizvodi> proizvodis) {
//        this.proizvodis = proizvodis;
//    }
    
    public int getProdaja_id() {
        return prodaja_id;
    }

    public void setProdaja_id(int prodaja_id) {
        this.prodaja_id = prodaja_id;
    }

//    public int getKupac_id() {
//        return kupac_id;
//    }
//
//    public void setKupac_id(int kupac_id) {
//        this.kupac_id = kupac_id;
//    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
    
    public static String prikazProdaje() throws ClassNotFoundException {
        StringBuilder prikaz_proizvoda = new StringBuilder();
        
        Class.forName("com.mysql.jdbc.Driver");
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
            
            Statement st = conn.createStatement();
            st.executeQuery("select * from prodaja");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                prikaz_proizvoda.append(rs.getInt("prodaja_id"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getInt("kupac"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getDate("datum"));
                prikaz_proizvoda.append(": ");
                prikaz_proizvoda.append(rs.getInt("kolicina"));
                prikaz_proizvoda.append("\n");
            }
        } catch (SQLException ex) {
            prikaz_proizvoda.append(ex.getMessage());
        }
        
        return prikaz_proizvoda.toString();
    }
}