/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author user
 */
public class Pas extends Zivotinja {
    private String ime, rasa;
    /*U telima konstruktora se, kao 1. linija, pojavljuje poziv konstruktora bazne klase, koji inicijalizuje instancnu promenljivu vrsta klase Zivotinja vrednošću "pas".*/
    public Pas(String ime)
    {
        super("pas");
        this.ime=ime;
        rasa="bernandinac";
    }
    public Pas(String ime, String rasa){
        super("pas");
        this.ime=ime;
        this.rasa=rasa;
    }
    /*U metodi toString() izvedene klase najpre se poziva istoimeni nasleđeni metod bazne klase, pri čemu se mora koristiti ključna reč super, a zatim se nadovežu i preostale informacije, koje karakterišu tekući objekat izvedene klase.*/
    @Override
    public String toString()
    {
        return super.toString() + " " + ime + ", " + rasa + ".";
    }
    
}
