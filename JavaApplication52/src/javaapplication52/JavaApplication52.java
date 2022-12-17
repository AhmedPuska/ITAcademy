package javaapplication52;

import java.util.Arrays;

public class JavaApplication52 {
    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int poz=0;
        int neg=0;
        int brojac=0;
        System.out.println("Niz je bio:"+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
            if (array[i]>array[j+1]) {
                brojac--;
            }else  
                brojac++;
            
            }
        }
        System.out.print("Ovo su pozitivni "+Arrays.toString(array));
        System.out.println(" ");
        System.out.println("Niz je sada: "+Arrays.toString(array));
//        int [] brojevi= {1,-3,4,5,-2,-1,8,-12,0,0};
//        int[] negativni=new int[brojevi.length];
//        int[] pozitivni= new int [brojevi.length];
//        int brojac=0;
//        for (int i = 0; i < brojevi.length; i++) {
//            if (brojevi[i]<0) {
//                brojac++;
//            }
//        }
//        negativni= new int [brojac];
//        pozitivni= new int [brojevi.length-brojac];
//        for (int i = 0,n=0,p=0; i < brojevi.length; i++,n++,p++) {
//            if (brojevi[i]<0) {
//                negativni[n++]=brojevi[i];// if (array[i]>0) { smjesti u pozitivne} else if(array[i]<=0) { smjesti u negativne }
//            }else
//                pozitivni[p++]=brojevi[i];
//            
//        }
//        System.out.println(Arrays.toString(brojevi));
//        System.out.println(Arrays.toString(pozitivni));
//        System.out.println(Arrays.toString(negativni));
}
}
