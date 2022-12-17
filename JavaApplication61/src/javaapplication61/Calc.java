/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;
public class Calc
{
    public static double area(Object shape)
    {
        /*metoda getClass() vraca klasu objekta za koji je pozvana*/
        if(shape.getClass() == Circle.class)
            
            /*metoda pow() racuna matematicku operaciju stepenovanje*/
            return Math.pow(((Circle) shape).r, 2) * Math.PI;
        
        if(shape.getClass() == Rectangle.class)
            return ((Rectangle) shape).a * ((Rectangle) shape).b;
        
        return 0;
    }
}