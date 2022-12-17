
package javaapplication146;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaApplication146 {
    public static void main(String[] args) throws IOException {
        while(true) {
            try(ServerSocket sServer = new ServerSocket(1000);
                    Socket cn = sServer.accept();
                    InputStream input = cn.getInputStream();
                    OutputStream output = cn.getOutputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(input));) {
                
                output.write("Zdravo".getBytes());
                System.out.println("Server ocekuje obracanje klijenta ");
                System.out.println("Klijent kaze: ");
                System.out.println(br.readLine());
                output.write("sta oces?\r\n".getBytes());
                BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());


                    output.write("unesi operand\r\n".getBytes());
                    String operandi = br.readLine();
                    System.out.println("Operandi su");
                    System.out.println(operandi);

                    int op1 = Integer.parseInt(operandi.split(",")[0]);
                    int op2 = Integer.parseInt(operandi.split(",")[1]);

                    int rezultat= op1 + op2;
                    output.write((rezultat + "\r\n").getBytes());
                }
        catch(IOException ex){
                        System.out.println(ex.getMessage());
                        }
        }
    }
}