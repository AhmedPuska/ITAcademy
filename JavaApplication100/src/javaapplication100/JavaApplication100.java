/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author user
 */
public class JavaApplication100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bafer = new byte[16];
        DatagramPacket p = new DatagramPacket(bafer, bafer.length);
        p.setAddress(InetAddress.getByName("127.0.0.1"));
        p.setPort(1500);
        ds.send(p);
    }
    
}
