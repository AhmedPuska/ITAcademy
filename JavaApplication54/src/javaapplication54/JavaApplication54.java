package javaapplication54;

import java.util.Arrays;

public class JavaApplication54 {
    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        int brojac=0;
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
        
        for (int i = 0; i < my_array.length - 1; i++) {
         int repeat = 1;
         for (int k = i + 1; k < my_array.length; k++) {
             if (my_array[i] == my_array[k]) {
                    repeat++;
                }
          }
            
        if(repeat > 1)
    System.out.println("Broj " + my_array[i] + " se ponavlja " + repeat + " puta");}
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i]<0) {
                brojac++;
            }
        }
//        int negativni[] = new int[7];
//        int pozitivni[] = new int [13];
////        int[]pozitivni[];
////        int[]negativni[];
////        int[] pozitivni=new int[6];
////        int[] negativni=new int[13];
//        for (int i =0,a=0,b=0;i<array.length;i++){
//            if(array[i]>0){
//            pozitivni[a]=array[i];
//            a++;}
//            else{
//            negativni[b]=array[i];
//            b++;
//            }
//        }
//        System.out.println(Arrays.toString(pozitivni));
//        System.out.println(Arrays.toString(negativni));
//        
//        int array1[]= {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
//        
//        int[] neg = new int[array1.length];
//        int[] pos = new int[array1.length];
//        int o = 0;
//        
//        Arrays.sort(array1); //this is not needed really
//
//	for(int counter = 0;counter<array1.length;counter++){
//	
//		if(array1[counter]<0){neg[counter]=array1[counter];}
//		else if(array1[counter]>0){ pos[counter]=array1[counter];}
//		
//	}
//	
//	Arrays.sort(pos);
//	Arrays.sort(neg);
//	
	
        
//        // Declare variables
//    int[] array1 = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87}, pos, hc;
//    int positive = 0, negative = 0;
//    Arrays.sort(array1);
//    
//
//    // Check how many positive and/or negative numbers
//    for (int i : array1)
//    {
//        if (i >= 0)
//        {
//            positive++;
//        } else 
//        {
//            negative++;
//        }
//    }
//
//    // Make exact size arrays
//    pos = new int[positive];
//    hc = new int[negative];
//
//    // Reset variables for new purpose
//    positive = 0;
//    negative = 0;
//
//    //Put numbers in correct array
//    for (int i : array1)
//    {
//        if (i >= 0)
//        {
//            pos[positive] = i;
//            positive++;
//        } else
//        {
//            hc[negative] = i;
//            negative++;
//        }
//    }
//
//    // Display arrays
//    System.out.print("Starter array: ");
//    for (int i: array1)
//    {
//        System.out.print(" " + i);
//    }
//
//    System.out.print("\nPositive array: ");
//    for (int i: pos)
//    {
//        System.out.print(" " + i);
//    }
//
//    System.out.print("\nNegative array: ");
//    for (int i: hc)
//    {
//        System.out.print(" " + i);
//    }


    }
    
}
