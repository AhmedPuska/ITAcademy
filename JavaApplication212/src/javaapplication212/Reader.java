
package javaapplication212;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/wamp64/www/player.txt")));
        
        List<Player> igraci = new ArrayList<Player>();
        
        String line;
        while((line=br.readLine())!=null) {
            igraci.add(Player.deserialize(line));
        }
        System.out.println(igraci);
    }
}
