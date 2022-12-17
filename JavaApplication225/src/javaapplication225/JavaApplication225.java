
package javaapplication225;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class JavaApplication225 {

    public static void main(String[] args) {
        
        Book book = new Book();
        book.setTitle("Java");
        book.setPageNo(235);
        
        Isbn isbn = new Isbn();
        isbn.setIsbnNumber("978-3-16-144488-0");
        isbn.setDateIssued(new Date());
        
        book.setIsbn(isbn);
        
//        Publisher publisher = new Publisher();
//        publisher.setName("ITA");
//        publisher.setAddress("High Street");
        
//        book.setPublisher(publisher);
        
//        Author author = new Author();
//        author.setName("John Deen");
//        
//        Set<Author> authors = new HashSet() {
//            {
//                add(author);
//            }
//        };
//        
//        Set<Book> books = new HashSet() {
//            {
//                add(book);
//            }
//        };
//        
//        author.setBooks(books);
//        
//        book.setAuthors(authors);
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
//        Person person = new Person("John Deen", 23, "High Street");
        
        try {
            tx = session.beginTransaction();
            
            session.persist(book);
            
//            session.persist(author);
            
//            session.persist(publisher);
            
//            Person person = (Person)session.load(Person.class, 1);
            
//                session.delete(person);
//                person.setAddress("NewAddress");
//                session.persist(person);
//                session.update(person); //eksplicitno
                
//                System.out.println(person);
            
            tx.commit();
            
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            HibernateUtil.close();
        }
        
    }
    
}