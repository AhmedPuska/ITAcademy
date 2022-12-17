package javaapplication18;
import java.util.Scanner;
public class JavaApplication18 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
    int HEAD        = 1;
    int ARM         = 2;
    int BODY        = 4;
    int HEART       = 8;
    int STARVE      = 16;
    int ONETAP      = HEAD | HEART | STARVE;
    
    int zone = ARM;
    
    boolean dead    = (zone & ONETAP) != 0;
    
    System.out.println(dead);
    
    }
   
}
