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
public class Split implements IPice{
    public void eksiraj() {
        System.out.println("banana split eksiraj");
    }

    @Override
    public void pij() {
        eksiraj();
    }
}
