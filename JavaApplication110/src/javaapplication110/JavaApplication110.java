package javaapplication110;
public class JavaApplication110 {
    public static void main(String[] args) {
        Trka<Pas, Konj> t = new Trka();
        t.t1 = new Pas();
        t.t2 = new Konj();
        t.start();
    }
}