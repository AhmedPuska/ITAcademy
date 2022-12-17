package javaapplication137;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaApplication137 {
   public static void main(String[] args) throws IOException {
       ServerSocket sServer = new ServerSocket(1000);
       Socket cn = sServer.accept();
       BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
       BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());

       String linija;
       while(!(linija = bis.readLine()).isEmpty()) {
           System.out.println(linija);
       }
       bos.write("HTTP/1.1 200 OK\r\nContent-type: image\r\n\r\nHey man, are you still there???".getBytes());
    }
}