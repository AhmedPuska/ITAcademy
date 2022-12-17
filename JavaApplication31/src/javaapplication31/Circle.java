package javaapplication31;
public class Circle extends Shapes {
    public final double PI = 3.14;
    public double r;
    public double area() {
       return r * r * PI;
    }
}