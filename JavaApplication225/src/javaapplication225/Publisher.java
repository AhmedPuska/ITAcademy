package javaapplication225;

import java.util.Set;

public class Publisher {

    private int publisherId;
    private String name;
    private String address;

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