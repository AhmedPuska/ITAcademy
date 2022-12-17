package model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Telefon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToMany(targetEntity = Prodavnica.class)
    @JoinTable(name = "spisak", joinColumns = @JoinColumn(name = "shopid"), inverseJoinColumns = @JoinColumn(name = "phoneid"))
    public Set<Prodavnica> prodavnice;
    
    public String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.model;
    }
    
    
    
}
