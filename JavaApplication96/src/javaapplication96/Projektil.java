/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Projektil {
    int x;
    public void fire(){
        for (int i = 0; i < 100; i++) {
         System.out.println("Projektil je na poziciji " + (x++));   
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Projektil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
