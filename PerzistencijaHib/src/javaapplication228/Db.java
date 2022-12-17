package javaapplication228;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Db {
    public Connection getConnection() {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/perzistencija","root","");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    public void insertZaposleni(Zaposleni zaposleni) throws SQLException {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        
        zaposleni.getIme();
        zaposleni.getGodine();
        zaposleni.getAdresa();
        zaposleni.getDohodak();
        try {
        tx = session.beginTransaction();

          session.persist(zaposleni);

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
    
    public void deleteZaposleni(int id) throws SQLException  {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        try {
        tx = session.beginTransaction();

            Zaposleni zaposleni = (Zaposleni)session.load(Zaposleni.class, id);
            session.delete(zaposleni);

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
    
    public void updateZaposleni(Zaposleni zaposleni) throws SQLException {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "update Zaposleni z set z.ime ='" + zaposleni.getIme() + "', z.godine=" + zaposleni.getGodine() + ", z.adresa='"+ zaposleni.getAdresa() + "', z.dohodak="+ zaposleni.getDohodak()+ "where z.id = " + zaposleni.getId();
        Query query = session.createQuery(hql);
        
        
        try {
            tx = session.beginTransaction();
                
                query.executeUpdate();
                
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
    
    public List<Zaposleni> getAllZaposleni() throws SQLException {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "from Zaposleni";
        Query query = session.createQuery(hql);
        
        
        List<Zaposleni> zaposleniList = new ArrayList();
        
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
    
    public Zaposleni getZaposleni(int id) throws SQLException {
        Zaposleni zaposleni = null;
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        try {
        tx = session.beginTransaction();

            zaposleni = (Zaposleni)session.get(Zaposleni.class, id);
            zaposleni.getIme();
            zaposleni.getGodine();
            zaposleni.getAdresa();
            zaposleni.getDohodak();
            session.update(zaposleni);

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return zaposleni;
    }
}