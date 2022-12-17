package udpserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPServer {
    public static void main(String[] args) {
        try (DatagramSocket dServer = new DatagramSocket(1000);){
            
            byte[] buffer = new byte[128];
            
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            
            System.out.println("listening...");
            
            dServer.receive(p);
            
            String message = new String(p.getData(), 0, p.getLength());
            System.out.println(message);
            
            String response = "Hello from Java server.";
            buffer = response.getBytes();
            p = new DatagramPacket(buffer, buffer.length, p.getAddress(), p.getPort());
            
            System.out.println("sending...");
            
            dServer.send(p);
            
        } catch (SocketException ex) {
            System.out.println("Error in connection: " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}