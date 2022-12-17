/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

/**
 *
 * @author user
 */
public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciranje klase Pica
        Pizza p = new Pizza("Kapricoza", 25);

        //Dodavanje dodataka
        p.addition("paradajz");
        p.addition("pavlaka");

        //Instanciranje klase Sendvic
        Sandwitch s = new Sandwitch("Sendvic sa sunkom", 35);

        //Dodavanje dodataka
        s.addition("krastavac");
        s.addition("luk");
        s.addition("paradajz");

        //Prikaziavanje klasa Pica i Sendvic
        System.out.println(p);
        System.out.println(s);
    }
    
}
