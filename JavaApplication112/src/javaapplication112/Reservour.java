/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication112;
public class Reservour {
    private int reserveLimit = 10;
    private int totalAmount = 100;
    private void reserveIndicator(){
        System.out.println("Hey, I am on reserve! Please refill me!");
    }
    public void getFuel(){
        if(--totalAmount<=reserveLimit){
            reserveIndicator();
        }
        System.out.println(totalAmount);
    }
}
