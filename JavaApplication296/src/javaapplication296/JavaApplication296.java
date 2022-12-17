package javaapplication296;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication296 {

    public static void main(String[] args) throws InterruptedException {

        Garen g = new Garen();
        Thread t = new Thread(g, "Garenovana nit");
        t.start();
        Teemo l = new Teemo();
        Thread t1 = new Thread(l, "Teemova nit");
        t1.start();
        Thresh t2 = new Thresh();
        t2.start();
        
        Thread.sleep(5000);
        System.out.println("\u001B[31mTeemo died\u001B[0m");
        l.isStopped = true;

    }

}
