package javaapplication47;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication47 {
    public static void main(String[] args){

         System.out.println("---------------------------");
         // prvo isprintas linije i i ove brojeve do 3
         System.out.format("     #");
         for(int i = 1; i<=3;i++ ) {
         //isprinta 5 praznih mjesta i na sestom broj
             System.out.format("%6d",i);
         }

         System.out.println();
         System.out.println("---------------------------");

         for(int i = 1 ;i<=10;i++) {
             // prvo isprinta 1 
             System.out.format("%6d",i);
             for(int j=1;j<=3;j++) {
             //pa onda rezulatat mnozenja, takodjes sa razmacima
                 System.out.format("%6d",i*j);
             }
  //pa onda predje u novi red
             System.out.println();
         }

     
        
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i+"\t");
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(i*j+"\t");
//            }System.out.println();
//        }
        
        
//        int x=10, y=3;
//    for (int i = 1; i <= 10; i++) {
//
//        for (int j = 1; j <= 3; j++) {
//
//            System.out.print(" " + i * j);
//        }
//        System.out.println();
//
//    }

        
////        for (int i = 1; i <= 3; i++){ System.out.print(+i);
////            System.out.println("");
////            for (int j = 0; j < 10; j++) {
////                System.out.print(j);
//            }System.out.println("");
//            
//        }
      
//        int x = 0, y = 1;
//
//        if(x == y)  // ne operator dodele nego poređenja 
//        {
//            System.out.println("llll");
//        }
//        else if(x == 0) // ; je višak
//            {
//                System.out.println("iiii");
//            }
//            else  // else nema uslov
//            {
//                System.out.println("222");
//            }
}
}
