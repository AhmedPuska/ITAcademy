import java.io.Console;
import java.io.IOException;
import java.util.*;
public class MyFirstClass {
    //final static String measure  = "cm";
    public static void main(String[]args) throws IOException, InterruptedException{
       
        
        /*System.out.println(5+5!=110%100);
        
        /*Konj zimzelen=null;
        System.out.println(zimzelen);
        zimzelen    = new Konj();
        /*
        int a= 0b0010 ;
        int b= 0b1010 ;
        int c= 0b0011 ;
        
        System.out.println(a+" "+b+" "+c);
        
        
     /*       int x = 10;
        int y = 20;
        boolean res = (x==10||++y==20); //y se nikada nece povecati
        System.out.println(res);
        System.out.println(y);
        
        res = (x==11&&++y==20); //y se nikada nece povecati
        System.out.println(res);
        System.out.println(y);
        
        y++; //povecavamo vrednost y izvan izraza, kako bi izbegli bocne efekte
        res = (
        (x>9&&x!=25&&y>19&&x!=10)||
         y!=20&&y==10||(x==1&&x==2&&x==3)
         ||true
        );
        System.out.println(res);
        
        //tank hit test
        int projectile_x = 10, projectile_y = 15;
        int tank_x = 12, tank_y = 12, tank_width = 10, tank_height = 5;
        boolean hit = (
                projectile_x > tank_x && projectile_x < (tank_x + tank_width) &&
                projectile_y > tank_y && projectile_y < (tank_y) + tank_height
        );
        System.out.println("Tank is hit: " + hit);
         /*operator ==
        int x = 10;
        int y = 20; 
        boolean res = x == y;
        System.out.print("x equals y : ");
        System.out.println(res);
        //common mistake
        boolean x1 = false;
        if(x1=true){
            System.out.println("This shouldn't be shown");
        }
        //operator <
        res = x < y;
        System.out.print("x lower than y : ");
        System.out.println(res);
        //operator >
        res = x > y;
        System.out.print("x greater than y : ");
        System.out.println(res);
        //operator <=
        res = x <= y;
        System.out.print("x lower or equals y : ");
        System.out.println(res);
        //operator >=
        res = x >= y;
        System.out.print("x greater or equals y : ");
        System.out.println(res);
        /*
        boolean x1= false;
        if (x1=true){
            System.out.println("This shouldnt be shown");
        }
        /*boolean isbetter = !!!!!!!!!!!!!true;
        System.out.println(isbetter);
        /*int a=2,b=3;
        int res=a*(b++)+b;
        System.out.println(res);
        int res1=a*(++b)+b;
        System.out.println(res1);
        /*
        int x=10;
        x--;
        System.out.println(x);
        x++;
        System.out.println(x);
        /*
        String s1= "Hello" ;
        String s2= "from string";
        System.out.println(s1+" "+s2);
        /*int a=2, b=3, c=4;
        int res= a*b+c-a;
        System.out.println(res);
        res=a*(b+c-a);
        System.out.println(res);
        
        /*String hello = null;
        System.out.println(hello);
        
        
        /*Console c=System.console();
        c.writer().println("Unesite jedan broj \n");
        String line = c.readLine();
        
        
        Console c2=System.console();
        c2.writer().println("Unesite drugi broj \n");
        String linee = c2.readLine();
        c.writer().println("Rezultat je");
        Promenljive se mogu prvo deklarisati a zatim
inicijalizovati, ili inicijalizovati prilikom
deklaracije
        /*int a=2;
       
        Console c = System.console();
        c.writer().println("Hello from java via console object");
        Console c1 = System.console();
        if(c1!=null){
        c.writer().println("Console exist");
        }
        Console c2 = System.console();
        String line = c2.readLine();
        c2.writer().println("Hello"+line);*/
    }
      /* 
        int gold =0;
        Random r= new Random();
       
        int ratio;
        
       while(true){
           /* ovaj dio se ponavlja *//*
           ratio = r.nextInt(5);
           gold=gold+ratio;
           
           System.out.println("\r");
           System.out.println("Gold (ratio : "+ratio+"):" + gold + "  ");
           
           Thread.sleep(1000);
       }*/
        /*int a;
        Scanner in = new Scanner(System.in);
        a= in.nextInt();
        */
        //System.out.println(System.in.read());
        //Scanner scanner = new Scanner(System.in);
        //System.out.println(scanner.nextInt()+scanner.nextInt();
        
        //char slovo ='A';        
        //System.out.println((int)slovo);
        
        // boolean isDead = true;
       // System.out.println(isDead);

       /*Scanner scanner = new Scanner(System.in);
       
       String a= scanner.nextLine();
       String b= scanner.nextLine();
       
       int x = Integer.parseInt (a);
       int y = Integer.parseInt (b);
        System.out.println(x+y);
        */
       
       /*byte broj;
       Random r = new Random();
       broj= (byte)r.nextInt(50);
       System.out.println(broj);
       */
       
       
       
    }

