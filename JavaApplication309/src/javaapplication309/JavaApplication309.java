package javaapplication309;

import model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class JavaApplication309 {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("/xml/hibernate.cfg.xml");
        
        StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
        srb.applySettings(config.getProperties());
        ServiceRegistry servis = srb.build();
        
        SessionFactory fabrikaSesija = config.buildSessionFactory(servis);
        
        Session sesija = fabrikaSesija.openSession();
        
        Player p = (Player) sesija.get(Player.class, 1);
        
        System.out.println(p.username);
        System.out.println(p.banovan);
//        
//        Player p = new Player();
//        p.setId(1);
//        p.banovan = true;
//        p.username = "Faker";
//        
//        sesija.beginTransaction();
//        sesija.save(p);
//        sesija.getTransaction().commit();
        
        sesija.close();
        
    }
    
}
