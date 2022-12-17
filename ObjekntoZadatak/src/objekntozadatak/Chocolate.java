package objekntozadatak;
public class Chocolate extends Product{
    private float masa;
    public Chocolate(String ime, int barkod, double cijena, float masa) {
        super(ime, barkod, cijena);
        this.masa=masa;
    }
    
    @Override
    public String toString()
    {
        return "Ime: " + this.ime + "barcod: " + this.barkod;
    }

    @Override
    public double racunanjeCijene() {
        return super.cijena * super.POREZ;
    }

}
