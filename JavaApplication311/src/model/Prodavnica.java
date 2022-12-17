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
public class Prodavnica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToMany(targetEntity = Telefon.class)
    @JoinTable(name = "spisak", joinColumns = @JoinColumn(name = "phoneid"), inverseJoinColumns = @JoinColumn(name = "shopid"))
    public Set<Telefon> telefoni;
    
    public String naziv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
