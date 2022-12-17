package objekntozadatak;
public abstract class Product 
{
    
    String ime;
    int barkod;
    double cijena;
    final double POREZ= 1.2;    
    Product(String ime, int barkod, double cijena)
    {
        this.ime=ime;
        this.barkod=barkod;
        this.cijena=cijena;
    }
    public String toString()
    {
        return "Product: " + this.ime + "barcod: " + this.barkod + "cijena: " + this.cijena;
        
    }
    public abstract double racunanjeCijene();
}
