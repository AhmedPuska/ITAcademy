package javaapplication131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class JavaApplication131 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1000);
        InputStream stream = socket.getInputStream();
        OutputStream stream1 = socket.getOutputStream();
        
        stream1.write("4\r\n".getBytes());
        stream1.write("13\r\n".getBytes());
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        System.out.println("Rezultat je " + reader.readLine());
    }
}