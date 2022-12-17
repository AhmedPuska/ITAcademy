
package javaapplication219;

import model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class JavaApplication219 {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("/xml/hibernate.cfg.xml");
        StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
        srb.applySettings(config.getProperties());
        ServiceRegistry servis = srb.build();
//        ServiceRegistry servis = new StandardServiceRegistryBuilder().applySetting(settingName, args).build();
        
        SessionFactory fabrikaSesija = config.buildSessionFactory(servis);
        
        int zaBan = 1;
        
        Session sesija = fabrikaSesija.openSession();
        Player p = (Player) sesija.get(Player.class, 1);
        
        if (p!=null) {
            p.banovan = true;
            sesija.beginTransaction();
            sesija.update(p);
            sesija.getTransaction().commit();
        }
        
//        Player p = new Player();
//        p.id = 1;
//        p.banovan = true;
//        p.username = "Faker";
//        
//        sesija.beginTransaction();
//        sesija.save(p);
//        sesija.getTransaction().commit();
        
        sesija.close();
    }
    
}