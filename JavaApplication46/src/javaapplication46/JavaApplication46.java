package javaapplication46;
public class JavaApplication46 {
    public static void main(String[] args) {
        
        String carMake = "Ford";
        int doors      = 1;
        switch(carMake){
            case "Ford":
                switch(doors){
                    case 2: System.out.println("Car have two doors");
                    break;
                    case 3:
                        System.out.println("Car have three doors");
                    break;
                    case 4:
                        System.out.println("Car have four doors");
                    break;
                    case 5:
                        System.out.println("Car have five doors");
                    break;
                }
            break;
            default:
                System.out.println("Car manufacturer is not Ford");
            break;
        
                }
    }
        int x =523134;
        int y =325423;
        int remainder = x % y;
//        switch(remainder){
//            case 0: System.out.println("Division without reminder");
//            break;
//            default:
//                if(remainder>1000){
//                    System.out.println("Reminder is bigger then 1000");
//                }else{
//                    System.out.println("Remainder is smaller then 1000");
//                }
                    
            
            
//        }
//        Card car= new Card();
//        car.charge();
//    }
//    
}
