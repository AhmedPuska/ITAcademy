package javaapplication282;

public class DeluxHamburger extends Hamburger {

    public DeluxHamburger() {
        super("Deluxe", "Sausage & Bacon", 14.50, "Bijelim");
        super.dodavanjeSastojakaHamburgeru1("Chips", 2.75);
        super.dodavanjeSastojakaHamburgeru2("Drink", 1.71);
    }

    @Override
    public void dodavanjeSastojakaHamburgeru4(String ime, double cijena) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void dodavanjeSastojakaHamburgeru3(String ime, double cijena) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void dodavanjeSastojakaHamburgeru2(String ime, double cijena) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void dodavanjeSastojakaHamburgeru1(String ime, double cijena) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
    
    
}
