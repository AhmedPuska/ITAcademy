package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "proizvodi")
public class Proizvodi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proizvodi_id")
    private int id;
    private String ime_proizvoda;
    private int cijena;
    
    @ManyToMany(cascade = javax.persistence.CascadeType.ALL)
    @JoinTable(name = "Prodaja",
            joinColumns = {
                @JoinColumn(name = "proizvodi_id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "kupci_id")
            })
    public Set<Kupci> kupcis;

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

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public Set<Kupci> getKupcis() {
        return kupcis;
    }

    public void setKupcis(Set<Kupci> kupcis) {
        this.kupcis = kupcis;
    }
    
    public static List prikazProizvoda() {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "from Proizvodi";
        Query query = session.createQuery(hql);
        
        
        List<Proizvodi> proizvodiList = new ArrayList();
        
        try {
        tx = session.beginTransaction();

            proizvodiList = query.list();

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            model.HibernateUtil.close();
        }
        return proizvodiList;
    }
    
    public static Proizvodi getProizvodi(int id) {
        Proizvodi proizvodi = null;
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        try {
        tx = session.beginTransaction();

            proizvodi = (Proizvodi)session.get(Proizvodi.class, id);
            proizvodi.getIme_proizvoda();
            proizvodi.getCijena();
            session.update(proizvodi);

        tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return proizvodi;
    }
    
    public void unosProizvoda() {
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        Query query = null;
        
        if (ime_proizvoda != null && !(ime_proizvoda.isEmpty()) && String.valueOf(cijena) != null && !(String.valueOf(cijena).isEmpty())) {
             query = session.createSQLQuery("insert into proizvodi (ime_proizvoda, cijena) values ('" + ime_proizvoda + "', " + cijena + ")");
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
    
    public void obrisiProizvod() {
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
      
        String hql = "delete from Proizvodi proizvodi where proizvodi.id = " + id;
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
    }
    
    @Override
    public String toString() {
        return "Id: " + id + "\t Ime: " + ime_proizvoda + "\t Cijena: " + cijena + "\n" ;
    }
    
}
