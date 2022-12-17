package javaapplication262;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread implements Runnable {

    public synchronized void hold() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        System.out.println("finished: " + Thread.currentThread().getId());
    }

    public void run() {
        hold();
    }
}
