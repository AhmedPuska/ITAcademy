//package javaapplication281;
//
//public class Car extends Vehicle {
//
//    private int wheels;
//    private int doors;
//    private int gears;
//    private boolean isManual;
//    private int currentGear;
//
//    public Car(int wheels, int doors, int gears, boolean isManual, String name, String size) {
//        super(name, size);
//        this.wheels = wheels;
//        this.doors = doors;
//        this.gears = gears;
//        this.isManual = isManual;
//        this.currentGear = 1;
//    }
//
//    public void changeGear(int currentGear) {
//        this.currentGear = currentGear;
//        System.out.println("Changed to " + this.currentGear + " gear.");
//    }
//
//    public void changeVelocity(int speed, int direction) {
//        System.out.println("Velocity " + speed + " direction " + direction);
//        move(speed, direction);
//    }
//
//      @Override
//    public void stop() {
//        super.stop(); //To change body of generated methods, choose Tools | Templates.
//    }
//}
