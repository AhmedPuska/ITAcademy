package javaapplication287;

public class Chocolate extends Product {

    double masa;
    public Chocolate(String ime, int barkod, double cijena, double masa) {
        super(ime, barkod, cijena);
        this.masa=masa;
    }
    
    @Override
    public String toString()
    {
        return "Chocolate " + this.ime + " - " + this.barkod + " neto kg" + masa;
        
    }

    @Override
    public double racunanjeCijene() {
        return this.cijena*super.POREZ;
    }
    
}
