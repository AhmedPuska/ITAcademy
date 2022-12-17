package test;
import java.util.*;
import java.io.IOException;
import java.util.Random;

public class Test { 
    public static void main(String[] args) throws IOException, InterruptedException {
    
        Scanner scanner =new Scanner(System.in);
        
        //int a=scanner.nextInt();
        
        /*int x=10;
        int y= ++x;
        System.out.println(x+" "+y+"\n");
        x=10;
        y= x++;
        System.out.println(x +" "+ y);
        
        int target_tank_x = 4;
        int projectile_x = 0; 
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x)); 
       */
        Random r =new Random();
        Car c= new Car(r.nextInt(100),"Lamborghinii Diablo");
        c.show();
        c.move();
        c.show();
        
        
        /*Object c = new Car();  //ostaviti za poslije #1
        Car c1= (Car)c;    //
        c.naziv = "Citroen";
        c=(Object)c1;
        System.out.println(((Car)c).naziv);*/
        
    }
        
        
    }
