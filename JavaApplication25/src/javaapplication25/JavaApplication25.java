package javaapplication25;

import java.util.Arrays;
import java.util.Random;

public class JavaApplication25 {
    public static void main(String[] args) {
        String[] oznake =new String[5]; {
            oznake[0]="Ridjan";
            oznake[1]="Zimzelen";
            oznake[2]="Jolly Jumper";
            oznake[3]="hsahha";
            oznake[4]="My little ponny";}
        Random e = new Random ();
        for (int i=0;i<oznake.length;i++){
        System.out.print(oznake[e.nextInt(5)]+" ");
//        for (int i=0,duzina=stala.length;i<duzina;i++){
//            System.out.println(stala[i]);
//        }
//        System.out.println(Arrays.toString(args));
//        System.out.println(stala[2]);
        
                }
    
}}
