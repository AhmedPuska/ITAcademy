package javaapplication70;
import javax.swing.JFrame;
import yourpackage.* ;
public class JavaApplication70 {
  
/*4) Ako hoćemo da implementiramo sve klase paketa, možemo to uraditi oznakom *. */
//import yourpackage.*;
//
/*5)*/
//import mypackage.*;
//
/*7) Paketi, pored klasa i interfejsa, mogu sadržati i druge pakete, pa je tako moguće napraviti paketnu strukturu dublju od 1 nivoa. Potpaket se kreira isto kao i paket, samo što se, umesto na Source Packages, prilikom kreiranja miš pozicionira na sam paket. Potpaket implementiramo na isti način kao i pakete.*/
//import mypackage.mysubpackage.*;

    /*5) Prilikom import-a paketa treba biti veoma pažljiv jer može doći do preklapanja klasa. Ukoliko 2 importovana paketa imaju istoimene klase, tada, čak i ako je paket importovan, nećemo moći da koristimo istoimene klase samo unošenjem naziva, već ćemo morati eksplicitno da naglašavamo i naziv paketa. Na primer, ako paketi mypackage i yourpackage sadrže klase MyClass, sledeći kod će izazvati grešku, jer će klasa MyClass biti u oba paketa.*/
    //MyClass mc = new NewClass();   // greska!
    //
    /*6) Tada bi NewClass morala biti instancirana uz pomoć kompletne putanje:*/
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setVisible(true);
        
        YourClass.f();
    
    yourpackage.NewClass mc1 = new yourpackage.NewClass();
    // i
    mypackage.NewClass mc2 = new mypackage.NewClass();
    }
}
