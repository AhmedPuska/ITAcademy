
package main;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int authorId;
    @Column(name = "name")
    private String name;
    
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "authors")
    private Set<Book> books;

    public int getAuthorId() {return authorId;}

    public void setAuthorId(int authorId) {this.authorId = authorId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Set<Book> getBooks() {return books;}

    public void setBooks(Set<Book> books) {this.books = books;}
}