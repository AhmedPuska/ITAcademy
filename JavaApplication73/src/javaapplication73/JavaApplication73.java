/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication73;

/**
 *
 * @author user
 */
public class JavaApplication73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Kad naidjes na coveka s kojim vredi govoriti i s njim ne govoris, izgubio si ga. Kad naidjes na coveka s kojim ne vredi govoriti i s njim govoris, izbubio si reci. Mudrac ne gubi ni coveka ni reci.";

        /*Za svaku od reči uvodi se po 1 brojač koji se inicijalizuje na 0, a zatim inkrementira prilikom pronalaženja svake pojave reči.*/
        int covekNum = 0;
        int reciNum = 0;

        int index;     // pozicija u tekstu koji se analizira

        String covekStr = "covek";
        String reciStr = "reci";

        /*Reč "covek" tražimo od početka teksta, pa za dobijanje indeksa 1. pojave te reči pozivamo metodu indexOf() sa 1 argumentom (String koji tražimo). Ako je reč pronađena, povratna vrednost metode je >=0 (inače je -1), pa se ulazi u while-petlju kojom se obrađuju i preostale pojave reči "covek", ako ih ima. Uslov ulaska u petlju (index >= 0) se svaki put proverava nakon poziva metode indexOf() što znači da je upravo pronađena 1 pojava tražene reči. Zato se brojač uvećava, a zatim se vrši priprema za traženje sledeće pojave te reči. Reč koju tražimo, "covek", je takva da, ako je pronađena njena pojava na nekoj poziciji, index, sledeća pojava sigurno se ne može naći pre pozicije neposredno iza kraja ove pojave (što npr. ne bi bio slučaj da tražimo reč "aaa", gde bi naredna pojava eventualno mogla da počne već od pozicije index + 1). Indeks premeštamo na tu poziciju i nastavljamo potragu odatle. Po izlasku iz petlje, u promenljivoj covekNum nalazi se broj pojavljivanja reči "covek" u tekstu.*/
        index = text.indexOf(covekStr);
        while(index >= 0)
        {
            ++covekNum;
            index += covekStr.length();
            index = text.indexOf(covekStr, index);
        }

        /*Pojavljivanja reči "reci" tražimo krećući se unatrag kroz tekst, pa indeks poslednje pojave pokušavamo dobiti pozivom metoda lastIndexOf() sa 1 argumentom. Logika je ista kao i kod traženja unapred. Jedina je razlika u pripremi indeksa za sledeći poziv metode lastIndexOf(). Naime, ako je prethodni poziv metoda lastIndexOf() za reč "reci" vratio npr. indeks index, i ako postoji još neka pojava ove reči na poziciji manjoj od index, 1. pozicija od koje ima smisla tražiti prethodnu pojavu reči "reci" dobija se kada se od pozicije index odmaknemo za dužinu tražene reči, jer ta reč je takva da nije moguće da se 2 njene uzastopne pojave preklope.*/
        index = text.lastIndexOf(reciStr);
        while(index >= 0)
        {
            ++reciNum;
            index -= reciStr.length();
            index = text.lastIndexOf(reciStr, index);
        }

        System.out.println("Zadati tekst sadrzi " + covekNum + " pojave reci \"covek\" i " + reciNum + " pojave reci \"reci\".");
    }  
}
