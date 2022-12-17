
package javaapplication228;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zaposleni")
public class Zaposleni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ime")
    private String ime;
    @Column(name = "godine")
    private int godine;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "dohodak")
    private int dohodak;
    
    public Zaposleni(int id, String ime, int godine, String adresa, int dohodak) {
        this.id = id;
        this.ime = ime;
        this.godine = godine;
        this.adresa = adresa;
        this.dohodak = dohodak;
    }
    
    public Zaposleni() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getDohodak() {
        return dohodak;
    }

    public void setDohodak(int dohodak) {
        this.dohodak = dohodak;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\t Ime: " + ime + "\t Godine: " + godine + "\t Adresa: " + adresa + "\t Dohodak: " + dohodak;
    }
    
    
    
}
