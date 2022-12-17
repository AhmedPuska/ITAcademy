package javaapplication115;

import java.util.EventObject;

public class JavaApplication115 implements IIsplata{
    static int ukupnaIsplata;
    public static void main(String[] args) {
        Bankomat b = new Bankomat();
        b.addIsplataEventListener(new JavaApplication115());
        b.start();
//        IIsplata slusac = new IIsplata() {
//            @Override
//            public void isplatio() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
        System.out.println("Bankomat je ukupno isplatio: " + ukupnaIsplata);
    }

    @Override
    public void isplatio(BankomatTransactionEvent evt) {
        ukupnaIsplata += evt.suma;
        if (ukupnaIsplata>=100) {
            System.out.println("Onemogucava se bankomat za naredne 3 transakcije ");
            Bankomat b = (Bankomat)evt.getSource();
            b.active = false;
        }
        System.out.println("Transakcija# " + evt.transid + ", Isplaceno (mad)" + evt.suma);
    }
}