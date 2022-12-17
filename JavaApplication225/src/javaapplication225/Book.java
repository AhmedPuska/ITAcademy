
package javaapplication225;

import java.util.Set;

public class Book {

    private int bookId;
    private String title;
    private int pageNo;

    private Isbn isbn;
//    private Set<Author> authors;
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

}