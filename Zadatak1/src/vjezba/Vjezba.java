package vjezba;

import java.util.Arrays;

public class Vjezba {
    public static void main(String[] args) {
        String texts[][] = {
                {"dog", "cat", "bat" },
                {"fox", "box", "hat" }
        };

        for(int row = 0; row < 2; row++) {

            for(int col = 0; col < 3; col++) {
                System.out.print(texts[row][col]); // print the value
                System.out.print(" "); // print space
            }

            System.out.println(); // print a newline.
        }
        
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int[] negativni=new int[array.length];
        int[] pozitivni= new int [array.length];
        int brojac =0;
         Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
         int repeat = 1;
         for (int k = i + 1; k < array.length; k++) {
             if (array[i] == array[k]) {
                    repeat++;
                }
          }
            
        if(repeat > 1)
    System.out.println("Broj " + array[i] + " se ponavlja " + repeat + " puta");}
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0) {
                brojac++;
            }
        }
        
        negativni = new int[brojac];
        pozitivni = new int[array.length-brojac];
        for (int i=0, n=0, p =0; i<array.length; i++) {
            if (array[i]<0) {
                negativni[n++]= array[i];
            }else{
                pozitivni[p++]= array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(negativni));
        System.out.println(Arrays.toString(pozitivni));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]>0) {
//                    System.out.println();
                }
            }
        }
       
        
//        System.out.println("Ovo su pozitivni borjevi u nizu: i imamo ih ovoliko:");
//        for (int k = 0; k < array.length; k++) {
//                if (array[k]>0) {
//                    System.out.print(" "+array[k]);
//                    array[k]++;}}
//        System.out.println(" ");
//        System.out.println("Ovo su negativni borjevi u nizu");
//        for (int k = 0; k < array.length; k++) {
//                if (array[k]<0) {
//                    System.out.print(" "+array[k]);
//                    array[k]++;}}
                
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length-1; j++) {
//                if (array[i]<0) {
//                    System.out.println(array[i]);
//                    array[i]++;
//                }
//            }
//        }
//        }
//    System.out.println(Arrays.toString(array));
//        System.out.print(Arrays.toString(array));
     

//        int poz=0;
//        int neg=0;
//        int brojac=0;
//        System.out.println("Niz je bio:"+Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length-i-1; j++) {
//            if (array[j]>array[j+1]) {
//                int privremeno = array[j];
//                array[j]= array[j+1];
//                array[j+1]=privremeno;
//                if (array[i]<0){
//                    array[i]++;
//                }
//            }
//            }
//        }
//        System.out.print("Ovo su pozitivni "+Arrays.toString(array));
//        System.out.println(" ");
//        System.out.println("Niz je sada: "+Arrays.toString(array));
    }
}