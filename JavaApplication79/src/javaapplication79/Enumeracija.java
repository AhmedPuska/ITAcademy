
package javaapplication79;

import java.util.Scanner;

public class Enumeracija {
    public enum DaysOfWeek{
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, UNSPECIFIED;  // dodatna konstanta za nedefinisanu vrednost
    }
 
    public static void main(String[] args) {
 
        String day = "MONDAY";
 
  // enumeraciona promenljiva ima vrednost nedefinisane konstante
        DaysOfWeek daysOfWeek = DaysOfWeek.TUESDAY;
 
        try
        {
            daysOfWeek = DaysOfWeek.valueOf(day);
        }
        catch(Exception exc)
        {
            System.out.println(exc);
        }   
   
        switch (daysOfWeek) {
            case MONDAY:
                System.out.println("Day is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Day is TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("Day is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Day is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Day is FRIDAY");
                break;
            case SATURDAY:
                System.out.println("Day is SATURDAY");
                break;
            case SUNDAY:
                System.out.println("Day is SUNDAY");
                break;
 
            case UNSPECIFIED:   // dodatni slučaj za nedefinisanu vrednost
                System.out.println("Input error");
                break;
        }
    }
}