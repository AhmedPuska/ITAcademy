/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

/**
 *
 * @author user
 */
public class Calc implements Operations, Operands{
    
    public double a;
    public double b;
    @Override
    public double sub() {
        return a*b;
    }
    @Override
    public double add()
    {
        return a+b;
    }
    
     @Override
    public void setOperands(double a, double b) {
        this.a=a;
        this.b=b;
    }
//    
//    public static double add(double a, double b)
//    {
//        return a+b;
//    }
//    public static double add(double a, double c, double b)
//    {
//        return a+b+c;
//    }

    
}
