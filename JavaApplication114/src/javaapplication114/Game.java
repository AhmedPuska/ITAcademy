/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication114;

import java.util.Random;

public class Game {
    int igrac1 = 0;
    int igrac2 = 0;
    
    public void start() throws InterruptedException {
        System.out.println("Game loop starts");
        Random r = new Random();
        while(true){
            if(r.nextInt(4)==0){
                igrac1++;
            }
            if (r.nextInt(4)==0) {
                igrac2++;
            }
            System.out.println("Score " + igrac1 + " : " + igrac2);
            Thread.sleep(1000);
        }
    }
}