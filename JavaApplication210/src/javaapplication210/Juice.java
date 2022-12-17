/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication210;
public class Juice implements IPice{
    public void sok() {
        System.out.println("pijem sok");
    }
    public Juice() {
        
    }

    @Override
    public void pij() {
        sok();
    }
}
