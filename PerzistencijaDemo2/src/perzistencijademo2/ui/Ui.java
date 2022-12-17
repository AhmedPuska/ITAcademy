package perzistencijademo2.ui;

import java.util.Scanner;
import perzistencijademo2.PerzistencijaDemo2;

public class Ui {
    
    private Scanner sc;
    
//    public final static int InvalidCommand = 0;
    
    public final static int ExitProgram = 0;
    public final static int ShowZaposleni = 1;
    public final static int AddZaposleni = 2;
    public final static int UpdateZaposleni = 3;
    public final static int DeleteZaposleni = 4;
//    public final static int ExitProgram = 5;
    
    public void updateZaposleni(PerzistencijaDemo2 pd2) {
        sc = new Scanner(System.in);
        System.out.println("Enter zaposleni ime: ");
        String ime = sc.nextLine();
        if (!ime.isEmpty()) {
            pd2.setIme(ime);
        }
//        System.out.println("Enter zaposleni godine: ");
//        Integer godine = sc.nextInt();
//       
//        if (godine > 0) {
//            pd2.setGodine(godine);
//        }
        
        System.out.println("Enter zaposleni godine: ");
//        int godinee = sc.nextInt();
        String godine = sc.nextLine();
        if (!godine.isEmpty()) {
            pd2.setGodine(Integer.parseInt(godine));
        }
        System.out.println("Enter zaposleni adresa: ");
        Scanner sc1 = new Scanner(System.in);
        String adrese = sc1.nextLine();
        if (!adrese.isEmpty()) {
            pd2.setAdresa(adrese);
        }
        System.out.println("Enter zaposleni dohodak: ");
        String dohodak = sc.nextLine();
        if (!dohodak.isEmpty()) {
            pd2.setDohodak(Integer.parseInt(dohodak));
        }
    }
    
    public PerzistencijaDemo2 getZaposleni() {
        
        PerzistencijaDemo2 pd2 = new PerzistencijaDemo2();
        sc = new Scanner(System.in);
        while (pd2.getIme()==null){
            System.out.println("Enter zaposleni ime: ");
            String ime = sc.nextLine();
            if (ime.isEmpty()) {
                System.out.println("Ime ne moze biti prazno");
                continue;
            }
            pd2.setIme(ime);
            System.out.println("Enter zaposleni godine: ");
            pd2.setGodine(sc.nextInt());
            System.out.println("Enter zaposleni adresa");
            Scanner sc1 = new Scanner(System.in);
            pd2.setAdresa(sc1.nextLine());
            System.out.println("Enter zaposleni dohodak");
            pd2.setDohodak(sc.nextInt());
        }
        return pd2;
    }
    
    public int getZaposleniId() {
        
        int selectedId = 0;
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter zaposleni id: ");
            try {
                selectedId = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Zaposleni id is not valid");
            }
        }
        return selectedId;
    }
    
    public String getZaposleniIme() {
        
        String selectedId = "";
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter zaposleni Ime: ");
            try {
                selectedId = (sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Zaposleni ime is not valid");
            }
        }
        return selectedId;
    }
    
    public int menu1() {
        System.out.println("----Product Menu----");
        System.out.println( ShowZaposleni + ". Show all zaposleni");
        System.out.println( AddZaposleni + ". Add zaposleni");
        System.out.println( UpdateZaposleni + ". Update zaposleni");
        System.out.println( DeleteZaposleni + ". Remove zaposleni");
        System.out.println( ExitProgram + ". Exit");
        sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
        
        int selectedOption = 0;
        while (true) {
            try {
                selectedOption = Integer.parseInt(sc.nextLine());
                if (selectedOption <0 || selectedOption >4) {
                    System.out.println("Menu item doesnt exit, try again");
                    continue;
                }
                break;
            } catch (Exception ex) {
                System.out.println("Please enter valid menu item number");
            }
        }
        return selectedOption;
    }
    
    private int menu() {
        System.out.println("----Product Menu----");
        System.out.println("1. Add all product");
        System.out.println("2. Show all product");
        System.out.println("3. Remove product");
        System.out.println("4. Show all product");
        System.out.println("0. Exit");
        int choice = readInt(1, 4);
        return choice;
    }
    
    private int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) {
                    break;
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
        return choice;
    }
}