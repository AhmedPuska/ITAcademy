package javaapplication281;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}

class Floor {

    // write your code here
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
}

class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

class ComplexNumber {

    // write your code here
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        double add = ((real + imaginary)*(real+imaginary));
    }

    public void add(ComplexNumber cn) {
        add(cn.getReal(), cn.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        double subtract = real - imaginary;
    }
    
    public void subtract(ComplexNumber cn) {
        subtract(cn.getReal(), cn.getImaginary());
    }
}