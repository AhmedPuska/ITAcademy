package javaapplication258;

public class JavaApplication258 {

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
            StringBuilder output = new StringBuilder();

            /*Dodaju se podaci o proizvodu; this.name ce biti dodeljen u konstruktoru. Takodje, i cena ce biti dodeljena u konstruktoru, ali se ona ne ispisuje direktno, već se obrađuje kroz metod countPrice() (ovaj metod će kasnije biti napisan na nivou dete klase, jer svaka dete klasa ima sopstevnu stopu poreza)*/

 /*Metod append() nadovezuje string na sekvencu karaktera*/
            output.append("Proizvod: ");
            output.append(this.name + ", ");
            output.append("cena: " + countPrice() + ", ");
            output.append("dodaci: " + allAdditions());

            return output.toString();
        }

        /*Metoda allAdditions() vraća sve dodatke u vidu Stringa*/
        public String allAdditions() {

            /*I u ovom slučaju postojaće verovatno konkatinacija stringa, pa se koristi StringBuilder*/
            StringBuilder output = new StringBuilder();

            /*Prolazi se kroz listu dodataka foreach petljom. Sve dok član liste nije null, promenljivoj output se dodaje član liste sa dodatim zarezom*/
            for (String addition : this.additions) {
                if (addition != null) {
                    output.append(addition + ", ");
                }
            }

            /*Na kraju, potrebno je skinuti poslednji zarez, i ukoliko nema dodataka, napisati poruku : bez dodataka*/

 /*Metode za rad sa stringovima biće detaljno objašnjene u nastavnoj jedinici 17*/
            if (!output.toString().equals("")) {
                if (output.toString().trim().endsWith(",")) {
                    output.replace(output.length() - 2, output.length(), "");
                } else {
                    output.append("bez dodataka");
                }
            }

            return output.toString();
        }

        /*Metoda addition() unosi dodatak za proizvod*/
        public void addition(String addition) {

            /*Prolazi se kroz listu dodataka sve do prvog nepostojeceg clana (null). U nepostojeci clan, smesta se vrednost i prekida se petlja*/
            for (int i = 0; i < this.additions.length; i++) {
                if (this.additions[i] == null) {
                    this.additions[i] = addition;
                    break;
                }
            }
        }
    }

//klasa Pizza nasleđuje klasu Product
    public static class Pizza extends Product {

        public Pizza(String name, double price) {
            //Dodeljuju se parametri (naziv i cena) kroz konstruktor
            this.additions = new String[10];    // najviše 10 dodataka
            this.name = name;
            this.price = price;
        }

        @Override
        public double countPrice() {

            //Izračunava se cena proizvoda, sa porezom od 10%
            return this.price + this.price * 0.1;	// = this.price * 1.1
        }
    }

//Klasa Sandwich nasleđuje klasu Product
    public static class Sandwich extends Product {

        public Sandwich(String name, double price) {
            this.additions = new String[10];
            this.name = name;
            this.price = price;
        }

        public double countPrice() {

            //Izračunava se cena proizvoda, sa porezom od 15%
            return this.price + this.price * 0.15;  // = this.price * 1.15
        }
    }


        public static void main(String[] args) {

            //Instanciranje klase Pica
            Pizza p = new Pizza("Kapricoza", 25);

            //Dodavanje dodataka
            p.addition("paradajz");
            p.addition("pavlaka");

            //Instanciranje klase Sendvič
            Sandwich s = new Sandwich("Sendvic sa sunkom", 35);

            //Dodavanje dodataka
            s.addition("krastavac");
            s.addition("luk");
            s.addition("paradajz");

            //Prikaziavanje klasa Pica i Sendvič
            System.out.println(p);
            System.out.println(s);
        }
    

    void sleep() {
        // ovde se piše logika metode
    }

    void run() {
        // ovde se piše logika metode
    }

    abstract class Abstraktna {

        String ok;
    }

    /*abstract*/ interface Interface {
//        int ok

        public void metoda();

        public int intMetoda();
    }

    class Extenduje extends Abstraktna {

        void show() {
            System.out.println(ok = "this is cool :)");
        }
    }

    class Implementira implements Interface {

        @Override
        public void metoda() {
        }

        @Override
        public int intMetoda() {
            return 0;
        }

    }

//    public static void main(String[] args) {
////        Person person = new Person("John", "Davidson");
//        Student student = new Student("John", "Smith", "10/2014");
//        Profesor professor = new Profesor("Edward", "Owen", "Java Programming");
//
//        // polimorfizam (overriding)
////        person.show();
//        student.show();
//        professor.show();
//
//    }

}
