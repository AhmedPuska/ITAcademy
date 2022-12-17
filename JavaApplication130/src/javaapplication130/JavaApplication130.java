package javaapplication130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaApplication130 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1000);
        Socket socket = server.accept();
        InputStream stream = socket.getInputStream();
        OutputStream stream1 = socket.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        
        String br1String = br.readLine();
        int br1 = Integer.parseInt(br1String);
        String br2String = br.readLine();
        int br2 = Integer.parseInt(br2String);
        
        System.out.println(String.format("Rezultat sabiranja brojeva %d i %d je %d", br1,br2,br1+br2));
        
        stream1.write((String.valueOf(br1+br2) + "\r\n").getBytes());
        
    }    
}