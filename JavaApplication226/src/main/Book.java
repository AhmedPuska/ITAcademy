
package main;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;
    @Column(name = "title")
    private String title;
    @Column(name = "page_no")
    private int pageNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "isbn_id")
    private Isbn isbn;
    
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "book_author",
//            joinColumns = {
//                @JoinColumn(name = "book_id")
//            },
//            inverseJoinColumns = {
//                @JoinColumn(name = "author_id")
//            }
//    )
//    private Set<Author> authors;
    
//    @ManyToOne
//    @JoinColumn(name = "publisher_id")
//    private Publisher publisher;

    public int getBookId() {return bookId;}

    public void setBookId(int bookId) {this.bookId = bookId;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public int getPageNo() {return pageNo;}

    public void setPageNo(int pageNo) {this.pageNo = pageNo;}
    
    public Isbn getIsbn() {return isbn;}

    public void setIsbn(Isbn isbn) {this.isbn = isbn;}
    
//    public Set<Author> getAuthors() {return authors;}
//
//    public void setAuthors(Set<Author> author) {this.authors = author;}

//    public Publisher getPublisher() {return publisher;}
//
//    public void setPublisher(Publisher publisher) {this.publisher = publisher;}

    @Override
    public String toString() {
        return "ID: " + this.bookId + "\n" + "Title: " + this.title + "\n" + "PageNo:" + this.pageNo + "\n\n";
    }
    
    

}