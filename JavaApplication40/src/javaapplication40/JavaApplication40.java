package javaapplication40;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class JavaApplication40 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        final int MAX = 10;
        int answer, guess;
        String another = "y";
        boolean flag = false;
        boolean anotherflag = true;
        
        while(anotherflag){
            answer=generator.nextInt(3);
        System.out.println("Koji broj sam zamislio"+3+"Pokusaj pogoditi");
        flag= false;
        while(!flag){
            guess=scan.nextInt();
            
            if(guess == answer){
                System.out.println("Bravo pogodio si");
                flag=true;
            }else{
                System.out.println("Pokusaj ponovno");
            }
        }
            System.out.println();
            System.out.println("Hoces ponovno igrati?(/y/n)");
       
            another = scan.next();
            if(another.equalsIgnoreCase("y")== true ){
            anotherflag = true;
        }else{
                    anotherflag= false;
                    }
        }
        
//        HeroesList heroes = new HeroesList();
//        for(Object hero : heroes){
//            System.out.println(hero);
        
//        for(int n = 0;n<=3;){
//            System.out.print("*\n"+n+"\t");}System.out.println("");
//        System.out.println("**********************************\n # \t1 \t2 \t3 \n**********************************");
//        for(int i=1;i<=50;i++){
////            fot(int o =0;
//        for(int j=1;j<=90;j++){
//            if(i==1||i==50||j==1||j==90){  // OVO JE SUPERR
//                System.out.print("*");
//                
//            }else System.out.print(" ");
//        }
//        System.out.println("");
//        }

        
//        int w=5;
//        int h=5;
//        for (int i = 1; i<=w;i++)
//        {   for(int j = 1;j<=w-i;j++){
//            System.out.print("*");}
//            System.out.println("");
//        }
            
        
//       String carMake = "Ford";
//        int doors = 4; 
//        switch(carMake){
//            case "Ford":
//                switch(doors) {
//                    case 2:
//                        System.out.println("Car have two doors");
//                    break;
//                    case 3:
//                        System.out.println("Car have three doors");
//                    break;
//                    case 4:
//                        System.out.println("Car have four doors");
//                    break;
//                    case 5:
//                        System.out.println("Car have five doors");
//                    break;
//                }
//            break;
//            default:
//                System.out.println("Car manufacturer is not Ford");
//            break;
//        }
        
        
//          int x = 523134;
//        int y = 325423;
//        int remainder = x % y;
//        System.out.println(remainder);
//        switch(remainder){
//            case 0:
//                System.out.println("Division without reminder");
//            break;
//            default:
//                if(remainder>1000){
//                    System.out.println("Ostatak preko 1000");    
//                } else {
//                    System.out.println("Reinder lower or equals ");
//                }
//            break;
//                  
//          }
        
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Unesite operaciju"); 
//        String op = scan.next();
//        System.out.println("Unesite prvi broj");
//        double a = scan.nextDouble();
//        System.out.println("Unesite drugi broj");
//        double b = scan.nextDouble();
//        
//        switch(op){
//            case "+":
//                System.out.println(a+b);
//                break;
//            case "-":
//                System.out.println(a-b);
//                break;
//            case "*":
//                System.out.println(a*b);
//                break;
//            case "/":
//                System.out.println(a/b);
//        }
//        if(op.equals("+")){
//            System.out.println(a+b);
//        } else
//        if(op.equals("-")){
//            System.out.println(a-b);
//        } else
//        if(op.equals("*")){
//            System.out.println(a*b);
//        } else
//        if(op.equals("/")){
//            System.out.println(a/b);
//        }
        }
    
    
    }
        
//        String[] ime  = new String[5];
//        ime[0] = "Heart";
//        ime[1] = "Cheary";
//        ime[2] = "Coin";
//        ime[3] = "Melon";
//        ime[4] = "Jocker";
//        Random r = new Random();
//        for (int i = 0; i < ime.length; i++) {
//        System.out.print(ime[r.nextInt(5)]+" ");   
//        }
//    
//    }
//    }
//        Object[] stala = {
//           "Ridjan",
//           new Konj ("Zimzelen"),
//           new Konj ("Jolly Jumper"),
//           new Konj ("My little ponny") 
//        };
//        for(int i=0;i<stala.length;i++){
//            Konj k = (Konj)stala[i];
//            k.sound();
//        }
//        Horse h = new Horse();
//        Horse h1 = new Horse();
//        Horse h2 = new Horse();
//        h1.speed = 2;
//        h2.speed = 3;
//        int w = 50;
//        h.trackWidth=w;
//        h1.trackWidth=w;
//        h2.trackWidth=w;
//        boolean gameRunning = true;
//        
//        while (gameRunning){
//        
//            h.update();
//            h1.update();
//            h2.update();
//            
//            for(int x=0;x<w;x++){
//            h.render(x);
//            h1.render(x);
//            h2.render(x);
//        }
//        System.out.print("\r");
//        
//        Thread.sleep(500);
//        }
//            for(int y=0;y<o;y++){
//                if(y==h.x){
//                h.render();
//                }
//                System.out.print(" ");
//            }System.out.print(" ");
    
