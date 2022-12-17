package javaapplication298;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class JavaApplication298 {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds = new DatagramSocket(1500);
        byte[] bafer = new byte[16];
        
        DatagramPacket dp = new DatagramPacket(bafer, bafer.length);
        
        while (true) {
            ds.receive(dp);

            System.out.println(new String(dp.getData()));
        }
    }
    
}
