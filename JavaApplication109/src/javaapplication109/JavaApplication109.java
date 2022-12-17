package javaapplication109;
public class JavaApplication109 {
    public static void main(String[] args) {
       Bank<Visa> bank = new Bank<>(new Visa());
       bank.pay();
       Bank<Master> bank1 = new Bank<>(new Master());
       bank1.pay();
    }
}
