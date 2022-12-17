package javaapplication301;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class JavaApplication301 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Player p = new Player();
        p.name = "Ahmed";
        p.x = 20;
        p.y = 34;

        Player p1 = new Player();
        p1.name = "Muhamed";
        p1.x = 49;
        p1.y = 94;

        FileOutputStream fos = new FileOutputStream("C:\\wamp64\\www\\player.txt");
        fos.write((p.serialize() + "\r\n").getBytes());
        fos.write((p1.serialize() + "\r\n").getBytes());
        fos.close();
    }

}
