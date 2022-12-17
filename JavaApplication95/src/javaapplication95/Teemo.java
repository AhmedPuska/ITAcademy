/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teemo implements Runnable{
    int x;
    boolean isStoped;
    @Override
    public void run() {
        while(!isStoped){
            x++;
            System.out.println("Teemo is on position: " + x);
            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(Teemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
