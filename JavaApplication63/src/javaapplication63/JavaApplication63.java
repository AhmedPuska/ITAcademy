/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author user
 */
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*U test-klasi kreiramo 2 objekta klase Pas, koristeći obe varijante konstruktora, a zatim ispisujemo njihove String-reprezentacije. Tom prilikom implicitno se poziva metoda toString() klase Pas.*/
        Pas pas = new Pas("Max", "labrador");
        Pas poznatPas = new Pas("Betoven");
         
        System.out.println(pas);
        System.out.println(poznatPas);
    }
    
}
