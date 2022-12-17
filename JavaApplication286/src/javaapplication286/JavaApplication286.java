package javaapplication286;

import java.util.Scanner;

public class JavaApplication286 {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Baza b = new Baza();
//        b.hiscoreList();
//        
//        
        //LotteryGames
        System.out.print("Choose game (Gamble/BlackRed) :");
        Scanner scanner = new Scanner(System.in);
        String game_name = scanner.nextLine();
        IGame game = (IGame)Class.forName("javaapplication286."+game_name).newInstance();
        while(true) {
            game.pick();
        }
//        
//        Bank<Visa> bank1 = new Bank<>(new Visa());
//        bank1.pay();
//        Bank<Master> bank2 = new Bank<>(new Master());
//        bank2.pay();
//        
//  
        //Game BatAndBall
//        Game game = new Game();
//        game.allObjects.add(new Bat(game));
//        game.allObjects.add(new Ball(game));
//        game.run();
    }
    
}
