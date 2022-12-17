package javaapplication230;

import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Kupci")
public class Kupci {

    public int getKupci_id() {
        return kupci_id;
    }

    public void setKupci_id(int kupci_id) {
        this.kupci_id = kupci_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Set<Proizvodi> getProizvodis() {
        return proizvodis;
    }

    public void setProizvodis(Set<Proizvodi> proizvodis) {
        this.proizvodis = proizvodis;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kupci_id")
    private int kupci_id;
    @Column(name = "Ime")
    private String ime;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "kupcis")
    private Set<Proizvodi> proizvodis;

    @Override
    public String toString() {
        return "Ime: " + this.ime;
    }

    
}
