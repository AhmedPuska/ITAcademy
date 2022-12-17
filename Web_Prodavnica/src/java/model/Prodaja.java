package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Prodaja {
    
    private int kupac_id;
    private int proizvod_id;

    public int getKupac_id() {
        return kupac_id;
    }

    public void setKupac_id(int kupac_id) {
        this.kupac_id = kupac_id;
    }

    public int getProizvod_id() {
        return proizvod_id;
    }

    public void setProizvod_id(int proizvod_id) {
        this.proizvod_id = proizvod_id;
    }
    
    public static String prodajaPrikaz() throws ClassNotFoundException, SQLException {  
      StringBuilder prikaz_prodaje = new StringBuilder();
      Class.forName("com.mysql.jdbc.Driver");  
        
      try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodavnica", "root", "");) {  
    
        Statement st = conn.createStatement();  
        st.executeQuery("select ime_kupca, ime_proizvoda from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id order by kupci.kupci_id");  
        ResultSet rs = st.getResultSet();  
            prikaz_prodaje.append("Ime kupca: \t");
            prikaz_prodaje.append("Ime proizvoda: \n");
        while (rs.next()) {
            prikaz_prodaje.append("\n");
            prikaz_prodaje.append(rs.getString("ime_kupca"));
            prikaz_prodaje.append("\t");
            prikaz_prodaje.append(rs.getString("ime_proizvoda"));
        }  
            System.out.println(prikaz_prodaje.toString());
      } catch (SQLException ex) {  
          System.out.println(ex.getMessage());  
      }  
      return prikaz_prodaje.toString();   
    }
    
    
    public static void prodaja(int kupac_id, int proizvod_id) {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            
                Proizvodi p = (Proizvodi)session.get(Proizvodi.class, proizvod_id);
                p.kupcis.add((Kupci)session.get(Kupci.class, kupac_id));
                
                session.save(p);
                
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
    }
    
}