package javaapplication117;

import java.util.Scanner;

public class JavaApplication117 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Kitana igrac1 = new Kitana();
//        SubZero igrac2 = new SubZero();
        Scanner s = new Scanner(System.in);
        while(true){
            IFight igrac = null;
            String odabraniIgrac = s.nextLine();
            
            Class klasa = Class.forName("javaapplication117." + odabraniIgrac);
            
            igrac = (IFight)klasa.newInstance();
            
            
//            switch(odabraniIgrac){
//                case "Katana":
//                    igrac = new Kitana();
//                    break;
//                case "SubZero":
//                    igrac = new SubZero();
//                    break;
//                case "Scorpio":
//                    igrac = new Scorpio();
//                    break;
//            }
            if (igrac!=null) {
                igrac.fight();
            }
        }
    }
}