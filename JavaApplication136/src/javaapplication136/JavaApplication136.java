package javaapplication136;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication136 {
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        String commandString = "";
        while(true) {
            String command = scaner.nextLine();
            
            
            try(Socket cn = new Socket("localhost", 1000);
                BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                OutputStream os = cn.getOutputStream();) {
            
            
                    switch(command) {
                        case "1":
                            os.write("info,a,a\r\n".getBytes());

                            String fullInfoString = bis.readLine();
                            String woLastToken = fullInfoString.substring(0, fullInfoString.length()-1);
                            String[] info = woLastToken.split("\\|");
                            for(String playerInfo : info) {
                                System.out.println(playerInfo);
                            }
                            break;
                        case "2":
                            Random r = new Random();
                            os.write(("move,sally," + r.nextInt(100) + "\r\n").getBytes());
                            break;
                        case "3":
                            os.write("reset,a,a\r\n".getBytes());
                            break;
                    }
                } catch (IOException ex) {
                    System.out.println("Connection error: " + ex.getMessage());
            }
        }
    }   
}