package javaapplication50;

import java.util.Arrays;

public class JavaApplication50 {
    public static void main(String[] args) {
        
        
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
//        int pozitivni=0;
//        int negativni=0;

        int brojac=0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Dupli elemnti su : "+array[j]);
                }
            }
        }
        
        
//        System.out.println("Ovo su pozitivni borjevi u nizu: ");
//        for (int i = 0; i < array.length; i++) {
//                if (array[i]>0) {
//                    System.out.print(" "+array[i]);
//                    array[i]++;}}
//        System.out.println("");
//        System.out.println("Ovo su negativni borjevi u nizu");
//        for (int j = 0; j < array.length; j++) {
//                if (array[j]<0) {
//                    System.out.print(" "+array[j]);
//                    array[j]++;
//                }
//        }System.out.println("");
       
        int[]pozitivni;
        int[]negativni;
//        int brojac=0;
        int a=0,b=0;
        negativni = new int[brojac];
        pozitivni = new int[array.length-brojac];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                int privrmeneo=pozitivni[i];
                pozitivni[a++]=array[i];
                pozitivni[i]=privrmeneo;
            }
            else
            {
                int privremeni=negativni[i];
                negativni[b]=array[i-1];
                negativni[i-1]=privremeni;
            }
        }    
                    System.out.println("ovo je brojac"+brojac);
            System.out.println(array.length);
            System.out.println(pozitivni.length);
            System.out.println(negativni.length);
//                 if (array[j]>array[j+1]) {
//                int privremeno = array[j];
//                array[j]= array[j+1];
//                array[j+1]=privremeno;
//                if (array[i]<0){
//                    array[i]++;
//                }
            
        
    }
}