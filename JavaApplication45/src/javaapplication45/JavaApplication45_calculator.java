package javaapplication45;

import java.util.Scanner;

public class JavaApplication45_calculator {
    public static void main(String[] args) {
        
        Scanner opa= new Scanner(System.in); 
        System.out.println("Enter operator(+,-,*,/): ");
        String operator;
        operator =opa.nextLine();
        double operand1=10;
        double operand2=2;
        
        switch(operator){
            case "+":
                System.out.println(operand1+operand2);
                break;
                case "-":
                System.out.println(operand1-operand2);
                break;
                case "*":
                System.out.println(operand1*operand2);
                break;
                case "/":
                System.out.println(operand1/operand2);
                default: System.out.println("Niste unijeli ispravne podatke");
                break;
                
        }
        
        
    }
}
        
//        Scanner opa= new Scanner(System.in); 
//        System.out.println("Enter operator(+,-,*,/): ");
//        String operator;
//        operator =opa.nextLine();
//        double operand1=10;
//        double operand2=2;
//        if(operator.equals("+")){
//            System.out.println(operand1+operand2);}
//        else if(operator.equals("-")){
//                    System.out.println(operand1-operand2);
//                    }
//        else if(operator.equals("*")){
//                    System.out.println(operand1*operand2);
//                    }
//        else if(operator.equals("/")){
//                    System.out.println(operand1/operand2);
//                    }
//        else {
//            System.out.println("Niste unijeli operator");
//        }
//    }
//    
//}
