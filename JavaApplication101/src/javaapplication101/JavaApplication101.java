/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication101;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class JavaApplication101 {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds = new DatagramSocket(1500);
        byte[] bafer = new byte[16];
        DatagramPacket dp = new DatagramPacket(bafer, bafer.length);
        ds.receive(dp);
        System.out.println(dp.getData());
        
        
        
    }
    
}
