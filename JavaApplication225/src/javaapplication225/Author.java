
package javaapplication225;

import java.util.Set;

public class Author {
    
    private int authorId;
    private String name;
    private Set<Book> books;

    public int getAuthorId() {return authorId;}

    public void setAuthorId(int authorId) {this.authorId = authorId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Set<Book> getBooks() {return books;}

    public void setBooks(Set<Book> books) {this.books = books;}
}