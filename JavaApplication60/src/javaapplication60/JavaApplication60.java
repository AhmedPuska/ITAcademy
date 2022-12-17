package javaapplication60;
public class JavaApplication60 {

    public int x = 5;
    
    public static void main(String[] args) {
        Car c = new Car();
        c.operand1 = 2;
        c.operand2 = 0;
        c.operator = '/';
        System.out.println(c.calculate());  // 7.0
    getPerimeter(13, 13, 13);   // 39
    }
 
    public static void getPerimeter(int... corners) {
 
        int perimeter = 0;
 
        if(corners.length < 2)
            System.out.println("Polygon must have more than one side.");
        else
        {
            for(int i = 0; i < corners.length; i++)
                perimeter += corners[i];
            System.out.println(perimeter);
        }
 
}
}

        
//        Car car1 = new Car("Ford", "Fiesta");
//        Car car2 = new Car("Ford", "Fiesta", 3);
////        Car car = new Car();
//        car2.printDetails();
//    Conversions.c2f(10);
//    
//    int x = 5;
//        System.out.println("This is initial value: " + x);
//        passMethod(x);
//        System.out.println("This is the value after the completion of the method: " + x);
// 
//    }
// 
//    public static void passMethod(int x) {
//        x = 10;
//        System.out.println("This is the value from method: " + x);
//    }
//    
//    
//}
