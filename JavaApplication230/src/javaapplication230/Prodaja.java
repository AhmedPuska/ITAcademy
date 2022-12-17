package javaapplication230;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Prodaja {
    
    private int kupci_id;
    private int proizvodi_id;

    public int getKupci_id() {
        return kupci_id;
    }

    public void setKupci_id(int kupci_id) {
        this.kupci_id = kupci_id;
    }

    public int getProizvodi_id() {
        return proizvodi_id;
    }

    public void setProizvodi_id(int proizvodi_id) {
        this.proizvodi_id = proizvodi_id;
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
    
//    public void prodaja(int kupci_id, int proizvodi_id) {
//        
//        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        
//        Proizvodi p = (Proizvodi)session.get(Proizvodi.class, proizvodi_id);
//        p.kupcis.add((Kupci)session.get(Kupci.class, kupci_id));
//        
//        session.save(p);
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.close();
//    }
    
//    public void getAllZaposleni() throws SQLException {
//         ArrayList<Proizvodi> listaZaposlenih = new ArrayList<>();
//         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/books", "root", "");
//         Statement st = conn.createStatement();
//         ResultSet rs = st.executeQuery("select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id");
//         while (rs.next()) {
//             String naziv = rs.getString("ime");
//             String kolicina = rs.getString("naziv");
//             System.out.println(naziv + " " + kolicina);
//         }
//         conn.close();
//    }
    
//    public static String prikazProizvoda() throws ClassNotFoundException, SQLException {  
//      StringBuilder prikaz_proizvoda = new StringBuilder();  
//      Class.forName("com.mysql.jdbc.Driver");  
//        
//      try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/books", "root", "");) {  
//    
//        Statement st = conn.createStatement();  
////                        SELECT fname,lname,isbn from author inner join books on author.AUTHORID = books.AUTHORID
//
//        st.executeQuery("select ime, proizvodi.naziv from kupci inner join proizvodi on kupci.kupci_id = proizvodi.proizvodi_id");
//
////        st.executeQuery("select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id");  
//        
////        st.executeQuery("select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id");  
//        ResultSet rs = st.getResultSet();  
//    
//        while (rs.next()) {
//            String ime = rs.getString(1);
//            String naziv = rs.getString(2);
//            
//            System.out.println(ime + " " + naziv);
//        }  
//    
//      } catch (SQLException ex) {  
//        prikaz_proizvoda.append(ex.getMessage());  
//      }  
//      return prikaz_proizvoda.toString();   
//    }  
    
//    public List<Proizvodi> getAllZaposleni() throws SQLException {
//        Session session = HibernateUtil.createSessionFactory().openSession();
//        Transaction tx = null;
////        select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id
////        String hql = "select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id";
//        String hql = "Select ime, naziv from kupci join proizvodi on kupci_id = proizvodi_id";
//        Query query = session.createSQLQuery(hql);
//        
//        
//        List<Proizvodi> zaposleniList = new ArrayList();
//        
//        try {
//        tx = session.beginTransaction();
//        
//            zaposleniList = query.list();
//        
//        tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) {
//                tx.rollback();
//            }
//            System.out.println(e);
//        } finally {
//            HibernateUtil.close();
//        }
//        return zaposleniList;
//    }
    
    public List getAllZaposleni() throws SQLException {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
//        select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id
//        String hql = "select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id";
        String hql = "select ime, naziv from kupci join prodaja on kupci.kupci_id= prodaja.kupci_id join proizvodi on prodaja.proizvodi_id = proizvodi.proizvodi_id group by kupci.kupci_id";
        Query query = session.createSQLQuery(hql);
        
        
        List<Proizvodi> zaposleniList = new ArrayList();
        
        try {
        tx = session.beginTransaction();
        
            zaposleniList = query.list();
            
            for (Object zaposleniList1 : zaposleniList) {
                Object[] bookArr = (Object[])zaposleniList1;
                System.out.println(bookArr[0]);
                System.out.println(bookArr[1]);
            }
        
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
    
//    public void unosProizvoda() {
//        Proizvodi proizvodi = new Proizvodi();
//        proizvodi.setNaziv("Proizvod");
//        proizvodi.setKolicina(20);
//        
//        Kupci kupci = new Kupci();
//        kupci.setIme("Ime Kupca");
////        kupci.setEmail_kupca("EmailKupca");
////        kupci.setNastanju(2);
////        kupci.setKorpa("u korpi nesto");
//        
//        Set<Proizvodi> proizvodis = new HashSet() {
//            {
//                add(proizvodi);
//            }
//        };
//        
//        Set<Kupci> kupcis = new HashSet() {
//            {
//                add(kupci);
//            }
//        };
//        
//        kupci.setProizvodis(proizvodis);
//        
//        proizvodi.setKupcis(kupcis);
//        
//        Session session = HibernateUtil.createSessionFactory().openSession();
//        Transaction tx = null;
//        
//        try {
//            tx = session.beginTransaction();
//
//            session.persist(kupci);
//
//        tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) {
//                tx.rollback();
//            }
//            System.out.println(e);
//        } finally {
//            HibernateUtil.close();
//        }
//    }
}