package javaapplication300;

import com.sun.org.apache.xalan.internal.utils.FactoryImpl;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class JavaApplication300 {

    public static void main(String[] args) throws IOException {
        
        Socket socket = new Socket("localhost", 1500);
        
        InputStream ulaz = socket.getInputStream();
        OutputStream izlaz = socket.getOutputStream();
        
        izlaz.write("24\r\n".getBytes());
        izlaz.write("20\r\n".getBytes());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(ulaz));
        
        System.out.println("Rezultat je " + br.readLine());
        
    }
    
}
