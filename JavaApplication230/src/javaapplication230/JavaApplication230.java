
package javaapplication230;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class JavaApplication230 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Prodaja prodaja = new Prodaja();
//        prodaja.getAllZaposleni();
//        prodaja.prodaja(2, 2);
        
//        System.out.println(prodaja.getAllZaposleni().toArray().toString());
//        prodaja.prikazProizvoda();
        
//        List allZaposleni = prodaja.getAllZaposleni();
//        System.out.println("");
//        for (Object allZaposleni1 : allZaposleni) {
//            Proizvodi zaposleni = (Proizvodi)allZaposleni1;
//            System.out.println(zaposleni);
//        }
//        prodaja.getAllZaposleni();
//        prodaja.unosProizvoda();


//        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        
//        Proizvodi p = (Proizvodi)session.get(Proizvodi.class, 3);
//        p.kupcis.add((Kupci)session.get(Kupci.class, 1));
        
        
        
//        Proizvodi b1 = new Proizvodi();
//        b1.setNaziv("Jabuke 0,5kg");
//        Proizvodi b2 = new Proizvodi();
//        b2.setNaziv("Krusške 0,5kg"); 
//        HashSet proizvodis = new HashSet();
//        HashSet kupcis = new HashSet();
//        b1.setKupcis(kupcis);
//        proizvodis.add(b1);
//        proizvodis.add(b2); 
//        Kupci k1 = new Kupci();
//        k1.setIme("Neki Kupac");
//        k1.setProizvodis(proizvodis); 
//        kupcis.add(k1); 
//        session.save(b1);
//        session.save(b2); 
//        session.save(k1);  
        
//        session.save(p);
//        session.getTransaction().commit();
//        session.close();
//        HibernateUtil.close();
    }
    
}