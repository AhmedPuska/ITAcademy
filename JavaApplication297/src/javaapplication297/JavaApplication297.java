package javaapplication297;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaApplication297 {
    
    public static void main(String[] args) throws InterruptedException, SocketException, IOException {
        
        DatagramSocket ds = new DatagramSocket();
        byte[] bafer = "Hello world".getBytes();
        DatagramPacket dp = new DatagramPacket(bafer, bafer.length);
        dp.setAddress(InetAddress.getByName("localhost"));
        dp.setPort(1500);
        ds.send(dp);
        
        
//        ExecutorService pool = Executors.newCachedThreadPool();
//        
//        for (int i = 0; i < 10000; i++) {
//            pool.execute(() -> {
//                Projektil p = new Projektil();
//                p.fire();
//            });
//        }
        
//        for (int i = 0; i < 50000; i++) {
//
//            new Thread(() -> {
//                Projektil p = new Projektil();
//                p.fire();
//            }).start();
//            
//        }

    }

}
