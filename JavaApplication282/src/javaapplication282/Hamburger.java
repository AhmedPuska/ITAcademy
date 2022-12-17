package javaapplication282;

public class Hamburger {

    private String ime;
    private String hljeb;
    private String meso;
    private double cijena;
    private String tipHljeba;

    private String dodaci1Ime;
    private double dodaci1Cijena;

    private String dodaci2Ime;
    private double dodaci2Cijena;

    private String dodaci3Ime;
    private double dodaci3Cijena;

    private String dodaci4Ime;
    private double dodaci4Cijena;

    public Hamburger(String ime, String meso, double cijena, String tipHljeb) {
        this.tipHljeba = tipHljeb;
        this.meso = meso;
        this.cijena = cijena;
        this.ime = ime;
    }

//    public int hamburgerPrice() {
//
//    }

    public void dodavanjeSastojakaHamburgeru1(String ime, double cijena) {
        this.dodaci1Ime = ime;
        this.dodaci1Cijena = cijena;
    }

    public void dodavanjeSastojakaHamburgeru2(String ime, double cijena) {
        this.dodaci2Ime = ime;
        this.dodaci2Cijena = cijena;
    }

    public void dodavanjeSastojakaHamburgeru3(String ime, double cijena) {
        this.dodaci3Ime = ime;
        this.dodaci3Cijena = cijena;
    }

    public void dodavanjeSastojakaHamburgeru4(String ime, double cijena) {
        this.dodaci4Ime = ime;
        this.dodaci4Cijena = cijena;
    }
    
    public double stavkeHamburgera() {
        double hamburgerCijena = this.cijena;
        System.out.println(this.ime + " hamburger sa " + this.tipHljeba + " hljeb-om sa " + this.meso + ", cijena je " + this.cijena);
        if (this.dodaci1Ime != null) {
            hamburgerCijena+= this.dodaci1Cijena;
            System.out.println("Dodano " + this.dodaci1Ime + " za dodatak " + this.dodaci1Cijena);
        }
        if (this.dodaci2Ime != null) {
            hamburgerCijena+= this.dodaci2Cijena;
            System.out.println("Dodano " + this.dodaci2Ime + " za dodatak " + this.dodaci2Cijena);
        }
        if (this.dodaci3Ime != null) {
            hamburgerCijena+= this.dodaci3Cijena;
            System.out.println("Dodano " + this.dodaci3Ime + " za dodatak " + this.dodaci3Cijena);
        }
        if (this.dodaci4Ime != null) {
            hamburgerCijena+= this.dodaci4Cijena;
            System.out.println("Dodano " + this.dodaci4Ime + " za dodatak " + this.dodaci4Cijena);
        }
        return hamburgerCijena;
    }

//    public String getSalata() {
//        return salata;
//    }
//
//    public String getParadajz() {
//        return paradajz;
//    }
//
//    public String getMrkva() {
//        return mrkva;
//    }
}
