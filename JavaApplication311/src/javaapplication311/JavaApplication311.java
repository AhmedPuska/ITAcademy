package javaapplication311;

import java.util.HashSet;
import model.HibernateUtil;
import model.Prodavnica;
import model.Telefon;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class JavaApplication311 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        
        Prodavnica p = (Prodavnica) session.get(Prodavnica.class, 2);
        
        System.out.println(p.telefoni);
        
//        p.telefoni.add((Telefon) session.get(Telefon.class, 1));
//        p.telefoni.add((Telefon) session.get(Telefon.class, 2));
//        p.telefoni.add((Telefon) session.get(Telefon.class, 3));
//        p.telefoni.add((Telefon) session.get(Telefon.class, 4));
        
//        session.save(p);
        
//        Telefon t = new Telefon();
//        t.model = "Tesla";
//        
//        Prodavnica p = new Prodavnica();
//        p.naziv = "Tehnomanija";
//        session.save(p);
        
//        t.prodavnice = new HashSet<>();
//        t.prodavnice.add(p);
        
//        session.save(t);
        
        session.getTransaction().commit();;
        session.close();
        System.exit(0);
    }
    
}
