/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Thresh extends Thread {
    
    public Thresh(){
        super();
        setName("Threshova nit");
    }
    
    int x ;
    public void run(){
        while(true){
            x++;
            System.out.println("Thresh is at " + x);
            try {
                Thread.sleep(1100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thresh.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
