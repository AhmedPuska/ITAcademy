package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    private int id;
    @Column(name = "ime_kupca")
    private String ime_kupca;
    @Column(name = "adresa_kupca")
    private String adresa_kupca;

    @ManyToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "kupcis")
    public Set<Proizvodi> proizvodis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme_kupca() {
        return ime_kupca;
    }

    public void setIme_kupca(String ime_kupca) {
        this.ime_kupca = ime_kupca;
    }

    public String getAdresa_kupca() {
        return adresa_kupca;
    }

    public void setAdresa_kupca(String adresa_kupca) {
        this.adresa_kupca = adresa_kupca;
    }
    
    public static Kupci getKupci(int id) {
        Kupci kupci = null;
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        try {
        tx = session.beginTransaction();

            kupci = (Kupci)session.get(Kupci.class, id);
            kupci.getIme_kupca();
            kupci.getAdresa_kupca();
            session.update(kupci);

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return kupci;
    }
    
    public static List prikazKupaca() {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "from Kupci";
        Query query = session.createQuery(hql);
        
        
        List<Kupci> kupciList = new ArrayList();
        
        try {
        tx = session.beginTransaction();

            kupciList = query.list();

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return kupciList;
    }

    public void unosKupca() {
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        Query query = null;
        
        if (ime_kupca != null && !(ime_kupca.isEmpty()) && adresa_kupca != null && !(adresa_kupca.isEmpty())) {
             query = session.createSQLQuery("insert into Kupci (ime_kupca, adresa_kupca) values ('" + ime_kupca + "', '" + adresa_kupca + "')");
        }

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
    
    public void obrisiKupca() {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
      
        String hql = "delete from Kupci kupci where kupci.id = " + id;
        Query query = session.createQuery(hql);
        
        try {
           tx = session.beginTransaction();
              query.executeUpdate();
           tx.commit();
        } catch (HibernateException ex) {
           if (tx!=null) tx.rollback();
           ex.printStackTrace(); 
        } finally {
           session.close(); 
        }
        return ;
    }
    
    @Override
    public String toString() {
        return "Id: " + id + " Ime: " + ime_kupca + "  Adresa: " + adresa_kupca + "\n" ;
    }
}