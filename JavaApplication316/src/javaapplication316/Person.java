package javaapplication316;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    String ime;
    String prezime;
    LocalDate datum;
    String grad;

    public Person(String ime, String prezime, LocalDate datum, String grad) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum = datum;
        this.grad = grad;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Name: " + ime + " Prezime: " + prezime + " Date of birthday " + datum.format(dtf) + " Grad: " + grad;
    }
    
    public Person() {
        
    }
    
}
