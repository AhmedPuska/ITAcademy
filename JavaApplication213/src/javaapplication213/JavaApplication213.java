
package javaapplication213;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javaapplication215.Player;

public class JavaApplication213 {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        Random r = new Random();
        ServerSocket ss =  new ServerSocket(2000);
        Socket socket = ss.accept();
        OutputStream izlaz = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(izlaz);
        while(true) {
            Player p = new Player();
            p.name = "Ahmed";
            p.x = r.nextInt(800);
            p.y = r.nextInt(600);
            oos.writeObject(p);
            Thread.sleep(2);
        }
    }
}