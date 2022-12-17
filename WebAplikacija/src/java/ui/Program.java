package ui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.User;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello");
        
        podaci();
        
        ispis();
    }
    
    private static void podaci() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MojaOznaka1");
        EntityManager em = emf.createEntityManager();
        
        User user = new User();
        user.setFirstName("Ahmed");
        
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
    }
    
    
    private static void ispis() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MojaOznaka1");
        EntityManager em = emf.createEntityManager();
        
        List<Object[]> podaci = em.createQuery("select x.pid, x.firstName, x.lastName from User x",Object[].class).getResultList();
        
        for(Object[] o : podaci) {
            System.out.println("pid: " + o[0]);
            System.out.println("pid: " + o[1]);
            System.out.println("pid: " + o[2]);
        }
        em.close();
    }
}
