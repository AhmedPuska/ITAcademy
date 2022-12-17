package perzistencijademo2;

import java.util.Scanner;

public class PerzistencijaDemo2 {

    private int id;
    private String ime;
    private int godine;
    private String adresa;
    private double dohodak;
    private Scanner sc;
    
    public PerzistencijaDemo2() {
        
    }
    
    public PerzistencijaDemo2(int id, String ime, int godine, String adresa, double dohodak) {
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

    public double getDohodak() {
        return dohodak;
    }

    public void setDohodak(double dohodak) {
        this.dohodak = dohodak;
    }

    @Override
    public String toString() {
        return id + "\t" + ime + "\t" + godine + "\t" + adresa + "\t" + dohodak + "\n";
    }
    
}