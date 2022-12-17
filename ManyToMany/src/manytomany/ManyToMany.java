
package manytomany;

import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ManyToMany {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction(); 
        Proizvod b = new Proizvod();
        b.setNaziv("The Garden of Rama");  
        Proizvod b1 = new Proizvod();
        b1.setNaziv("Sunstorm"); 
        HashSet proizvods = new HashSet();
        HashSet kupcis = new HashSet();
        b.setKupcis(kupcis);
        proizvods.add(b);
        proizvods.add(b1); 
        Kupci a = new Kupci();
        a.setIme("Arthur Clarke");
        a.setProizvods(proizvods); 
        kupcis.add(a); 
        session.save(b);
        session.save(b1); 
        session.save(a);  
        session.getTransaction().commit();
        session.close();
    }
    
}