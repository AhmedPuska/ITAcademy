/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication102 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1500);
        InputStream ulaz = socket.getInputStream();
        OutputStream izlaz = socket.getOutputStream();
        BufferedReader br = new BufferedReader( new InputStreamReader(ulaz));
        
        new Thread(()->{
            String line;
            try {
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            } catch(IOException ex){
                
            }
        }).start();
        
        Scanner s = new Scanner(System.in);
        while(true){
            izlaz.write((s.nextLine()+"\r\n").getBytes());
        }
    }
}