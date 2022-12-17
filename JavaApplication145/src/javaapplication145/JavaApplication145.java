
package javaapplication145;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class JavaApplication145 {
    public static void main(String[] args) throws SocketException, IOException {
        
        try (ServerSocket sServer = new ServerSocket(1000);
                Socket cn = sServer.accept();
                BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());)
        {
            String req = bis.readLine();
            String reqPage = req.split(" ")[1].replace("/", "");
 
            try (FileInputStream fs = new FileInputStream(reqPage);) {
                int readByte;
                while ((readByte = fs.read()) != -1) {
                    bos.write((byte) readByte);
                }
            }
 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        try(DatagramSocket dServer = new DatagramSocket(1500);) {
//            byte[] buff = new byte[128];
//            
//            while(true) {
//                DatagramPacket p = new DatagramPacket(buff, buff.length);
//                System.out.println("Listening...");
//                dServer.receive(p);
//                String clientName = new String(p.getData(), 0, p.getLength());
//                
//                System.out.println(clientName + " connected...");
//                
//                String response = "Hello to " + clientName + " from Java server";
//                buff = response.getBytes();
//                
//                p = new DatagramPacket(buff, buff.length, p.getAddress(), p.getPort());
//                System.out.println("Sending...");
//                
//                dServer.send(p);
//            }
//        }catch(IOException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}