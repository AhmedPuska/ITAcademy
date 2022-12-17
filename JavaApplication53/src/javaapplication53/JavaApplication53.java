package javaapplication53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaApplication53 {
     public static void main(String[] args) {
//        int[] arrawy = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
//        int arrady[] = {3, 5, 2, 6, 1, 6};
//
//        String[] colors = {"red" , "green" , "blue" , "yellow" , "white"};
//
//       for(int kaj: arrawy)
//            System.out.println(kaj);
       
       int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
       int brojpozitivni=0;
       int brojnegativni=0;
//       int[] negativni=new int[array.length];
//       int[] pozitivni= new int [array.length];
         for (int i = 0; i < array.length; i++) {
             if (array[i]>=0) {
                 brojpozitivni++;
             }else{
                 brojnegativni++;
             }
         }
         int[] pozitivni= new int[brojpozitivni];
         int[] negativni= new int[brojnegativni];
         for (int i = 0,n=0,p=0; i < array.length; i++) {
                 if (array[i]<0) {
                     negativni[n]=array[i];
                     n++;
                 }else{
                     pozitivni[p]=array[i];
                     p++;
                 }
         }System.out.println(Arrays.toString(negativni));
         System.out.println(Arrays.toString(pozitivni));
         
//        int[] pozitivni={};
//        int[] negativni={};
       
//        for (int i = 0, a = 0, b = 0; i < array.length; i++) {
//            if (array[i]>0) {
//                pozitivni[a++]=array[i];
//                brojac++;
//            }else if(array[i]<0){
//                negativni[b++]=array[i];
//            brojac++;}
//        }System.out.println(Arrays.toString(pozitivni));
//        System.out.println(Arrays.toString(negativni));
//        System.out.println(Arrays.toString(array));
        
//        List<Integer> positivesList = new ArrayList<Integer>();
//List<Integer> negativesList = new ArrayList<Integer>();
//
//for (int i = 0; i < array.length; i++) {
//    if (array[i] >= 0) {
//        positivesList.add(array[i]);
//    } else {
//        negativesList.add(array[i]);
//    }
//} 
//int[] positive = positivesList.toArray(new int[positivesList.size()]);
//int[] negative = negativesList.toArray(new int[negativesList.size()]);
    }
}
