package mypackage;

/*2) Predhodno rešenje, iako funkcionalno, nije elegantno. Naročito ako hocemo da instanciramo klasu više puta. Umesto toga, najčešće se paket implementira 1 u okviru strane, ključnom rečju import i obično na vrhu tekućeg dokumenta.*/
import yourpackage.YourClass;
//
/*3) Ako paket koji želimo da implementiramo ima više od 1 klase koja nam je potrebna, možemo implementirati sve potrebne klase na isti način: na strani se može naći više od 1 import direktive.*/
//import yourpackage.YourClass1;
//import yourpackage.YourClass2;

public class NewClass
{
    /*1) iz klase MyClass pristupimo klasi YourClass, u paketu yourpackage*/
    yourpackage.YourClass class1 = new yourpackage.YourClass();
    //
    /*2) Nakon ove direktive mogli bismo se obraćati klasi kao da se nalazi u aktuelnom paketu:*/
    YourClass class2 = new YourClass();
    
}
