package javaapplication95;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Garen implements Runnable{

    @Override
    public void run() {
        int x = 0;
        while(true){
            try {
                x++;
                System.out.println("Garen je na poziciji: " + x);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Garen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
