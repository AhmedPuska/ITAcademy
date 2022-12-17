/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication79;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
//import javaapplication79.Enumeracija.DaysOfWeek;


/**
 *
 * @author user
 */
public class JavaApplication79 {

    public static void main(String[] args) {
      
        int w = 10;
        int h = 10;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (i==0||i==w-1||j==0||j==h-1) {
                    System.out.print("O");}
                    else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
        System.out.println("Unesi svoju poziciju x "+ w);
        System.out.println("Unesi svoju poziciju y "+h);
        Random r = new Random();
        int y = w+r.nextInt();
        
        for (Days value : Days.values()) {
            System.out.println(value);
        }
//        StatusMeca utakmicaStatus = StatusMeca.PoluVrijeme;
//        switch  (utakmicaStatus){
//            case PrvoPoluvrijeme:
//                System.out.println("0");
//                break;
//            case PoluVrijeme:
//                System.out.println("0/1");
//                break;
//            case DrugoPoluvrijeme:
//                System.out.println("1");
//                break;
//        }
        
        
        
        
        
        Map poruke = new HashMap();
        
        Map engleski = new HashMap();
        engleski.put("Otpustensi", "You are fired");
        engleski.put("hello", "Hello man!");
                
        
        Map bosanski = new HashMap();
        bosanski.put("Otpustensi", "Otpusten si");
        bosanski.put("hello", "Takav je zivot!");
        
                
        poruke.put("en", engleski);
        poruke.put("bs", bosanski);
        
//        Scanner s = new Scanner(System.in);
//        String jezik = s.nextLine();
        
        
//        Map odabraniJezik = (Map)poruke.get(jezik);
        
//        System.out.println(odabraniJezik.get("hello"));
//        System.out.println(odabraniJezik.get("Otpustensi"));
        
    }
    
}
