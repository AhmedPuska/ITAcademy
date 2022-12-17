package manytomany;

import java.util.Set;

public class Kupci {
    private int kupciId;
    private String ime;
    private Set<Proizvod> proizvods;

    public int getKupciId() {
        return kupciId;
    }

    public void setKupciId(int kupciId) {
        this.kupciId = kupciId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Set<Proizvod> getProizvods() {
        return proizvods;
    }

    public void setProizvods(Set<Proizvod> proizvods) {
        this.proizvods = proizvods;
    }
}
