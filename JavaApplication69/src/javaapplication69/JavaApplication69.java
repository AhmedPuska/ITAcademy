package javaapplication69;
public class JavaApplication69 {

    private static void ispisiKretanja(int naciniKretanja)
    {
        if((naciniKretanja & Kretanje.HODA) == Kretanje.HODA)
            System.out.print("hoda ");
        if((naciniKretanja & Kretanje.PLIVA) == Kretanje.PLIVA)
            System.out.print("pliva ");
        if((naciniKretanja & Kretanje.LETI) == Kretanje.LETI)
            System.out.print("leti ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Kretanje niz[] =
        {
            new Pas("Max", "labrador"),
            new Riba("Nemo", "riba klovn"),
            new Zaba("Kermit"),
            new Kokoska("Mica", "domaca kokos"),
            new Pingvin("Tux")
        };
        
        /*Metode iz interfejsa ćemo polimorfno pozivati. Iz tog razloga neophodno je reference na objekte klasa čuvati u promenljivama tipa interfejsa. Sve klase implementiraju interfejs Kretanje, pa je nizovska promenljiva k deklarisana tako da bude tipa ovog interfejsa.*/

        int i = 1;
        for(Kretanje k : niz)
        {
            System.out.println((i++) + ". " + k);

            ispisiKretanja(k.kreciSe());

            /*Da bismo polimorfno pozvali metode interfejsa Oglasavanje, neophodno je da se radi o objektu klase koja implementira taj interfejs (što se proverava operatorom instanceof), a ako to jeste slučaj, pošto imamo referencu na objekat u promenljivoj tipa Kretanje, neophodno je pre poziva metoda izvršiti eksplicitno kastovanje reference u tip Oglasavanje čiji metod želimo da pozovemo.*/
            if(k instanceof Oglasavanje)
                ((Oglasavanje) k).oglasiSe();
            
            System.out.println();
        }
    
}
}
