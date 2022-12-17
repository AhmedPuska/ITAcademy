package manytomany;

import java.util.Set;

public class Proizvod {
    private int proizvodId;
    private String naziv;
    private int kolicina;
    private Set<Kupci> kupcis;

    public int getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(int proizvodId) {
        this.proizvodId = proizvodId;
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
}
