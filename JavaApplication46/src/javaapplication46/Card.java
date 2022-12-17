package javaapplication46;
public class Card {
    double balance=200.54;
    boolean dovoljnoNovca=true;
    void charge(){
        if(balance>=200){
            System.out.println("Ima dovoljno");
        }else{
            System.out.println("nema dovoljno novnca");
        }
    }
    
}
