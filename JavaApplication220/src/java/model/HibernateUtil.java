package model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
    
    public static SessionFactory getsessionFactory() {
        
        if (sessionFactory == null) {
            Configuration config = new Configuration();
            config.configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            sessionFactory = config.buildSessionFactory(serviceRegistry);

        }
        
        return sessionFactory;
    }
    
    public static void main(String[] args) {
        SessionFactory sf = getsessionFactory();
        System.out.println(sf);
    }
}