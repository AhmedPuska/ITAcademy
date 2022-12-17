
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProdajaProizvodi {
    private int prodaja_id;
    private int proizvod_id;

    public int getProdaja_id() {
        return prodaja_id;
    }

    public void setProdaja_id(int prodaja_id) {
        this.prodaja_id = prodaja_id;
    }

    public int getProizvod_id() {
        return proizvod_id;
    }

    public void setProizvod_id(int proizvod_id) {
        this.proizvod_id = proizvod_id;
    }
    Proizvodi proizvodi;
    
    public List prikazProizvodaa() {
        List<Proizvodi> proizvodi = new ArrayList();
        
        return proizvodi;
    }
    
//    public static List prikazProizvoda() {
//        
//        Session session = HibernateUtil.createSessionFactory().openSession();
//        Transaction tx = null;
//        String hql = "from Prodaja";
//        String hql1 = "from Proizvodi";
//        Query query = session.createQuery(hql);
//        Prodaja prodaja = new Prodaja();
//        Proizvodi proizvodi = new Proizvodi();
////        prodaja.set
//        
//        List<Proizvodi> zaposleniList = new ArrayList();
//        
//        
//        Set<Prodaja> prodajas = new HashSet() {
//                {
//                    add(hql);
//                }
//        };
//        Set<Proizvodi> proizvodis = new HashSet() {
//                {
//                    add(hql1);
//                }
//        };
//        
//        proizvodi.setProdajas(prodajas);
//        prodaja.setProizvodis(proizvodis);
//        
//        try {
//        tx = session.beginTransaction();
//
//            proizvodi = (Proizvodi) query.list();
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
    
//    @Override
//    public String toString() {
////        return "Id: " + proizvodi.pro + "\t Ime: " + ime_proizvoda + "\t Opis: " + opis + "\t Cijena: " + cijena ;
//    }
}