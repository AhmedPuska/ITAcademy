package javaapplication106;

import java.util.Scanner;

public class JavaApplication106 {
    public static void main(String[] args) {
        
        System.out.println("LIST, INFO, CREATE_DIR, RENAME, COPY, MOVE, DELETE");
        System.out.print("Izaberite operaciju: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
        Operacije operacije = Operacije.valueOf(input);
        System.out.print("Funkcija je prihvacena ");
            switch(operacije) {
                case COPY:
                    Funkcije.copy();
                    break;
                case CREATE_DIR:
                    Funkcije.createDir();
                    break;
                case DELETE:
                    Funkcije.delete();
                    break;
                case INFO:
                    Funkcije.info();
                    break;
                case LIST:
                    Funkcije.list();
                    break;
                case MOVE:
                    Funkcije.move();
                    break;
                case RENAME:
                    Funkcije.rename();
                    break;
                default:
                    System.out.println("");
            }
        }
        catch (Exception ex) {
                System.out.println("Operacija ne postoji. " + "Pokusaj ponovno.");
        }
    }
}
