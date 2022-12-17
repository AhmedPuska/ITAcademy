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
public class Circle extends Shape {
    public final double PI = 3.14;
    public double r;
    
    public double area(){
        return r * r * PI;   // r^2 * PI
 
   /* može se koristiti i ugrađena konstanta Math.PI iz paketa java.lang */
       //return r * r * Math.PI;
    }
}
