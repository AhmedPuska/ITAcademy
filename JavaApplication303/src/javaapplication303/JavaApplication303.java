package javaapplication303;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javaapplication304.Player;

public class JavaApplication303 {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 2000);
        InputStream ulaz = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(ulaz);

        Player p;
        while ((p = (Player) ois.readObject()) != null) {
            System.out.println(p);
        }
    }

}
