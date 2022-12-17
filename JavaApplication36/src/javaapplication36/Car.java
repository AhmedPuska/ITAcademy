package javaapplication36;
public class Car {
    String model;
    public static void passByReference(Car car){
        
        car.model = "Beetle";
    }
    public static void passByValue(int x){
        x= 25;
    }
}
