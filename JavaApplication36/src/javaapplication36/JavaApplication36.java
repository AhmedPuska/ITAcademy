package javaapplication36;
public class JavaApplication36 {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.model = "Renault 4";
//        Car.passByReference(car);
//        System.out.println(car.model);
        int x =10;
        Car.passByValue(x);
        System.out.println(x);
    }
    
}
