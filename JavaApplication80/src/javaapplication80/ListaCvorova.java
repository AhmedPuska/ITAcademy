/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

// struktura koja rukuje listom cvorova
public class ListaCvorova
{
    public Cvor tekuciCvor; // tekuci cvor
    public Cvor glava;  // pocetak liste
    
    // dodaje cvor u listu cvorova
    public void dodaj(int vrednost)
    {
/* ako je lista prazna, pravi se novi cvor, postavlja za tekuci i napušta metoda */
        if(glava == null)
        {
            glava = new Cvor(vrednost);
            tekuciCvor = glava;
            return;
        }
        // ako lista već postoji...
        tekuciCvor = glava;
        // ...prolazi se kroz listu i za tekuci se postavlja sledeci cvor
        while(tekuciCvor.sledeciCvor != null)
            tekuciCvor = tekuciCvor.sledeciCvor;
        // kada se dodje do kraja liste, dodaje se novi cvor kao sledeci
        tekuciCvor.sledeciCvor = new Cvor(vrednost); 
    }
    
    public int vratiVrednost(int pozicija)  // pretraga cvorova po indeksu
    {
            int brojac = 0; // brojac
            tekuciCvor = glava;
            while(tekuciCvor.sledeciCvor != null)   // prolazi se kroz listu
            {
                // kada se brojač poklopi sa traženim indeksom...
                if(brojac == pozicija)
                    break;
               tekuciCvor = tekuciCvor.sledeciCvor;
               brojac++;
            }
            // ...metoda prekida sa radom i vraća vrednost
            return tekuciCvor.vrednost;
    }
}
