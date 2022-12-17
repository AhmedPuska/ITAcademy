//: inicijalizacija/Preklapanje.java
// Prikaz preklapanja konstruktora
// i preklapanja obicnih metoda.
package javaapplication317;
import static net.mindview.util.Print.*;
/**
 *
 * @author user
 */
/**
 * Model of a single arboreal unit.
 */
class Drvo {

    /**
     * Current vertical aspect to the tip.
     */
    int visina;

    /**
     * Plant a seedling. Assume height can be considered as zero.
     */
    Drvo() {
        System.out.println("Sadjenje mladice");
        visina = 0;
    }

    /**
     * Transplant an existing tree with a given height.
     */
    Drvo(int pocetnaVisina) {
        visina = pocetnaVisina;
        System.out.println("Pravimo novo Drvo koje je visoko " + visina + " m");

    }

    /**
     * Produce information about this unit.
     */
    void info() {
        System.out.println("Drvo je visoko " + visina + " m");
    }

    /**
     * Produce information with optional message.
     */
    void info(String s) {
        System.out.println(s + ": Drvo je visoko " + visina + " m");
    }
}

/**
 * Simple test code for Tree class
 */
public class Preklapanje {

    /**
     * Creates <b>Tree</b> objects and exercises the two different
     * <code>info()</code> methods.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Drvo d = new Drvo(i);
            d.info();
            d.info("preklopljena metoda");
        }
        // Preklopljeni konstruktor
        new Drvo();
    }
    /* Ispis:
    Pravimo novo Drvo koje je visoko 0 m
    Drvo je visoko 0 m
    preklopljenja metoda: Drvo je visoko 0 m
    Pravimo novo Drvo koje je visoko 1 m
    Drvo je visoko 1 m
    preklopljenja metoda: Drvo je visoko 1 m
    Pravimo novo Drvo koje je visoko 2 m
    Drvo je visoko 2 m
    preklopljenja metoda: Drvo je visoko 2 m
    Pravimo novo Drvo koje je visoko 3 m
    Drvo je visoko 3 m
    preklopljenja metoda: Drvo je visoko 3 m
    Pravimo novo Drvo koje je visoko 3 m
    Drvo je visoko 4 m
    preklopljenja metoda: Drvo je visoko 4 m
    Pravimo novo Drvo koje je visoko 4 m
    Sadjenje mladice
     *///:
}
