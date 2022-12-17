/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication129;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class JavaApplication129 {
    public static void main(String[] args) throws SocketException, IOException {
            DatagramSocket ds = new DatagramSocket(1000);
            byte[] buffer = new byte[16];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            while(true) {
                
                ds.receive(dp);
                System.out.println(new String(dp.getData()));
            }
      }
}