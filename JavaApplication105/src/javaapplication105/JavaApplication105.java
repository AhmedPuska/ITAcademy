/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author user
 */
public class JavaApplication105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1500);
        Socket socket = server.accept();
        BufferedReader ulaze = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        OutputStream izlaz = socket.getOutputStream();
    }
    
}
