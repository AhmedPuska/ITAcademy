/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication210;

public class Kafa implements IPice{
    public void srci() {
        System.out.println("Srcem kafu");
    }

    @Override
    public void pij() {
        srci();
    }
}
