
package javaapplication228;

import java.util.Scanner;

public class Menu {
    
    public final static int ExitProgram = 0;
    public final static int ShowZaposleni = 1;
    public final static int AddZaposleni = 2;
    public final static int UpdateZaposleni = 3;
    public final static int DeleteZaposleni = 4;
    
    Zaposleni zaposleni;
    
    public void updateZaposleni(Zaposleni zaposleni) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter zaposleni ime: ");
        String ime = sc.nextLine();
        if (!ime.isEmpty()) {
            zaposleni.setIme(ime);
        }
        System.out.println("Enter zaposleni godine: ");
        String godine = sc.nextLine();
        if (!godine.isEmpty()) {
            zaposleni.setGodine(Integer.parseInt(godine));
        }
        System.out.println("Enter zaposleni adresa: ");
        Scanner sc1 = new Scanner(System.in);
        String adrese = sc1.nextLine();
        if (!adrese.isEmpty()) {
            zaposleni.setAdresa(adrese);
        }
        System.out.println("Enter zaposleni dohodak: ");
        String dohodak = sc.nextLine();
        if (!dohodak.isEmpty()) {
            zaposleni.setDohodak(Integer.parseInt(dohodak));
        }
    }
    
    public Zaposleni getZaposleni() {
        zaposleni = new Zaposleni();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            while (zaposleni.getIme() == null) {
                System.out.println("Enter zaposleni Ime");
                String ime = sc.nextLine();
                if (ime.isEmpty()) {
                    System.out.println("Ime can't be empty");
                    continue;
                }
                zaposleni.setIme(ime);
                System.out.println("Enter zaposleni godine: ");
                zaposleni.setGodine(sc.nextInt());
                System.out.println("Enter zaposleni adresa");
                Scanner sc1 = new Scanner(System.in);
                zaposleni.setAdresa(sc1.nextLine());
                System.out.println("Enter zaposleni dohodak");
                zaposleni.setDohodak(sc.nextInt());
            }
        return zaposleni;
    }
    
    public int getZaposleniId() {
        int selectedId = 0;
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter zaposleni id: ");
            try {
                selectedId = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Zaposleni id isn't valid! \n");
            }
        }
        return selectedId;
    }
    
    public int menu() {
        System.out.println("");
        System.out.println("+-----------------------+");
        System.out.println( "|" + ShowZaposleni + ". Show all zaposleni" + "\t|");
        System.out.println( "|" + AddZaposleni + ". Add zaposleni" + "\t|");
        System.out.println( "|" + UpdateZaposleni + ". Update zaposleni" + "\t|");
        System.out.println( "|" + DeleteZaposleni + ". Remove zaposleni" + "\t|");
        System.out.println( "|" + ExitProgram + ". Exit" + "\t\t|");
        System.out.println("+-----------------------+");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 4) {
                    System.out.println("Selected item doesn't exist. Please try again");
                    continue;
                }
                break;
            } catch (Exception ex) {
                System.out.println("Invalid selection. Please try again");
            }
        }
        return choice;
    }
}