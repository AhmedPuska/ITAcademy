
package javaapplication230;

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
import javax.persistence.Table;

@Entity
@Table(name = "proizvodi")
public class Proizvodi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "proizvodi_id")
    private int proizvodi_id;
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "kolicina")
    private int kolicina;

    public int getProizvodi_id() {
        return proizvodi_id;
    }

    public void setProizvodi_id(int proizvodi_id) {
        this.proizvodi_id = proizvodi_id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Set<Kupci> getKupcis() {
        return kupcis;
    }

    public void setKupcis(Set<Kupci> kupcis) {
        this.kupcis = kupcis;
    }
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Prodaja",
            joinColumns = {
                @JoinColumn(name = "proizvodi_id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "kupci_id")
            })
    public Set<Kupci> kupcis;

    @Override
    public String toString() {
        return "Ime: " + this.naziv + "\t Kolicina: " + kolicina;
    }

    
}
