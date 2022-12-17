/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author user
 */
public class JavaApplication104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1500);
        BufferedReader ulaze = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        OutputStream izlaz = socket.getOutputStream();
        
        izlaz.write("move,peter,15\r\n".getBytes());
        
    }
    
}
