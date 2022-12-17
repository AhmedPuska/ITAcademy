
package javaapplication151;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication151 {
     static String rezultat; 
    public static void main(String[] args) {
        while(true) {
            System.out.println("Server is listening...");
            try(ServerSocket sServer = new ServerSocket(1000);
              
                    
                    Socket cn = sServer.accept();
//                    InputStream input = cn.getInputStream();
//                    OutputStream output = cn.getOutputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(cn.getInputStream()));) {
                    
                
                    System.out.println("Server ocekuje obracanje klijenta ");
                    System.out.println("Klijent kaze: ");
                    System.out.println(br.readLine());
//                    output.write("sta oces?\r\n".getBytes());
//                    BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
//                    BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());


//                    String operacija = br.readLine();
//                    System.out.println("Klijent je odabrao ");
//                    System.out.println(operacija);
//                    output.write("unesi operand\r\n".getBytes());
                    String operandi = br.readLine();
                    System.out.println("Operandi su");
                    System.out.println(operandi);

                    int op1 = Integer.parseInt(operandi.split(",")[0]);
                    int op2 = Integer.parseInt(operandi.split(",")[1]);

//                    String rezultat = "";
                    rezultat = String.valueOf(op1 + op2);
//                    switch(operacija) {
//                        case "+":
//                            rezultat = String.valueOf(op1+op2);
//                    break;
//                    }
//                    output.write((rezultat + "\r\n").getBytes());
                }
        catch(IOException ex){
                        System.out.println(ex.getMessage());
                        }
            try(Socket cn = new Socket("localhost",1001);
                    BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());) {
                bos.write(rezultat.getBytes());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}