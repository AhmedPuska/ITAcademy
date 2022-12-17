package javaapplication297;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Projektil {

    int x;

    public void fire() {
        for (int i = 0; i < 20; i++) {

            System.out.println("Projektil je na poziciji: " + (x++));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Projektil.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
