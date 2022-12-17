package javaapplication302;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javaapplication304.Player;

public class JavaApplication302 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {

        
        Random r = new Random();
        ServerSocket server = new ServerSocket(2000);
        Socket socket = server.accept();
        OutputStream izlaz = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(izlaz);
        while (true) {
            Player p = new Player();
            p.name = "Ahmed";
            p.x = r.nextInt(800);
            p.y = r.nextInt(600);
            oos.writeObject(p);
            
            Thread.sleep(10);
        }
//        
//        
//        Player p = new Player();
//        p.name = "Ahmed";
//        p.x = 300;
//        p.y = 200;
//        
//        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("c:/wamp64/www/player.xml"));
//        encoder.writeObject(p);
//        encoder.close();

    }

}
