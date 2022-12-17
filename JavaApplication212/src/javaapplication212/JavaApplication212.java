package javaapplication212;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class JavaApplication212 {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        
        Player p = new Player();
        p.name = "Ahmed";
        p.x = 200;
        p.y = 200;
        
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("c:/wamp64/www/player.xml"));
        encoder.writeObject(p);
        encoder.close();
//        
//        Player p = new Player();
//        p.name = "Filip";
//        p.x = 20;
//        p.y = 34;
//        
//        Player p1 = new Player();
//        p1.name = "Ahmed";
//        p1.x = 45;
//        p1.y = 40;
//        
//        Random r = new Random();
//        while(true) {
//            p.x = r.nextInt(800);
//            p.y = r.nextInt(800);
//            p1.x = r.nextInt(800);
//            p1.y = r.nextInt(800);
//            FileOutputStream fos = new FileOutputStream("C:/wamp64/www/player.txt");
//            fos.write((p.serialize() + "\r\n").getBytes());
//            fos.write((p1.serialize() + "\r\n").getBytes());
//            fos.close();
//            Thread.sleep(2000);
//        }
    }
    
}
