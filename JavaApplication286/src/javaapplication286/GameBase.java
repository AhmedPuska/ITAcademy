package javaapplication286;

import java.util.Scanner;

public class GameBase {

    public int getUserInput(String message) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            try {
                return sc.nextInt();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
