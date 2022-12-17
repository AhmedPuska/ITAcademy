package javaapplication287;

import java.util.Scanner;

public class MainMenu {

    public static MenuOption RenderMenu() {
        System.out.println("1. New bill 2. all bills 3. delete bills 4. exit progam");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int choice = sc.nextInt();
                MenuOption res = MenuOption.values()[choice - 1];
                return res;
            } catch (Exception ex) {
                System.out.println("Invalid choice. Please try again");
                sc.next();
            }
        }
    }
}
