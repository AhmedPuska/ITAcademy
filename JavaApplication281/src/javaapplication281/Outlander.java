//package javaapplication281;
//
//public class Outlander extends Car {
//
//    private int roadServiceMonths;
//
//    public Outlander(int roadServiceMonths) {
//        super(5, 5, 6, false, "Outlander", "4WdD");
//        this.roadServiceMonths = roadServiceMonths;
//    }
//
//    public void accelarate(int rate) {
//        int newVelocity = getCurrentVelocity() + rate;
//        if (newVelocity == 0) {
//            stop();
//            changeGear(1);
//        } else if (newVelocity > 0 && newVelocity <= 10) {
//            changeGear(1);
//        } else if (newVelocity > 10 && newVelocity <= 20) {
//            changeGear(2);
//        } else if (newVelocity > 20 && newVelocity <= 30) {
//            changeGear(3);
//        } else {
//            changeGear(4);
//        }
//
//        if (newVelocity > 0) {
//            changeVelocity(newVelocity, getCurrentDirection());
//        }
//    }
//}
