/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication128;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author user
 */
public class JavaApplication128 {
public static void main(String[] args) throws SocketException, IOException {
        for (int i = 0; i < 1000; i++) {
            DatagramSocket ds = new DatagramSocket();
            byte[] buffer = String.valueOf(System.currentTimeMillis()).getBytes();
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            dp.setAddress(InetAddress.getByName("127.0.0.1"));
            dp.setPort(1000);
            ds.send(dp);
        }
    }
}
