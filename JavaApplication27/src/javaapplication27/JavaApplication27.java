package javaapplication27;
import java.util.Scanner;
public class JavaApplication27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanne = new Scanner(System.in);
        String password        = scanner.nextLine();
        String dbPassword      = "123";
        System.out.println("Unet passord:"+ password);
        System.out.println("Password iz baze:"+ dbPassword);
        boolean valid = password.equals(dbPassword);
        
        System.out.println("User is valid: "+valid);
        
//        int x =10;
//        int y =20;
//        boolean res = x<20&&x>10;
//        System.out.println(res);
//        res=x<20||x>10;
//        System.out.println(res);
        
//        int target_tank_x    = 4;
//        int projectile_x     = 0;
//        projectile_x++;
//        System.out.println("Collision: "+(projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: "+(projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: "+(projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: "+(projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: "+(projectile_x>target_tank_x));
        
    }
    
}
