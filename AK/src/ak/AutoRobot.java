
package ak;

public class AutoRobot extends Robot {
    private double brzinaKPH;

    public AutoRobot(double tezinaKG, String ime, String lozinka, double brzinaKPH) {
        super(tezinaKG, ime, lozinka);
        this.brzinaKPH = brzinaKPH;
    }

    @Override
    protected void izvrsenjeNaredbe(String naredjenje) {
        if (naredjenje.equals("POKRENI SE")) {
            System.out.println( getIme() + " se pokrenuo.");
        } else if (naredjenje.equals("ZAUSTAVI SE")) {
            System.out.println( getIme() + " se zaustavio.");
        } else {
            System.out.println( getIme() + " ne poznaje ovo naredjenje");
        }
    }
    
    
}
