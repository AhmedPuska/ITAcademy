package javaapplication37;

import java.util.Random;

public class JavaApplication37 {
    public static void main(String[] args) {
        Random random = new Random();
        int lopta = random.nextInt(3);
        int golman = 1;
        boolean loptaDesnoOdGolmana = lopta > golman;
        
        if(loptaDesnoOdGolmana){
            System.out.println("Golman ide desno");
            System.out.println("Golman gubi 0,3% stamina");
            loptaDesnoOdGolmana = false;
        }else  {
            if(lopta==golman){
                System.out.println("Golman skoci gore");
                System.out.println("Golman gubi 0,2% stamina");
            }else {
             System.out.println("Golma ide lijevo");
                System.out.println("Golman gubi 0,3% stamina");
            }
        }

    }
    
}
