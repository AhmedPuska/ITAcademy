/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication210;

/**
 *
 * @author user
 */
public class JavaApplication210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IPice j = new Juice();
        j.pij();
        IPice k = new Kafa();
        k.pij();
        IPice s = new Split();
        s.pij();
        
        Neheroj nh = new Neheroj();
        nh.nemagija = "Nefrost ball";
    }
    
}
