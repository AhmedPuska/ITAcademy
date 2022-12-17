
package perzistencija;

public class Perzistencija {

    private int id;
    private String ime;
    private int godine;
    private String adresa;
    private int dohodak;
    
    public Perzistencija(int id, String ime, int godine, String adresa, int dohodak) {
        this.id = id;
        this.ime = ime;
        this.godine = godine;
        this.adresa = adresa;
        this.dohodak = dohodak;
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

    public int getDohodak() {
        return dohodak;
    }

    public void setDohodak(int dohodak) {
        this.dohodak = dohodak;
    }
    
}