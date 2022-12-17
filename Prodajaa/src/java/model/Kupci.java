package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "kupci")
public class Kupci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kupci_id")
    private int kupci_id;
    @Column(name = "ime")
    private String ime;
    @Column(name = "adresa")
    private String adresa;

    public int getKupci_id() {
        return kupci_id;
    }

    public void setKupci_id(int kupci_id) {
        this.kupci_id = kupci_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
    public static List prikazKupaca() {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "from Kupci";
        Query query = session.createQuery(hql);
        
        
        List<Kupci> zaposleniList = new ArrayList();
        
        try {
        tx = session.beginTransaction();

            zaposleniList = query.list();

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return zaposleniList;
    }
    
    @Override
    public String toString() {
        return "Id: " + kupci_id + "\t Ime: " + ime + "\t Godine: " + adresa;
    }
//    public static String prikazKupaca() throws ClassNotFoundException {
//        
//        StringBuilder prikaz_kupaca = new StringBuilder();
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
//            
//            Statement st = conn.createStatement();
//            st.executeQuery("select * from kupci");
//            ResultSet rs = st.getResultSet();
//            while (rs.next()) {
//                prikaz_kupaca.append(rs.getInt("kupci_id"));
//                prikaz_kupaca.append(": ");
//                prikaz_kupaca.append(rs.getString("ime"));
//                prikaz_kupaca.append(": ");
//                prikaz_kupaca.append(rs.getString("adresa"));
//                prikaz_kupaca.append("\n");
//            }
//        } catch (SQLException ex) {
//            prikaz_kupaca.append(ex.getMessage());
//        }
//        
//        return prikaz_kupaca.toString();
//    }
//    
//    public void unesiKupca() throws ClassNotFoundException {
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
//            
//            if (ime != null && !(ime.isEmpty()) && adresa != null && !(adresa.isEmpty())) {
//                Statement st = conn.createStatement();
//                st.execute("insert into kupci (ime, adresa) values ('" + ime + "', '" + adresa + "')");
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    
//    public void obrisiKupca() throws ClassNotFoundException {
//        
//        Class.forName("com.mysql.jdbc.Driver");
//        
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prodaja", "root", "");) {
//            
//            Statement st = conn.createStatement();
//            st.execute("delete from kupci where ime='" + ime + "' && adresa='" + adresa + "'");
//        } catch (SQLException ex) {
//            System.out.println("Greska!"+ex.getMessage());
//        }
//    }
}