package zadatakoop;
public class Chocolate extends Product{
    double masa;
    
    public Chocolate(String ime, int barkod, double cijena, double masa) {
        super(ime, barkod, cijena);
        this.masa=masa;
    }
    
    @Override
    public String toString()
    {
        return ""+ masa;
    }

    @Override
    public double racunanjeCijene() {
        return super.cijena * super.POREZ;
    }
}