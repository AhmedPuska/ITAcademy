/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication127;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 *
 * @author user
 */
public class JavaApplication127 {
    public static void main(String[] args) {
        try (DatagramSocket dServer = new DatagramSocket(1000);)
        {
 
            byte[] buff = new byte[128];
 
            while (true) {
                DatagramPacket p = new DatagramPacket(buff, buff.length);
                System.out.println("Listening...");
                dServer.receive(p);
                String clientName = new String(p.getData(), 0, p.getLength());
 
                System.out.println(clientName + " connected...");
 
                String response = "Hello to" + clientName + " from Java server";
                buff = response.getBytes();
 
                p = new DatagramPacket(buff, buff.length, p.getAddress(), p.getPort());
                System.out.println("Sending...");
 
                dServer.send(p);
            }
 
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
