package javaapplication287;

public class Wine extends Product {

    double zapremina;
    final double DODATI_POREZ = 1.1;

    public Wine(String ime, int barkod, double cijena, double zapremina) {
        super(ime, barkod, cijena);
        this.zapremina = zapremina;
    }

    @Override
    public String toString() {
        return "Wine " + this.ime + " - " + this.barkod + " Zapremina boce " + zapremina;

    }

    @Override
    public double racunanjeCijene() {
        return (this.cijena*super.POREZ)*this.DODATI_POREZ;
    }
}
