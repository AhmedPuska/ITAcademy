
package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class JavaApplication226 {

    public static void main(String[] args) {
        
//        Book book = new Book();
//        book.setTitle("Hibernate");
//        book.setPageNo(235);
        
//        Isbn isbn = new Isbn();
//        isbn.setIsbnNumber("982-289-292424-34");
//        isbn.setDateIssued(new Date());
        
//        book.setIsbn(isbn);
        
//        Publisher publisher = new Publisher();
//        publisher.setName("ITA");
//        publisher.setAddress("Low Street");
        
//        Author author = new Author();
//        author.setName("John Deen");

        
//        Set<Book> books = new HashSet(){
//            {
//                add(book);
//            }
//        };
        
//        Set<Author> authors = new HashSet(){
//            {
//                add(author);
//            }
//        };
        
//        publisher.setBooks(books);
//        book.setPublisher(publisher);
        
//        author.setBooks(books);
//        book.setAuthors(authors);
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        String hql = "delete from Book book where book.bookId = ";
        Query query = session.createQuery(hql);
        
//        List<Book> books = null;
        
        try {
            tx = session.beginTransaction();
            
//            session.persist(publisher);
            
//            session.persist(author);
            
//            session.persist(book);
            
            query.executeUpdate();
            
            tx.commit();
            
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(ex.getMessage());
        } finally {
            HibernateUtil.close();
        }
        
//        for (Book book : books) {
//            System.out.println(book);
//        }
    }
    
}
