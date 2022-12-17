/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author user
 */
public class Square extends Quad implements IGeom {
    
    @Override
    public void setxya(int x, int y, int a) {
        this.x=x;
        this.y=y;
        this.a=a;
    }

    @Override
    public int area() {
        return a*a;
    }

    @Override
    public int perimeter() {
        return 4 * this.a;
    }
//    
//     public static double area(double a, double b)
//    {
//        return a*b;
//    }
//    public static double perimeter(double a)
//    {
//        return a;
//    }
}
