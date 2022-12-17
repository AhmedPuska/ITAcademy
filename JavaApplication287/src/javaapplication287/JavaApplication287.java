package javaapplication287;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication287 {

//    static int age;
    
//    public static void passByValue(int x) {
//        x = 25;
//    }    
        
    public static void main(String[] args) throws SQLException, InterruptedException {
        
//        int x=0,x1=30,right_bound=40,dir=1,dir1=-1;  
//        while(true){  
//            for(int i=0;i<right_bound;i++){
//                System.out.print(
//                        (x==i)?"*":(x1==i)?"#":" "
//                ); 
//            }
//            x+=dir;
//            x1+=dir1;
//            if(x<0||x>=right_bound) { dir*=-1; }
//            if(x1<0||x1>=right_bound) { dir1*=-1; }
//            System.out.print("\r");
//            Thread.sleep(50);
//       }
        
        
//        while (true) {
//            for (int i = 0; i < 10; i++) {
//                for (int j = 10; j > 0; j--) {
//                    System.out.print("*\r");
//                    Thread.sleep(500);
//                }
//
//                System.out.print("* \r");
//    //            System.out.print("\r *");
//                Thread.sleep(260);
//            }
//        }
        
        
        

//        int number = 10;
//        deadloop:
//        while (true) {
//            for (int i = 0; i < number; i++) {
//                System.out.print("* \r");
//                if (i==number) {
//                    System.out.print("\r *");
//                }
//                Thread.sleep(500);
//            }
//            break deadloop;
//        }
        
        
        
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        
//        while(true) {
//            int comp = r.nextInt(5)+1;
//            System.out.println("Koji broj sam zamislio");
//            System.out.print("Unesi broj: ");
//            int broj = sc.nextInt();
//            System.out.println("Random broj je: " + comp);
//            if (broj==comp) {
//                System.out.println("Pogodio si");
//                break;
//            } else System.out.println("Pokusaj ponovno");
//        }
        
        
        
//        int number = 0;
//        while (number<5) {            
//            if (number==3) {
//                number++;
//                continue;
//            }System.out.println("Number: " + number);
//            number++;
//        }
        
//        int number = 0;
//        outerloop:
//        while (true) {  
//            while(number<5) {
//                if (number==3) {
//                    break outerloop;
//                } System.out.println("Number " + number);
//                number++;
//            }
//        }
//        System.out.println("Program continue");
        
        
//        int w = 10;
//        int h = 20;
//        
//        for (int i = 1; i <= w; i++) {
//            for (int j = 1; j <= h; j++) {
//                if (i==1||i==w||j==1||j==h) {
//                    System.out.print("#");
//                } else System.out.print("O");
//            }
//            System.out.println("");
//        }
        
        
//        System.out.println("*************************");
//        System.out.println("#\t1\t2\t3");
//        System.out.print("*************************");
//        int br1 = 1;
//        int br2 = 2;
//        int br3 = 3;
//        for (int i = 1; i < 11; i++) {
//            System.out.print("\n"+i*1+"\t");
//            System.out.print(i*br1+"\t");
//            System.out.print(i*br2+"\t");
//            System.out.print(i*br3+"");
//        }
//        System.out.println("");
//        for (int i = 1; i < 11; i++) {
//            System.out.print(i);
//            for (int j = 1; j < 4; j++) {
//                System.out.print("\t"+i*j);
//            }
//            System.out.println("");
//        }
        
//        String carMake = "Ford";
//        int doors = 4;
//        
//        if (carMake.equals("Ford")) {
//            switch(doors) {
//                case 3: System.out.println("Ford, sa 3 vrata"); break;
//                case 4: System.out.println("Ford, sa 4 vrata"); break;
//                case 5: System.out.println("Ford, sa 5 vrata"); break;
//                default: System.out.println("Nije ford"); break;
//            }
//        }
        
        
        
//        int x = 523134;
//        int y = 325423;
//        
//        int c = x%y;
//        if (c<1000) {
//            System.out.println("Ostatak je manji od 1k");
//        } else {
//            System.out.println("Ostatak je veci od 1k");
//        }
//        System.out.println(c);
        
        
        
//        Card c = new Card(200);
//        c.charge();
        
//        String operator = "*";
//        double operand1 = 4;
//        double operand2 = 2;
//        double res =0;
//        switch (operator) {
//            case "+":
//                res = operand1 + operand2;
//                break;
//            case "-": res = operand1 - operand2; break;
//            case "/": res = operand1 / operand2; break;
//            case "*": res = operand1 * operand2; break;
//        }
//        if (operator.equals("+")) {
//            res = operand1 + operand2;
//        } else if (operator.equals("-")) {
//            res = operand1 - operand2;
//        }else if(operator.equals("/")) {
//            res = operand1 / operand2;
//        } else if(operator.equals("*")) {
//            res = operand1 * operand2;
//        }
//        System.out.println(operator + " " + res);
        

//        boolean heroIsDead = false;
//        System.out.println(heroIsDead?"Hero is dead. Reviving":"Hero is not dead. Nothing to do.");
//        if (heroIsDead) {
//            System.out.println("Hero is dead. Reviving");
//            heroIsDead = false;
//        }
//        if (!heroIsDead) {
//            System.out.println("Hero is not dead. Nothing to do.");
//        }
        
        
//        Chocolate cokolada = new Chocolate("Milka", 1987654320, 10, 250);
//	System.out.println(cokolada.toString());
//
//	Wine vino = new Wine("Vino", 1234567890, 100, 0.75);
//	System.out.println(vino.toString());
        
//        DwarfWarrior dwarfWarrior = new DwarfWarrior();
//        dwarfWarrior.dead = false;
//        dwarfWarrior.health = 25;
//        dwarfWarrior.mana = 25;
//        dwarfWarrior.show();
//        dwarfWarrior.receiveHit();
//        dwarfWarrior.show();
//        dwarfWarrior.receiveHit();
//        dwarfWarrior.show();
//        dwarfWarrior.primaryFire();
//        dwarfWarrior.show();
//        dwarfWarrior.secondaryFire();
//        dwarfWarrior.show();
//        dwarfWarrior.receiveHit();
//        dwarfWarrior.show();
        
        
        
        
//        Scanner sc = new Scanner(System.in);
//        
//        int option = sc.nextInt();
//        
//        boolean op ;
//        op = (option == 1);
//        
//        
//        op = (option == 2);
//        
//        
//        op = (option == 4);
//        
//        System.out.println("User level is " + option);
//            System.out.println("Regular user level: " + (option==1) );
//            System.out.println("Admin user level: " + (option==2) );
//            System.out.println("SuperAdmin user level: " + (option==4) );
        
        
//        Baza b = new Baza();
//        while (true) {
//            Scanner sc1 = new Scanner(System.in);
//            System.out.println("Database option 1. show databases 2. create databases 3. delete databases 4. exit");
//            System.out.println("Izaberite opciju");
//            int option = sc1.nextInt();
//            switch (option) {
//                case 1:
//                    b.showbase();
//                    break;
//                case 2:
//                    Scanner sc2 = new Scanner(System.in);
//                    System.out.println("Unesite naziv baze za kreiranje");
//                    b.createBase(sc2.nextLine());
//                    break;
//                case 3:
//                    Scanner sc3 = new Scanner(System.in);
//                    System.out.println("Unesite naziv baze za brisanje");
//                    b.deleteBase(sc3.nextLine());
//                    break;
//                case 4:
//                    System.exit(0);
//            }
//
//        }
//        while (true) {
//            MenuOption menuOption = MainMenu.RenderMenu();
//            DataAccess da = new DataAccess();
//            da.connect();
//            switch (menuOption) {
//                case New:
//                    Scanner sc = new Scanner(System.in);
//                    while (true) {
//                        try {
//                            System.out.println("Enter product name: ");
//                            String productName = sc.nextLine();
//                            System.out.println("Enter product price: ");
//                            double productPrice = sc.nextDouble();
//                            da.insertBill(productName, productPrice);
//                            break;
//                        } catch (Exception ex) {
//                            System.out.println("invalid entry, try again");
//                            sc.next();
//                        }
//                    }
//                    break;
//                case List:
//                    da.listAllBills();
//                    break;
//                case Delete:
//                    Scanner sc1 = new Scanner(System.in);
//                    while (true) {
//                        try {
//                            System.out.println("Enter product id: ");
//                            int productId = sc1.nextInt();
//                            da.deleteBill(productId);
//                            break;
//                        } catch (Exception ex) {
//                            System.out.println("invalid id, try again");
//                            sc1.next();
//                        }
//                    }
//                    break;
//                case Exit:
//                    System.exit(0);
//                    break;
//            }
//            da.disconnect();
//        }
    }

}
