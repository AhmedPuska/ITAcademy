package main;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private int publisherId;
    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Set<Book> books;

    public int getPublisherId() {return publisherId;}

    public void setPublisherId(int publisherId) {this.publisherId = publisherId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public Set<Book> getBooks() {return books;}

    public void setBooks(Set<Book> books) {this.books = books;}


}