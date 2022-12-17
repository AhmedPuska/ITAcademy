/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication95;

/**
 *
 * @author user
 */
public class JavaApplication95 {
    public static void main(String[] args) throws InterruptedException {
        Garen g = new Garen();
        Teemo l = new Teemo();
        Thread t = new Thread(g,"Garenova nit");
        t.start();
        Thread t1 = new Thread(l,"Teemova nit");
        t1.start();
        Thresh tr = new Thresh();
        Thread t2 = new Thread(tr,"Threshova nit");
        t2.start();
        
        Thread.sleep(5000);
        System.out.println("\u001B[31m"+"Teemo died"+"\u001B[31m");
    }
}
