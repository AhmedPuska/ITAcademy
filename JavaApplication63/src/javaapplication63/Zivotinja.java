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
public class Zivotinja {
    private String vrsta;

    public Zivotinja(String vrsta){
        this.vrsta= new String(vrsta);
    }
    public String toString(){
        return "Ovo je " + vrsta;
    }
}
