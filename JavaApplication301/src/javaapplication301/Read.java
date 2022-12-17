package javaapplication301;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\wamp64\\www\\player.txt")));
        
        List<Player> player = new ArrayList();
        
        String line;
        
        while((line=br.readLine())!=null) {
            player.add(Player.deserialize(line));
        }
        
        System.out.println(player);
        
//        for(Player read : player) {
//            System.out.println(read.serialize());
//        }
    }
}
