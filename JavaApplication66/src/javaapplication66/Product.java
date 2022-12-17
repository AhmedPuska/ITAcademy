/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

public abstract class Product {
 
    /*Deklaracija promenljivih (tip proizvoda, naziv i osnovna cena, kao i niz dodataka)*/
    public int type;
    public String name;
    public double price;
    public String[] additions;
 
    /*Apstraktna metoda countPrice() izračunava cenu na osnovu tipa proizvoda*/
    public abstract double countPrice();
 
    /*Pregažena metoda toString() koja prikazuje podatke o proizvodu*/
    @Override
    public String toString() {
 
    /*S obzirom na to da se vrši konkatinacija stringa, najefikasnija varijanta je korišćenje klase StringBuilder (promenljiva sekvenca karaktera). Ona će biti detaljnije objašnjena u nastavnoj jedinici 20.*/
        StringBuilder output  = new StringBuilder();
 
    /*Dodaju se podaci o proizvodu; this.name ce biti dodeljen u konstruktoru. Takodje, i cena ce biti dodeljena u konstruktoru, ali se ona ne ispisuje direktno, već se obrađuje kroz metod countPrice() (ovaj metod će kasnije biti napisan na nivou dete klase, jer svaka dete klasa ima sopstevnu stopu poreza)*/
 
    /*Metod append() nadovezuje string na sekvencu karaktera*/
        output.append("Proizvod: ");
        output.append(this.name + ", ");
        output.append("cena: " + countPrice() + ", ");
        output.append("dodaci: " + allAdditions());
 
        return output.toString();
    }
 
    /*Metoda allAdditions() vraća sve dodatke u vidu Stringa*/
    public String allAdditions()
    {
 
    /*I u ovom slučaju postojaće verovatno konkatinacija stringa, pa se koristi StringBuilder*/
        StringBuilder output = new StringBuilder();
 
/*Prolazi se kroz listu dodataka foreach petljom. Sve dok član liste nije null, promenljivoj output se dodaje član liste sa dodatim zarezom*/
        for(String addition : this.additions)
            if(addition != null)
                output.append(addition + ", ");
 
    /*Na kraju, potrebno je skinuti poslednji zarez, i ukoliko nema dodataka, napisati poruku : bez dodataka*/
 
    /*Metode za rad sa stringovima biće detaljno objašnjene u nastavnoj jedinici 17*/
        if(!output.toString().equals(""))
            if(output.toString().trim().endsWith(","))
                 output.replace(output.length()-2, output.length(), "");
        else
            output.append("bez dodataka");
 
        return output.toString();
    }
 
    /*Metoda addition() unosi dodatak za proizvod*/
      public void addition(String addition) {
 
    /*Prolazi se kroz listu dodataka sve do prvog nepostojeceg clana (null). U nepostojeci clan, smesta se vrednost i prekida se petlja*/
        for(int i=0; i<this.additions.length; i++)
            if(this.additions[i]==null)
            {
                   this.additions[i]=addition;
                   break;
            }
    }
}