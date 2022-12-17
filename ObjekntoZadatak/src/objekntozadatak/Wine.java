package objekntozadatak;
public class Wine extends Product{
    private float zapremina;
    final double DODATNI_POREZ = 1.1;

    public Wine(String ime, int barkod, double cijena, float zapremina) {
        super(ime, barkod, cijena);
        /*super.ime=ime;
        super.barkod=barkod;
        super.cijena=cijena;
        this.zapremina=zapremina;*/
    }
    
    public String toString()
    {
        return "Product: " + this.ime + "barcod: " + this.barkod;
        
    }
    
    public double racunanjeCijene()
    {
        return (this.cijena * super.POREZ )* this.DODATNI_POREZ;
    }
    
}
