package javaapplication38;

import java.util.Random;

public class JavaApplication38 {
    
    final static int STOJI=1;
    final static int TRCI=2;
    final static int CILJ=3;
    final static int NA_PASNJAKU =4;
    
    public static void main(String[] args) {
        Random rand = new Random();
        int faza = rand.nextInt(4)+1;
        switch(faza){
            case STOJI:
                System.out.println("Konj stoji");
                break;
            case TRCI:
                System.out.println("Konj trci");
                break;
            case CILJ:
                System.out.println("Konj je na cilju");
                break;
            case NA_PASNJAKU:
                System.out.println("Konj je zavrsio trku");
                break;
            default:
                System.out.println("Nepoznata faza");
        }
        
        
//        int faza = 2;
//        if(faza==1){
//            System.out.println("Konj je na stazu");
//        }else if(faza==2){
//            System.out.println("Konj trci");
//        }else {
//            System.out.println("Konj je na cilju");
//        }
        
        
//        Random rand = new Random();
//        boolean mainCell = rand.nextBoolean();
//        boolean neighbourCell = rand.nextBoolean();
//        boolean hit = mainCell==neighbourCell;
//        String message = hit == true? "bravo care" : "glup si" ;
//        if(hit){
//            System.out.println("Bravo care!!!");
//        }else{
//            System.out.println("Nije u redu!!!");
//        }
//        System.out.println(message);
        
    }
    
}
