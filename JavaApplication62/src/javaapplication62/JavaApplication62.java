/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

/**
 *
 * @author user
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 100;
        c.y = 200;
        c.color = "crvena";
        c.r = 12;
        System.out.println(c.area());   // 452.16 
   }
    
}
