package javaapplication96;
public class JavaApplication96 {
    public static void main(String[] args) {
        new Thread(()->{
        Projektil p = new Projektil();
        p.fire();
    }).start();
        System.out.println("Nastavlja se program");
    }
}
