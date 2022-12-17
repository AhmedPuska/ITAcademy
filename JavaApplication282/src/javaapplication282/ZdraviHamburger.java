package javaapplication282;

public class ZdraviHamburger extends Hamburger {

    private String zdraviDodatno1Ime;
    private double zdraviDodatna1Cijena;

    private String zdraviDodatno2Ime;
    private double zdraviDodatna2Cijena;

    public ZdraviHamburger(String meso, double cijena) {
        super("Healthy", meso, cijena, "Smedi Razeni");
    }

    public void dodajZdraviDodatak1(String ime, double cijena) {
        this.zdraviDodatno1Ime = ime;
        this.zdraviDodatna1Cijena = cijena;
    }
    
    public void dodajZdraviDodatak2(String ime, double cijena) {
        this.zdraviDodatno2Ime = ime;
        this.zdraviDodatna2Cijena = cijena;
    }

    @Override
    public double stavkeHamburgera() {
        double zdraviHamburgerCijena = super.stavkeHamburgera();
//        System.out.println(this.ime + " hamburger sa " + this.tipHljeba + " hljeb-om sa " + this.meso + ", cijena je " + this.cijena);
        if (this.zdraviDodatno1Ime != null) {
            zdraviHamburgerCijena+= this.zdraviDodatna1Cijena;
            System.out.println("Dodano " + this.zdraviDodatno1Ime + " za dodatak " + this.zdraviDodatna1Cijena);
        }
        if (this.zdraviDodatno2Ime != null) {
            zdraviHamburgerCijena+= this.zdraviDodatna2Cijena;
            System.out.println("Dodano " + this.zdraviDodatno2Ime + " za dodatak " + this.zdraviDodatna2Cijena);
        }
        return zdraviHamburgerCijena;
    }
    
    
}
