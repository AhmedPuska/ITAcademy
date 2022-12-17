package server;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static String rezultat;

    public static void main(String[] args) {
        while (true) {

            try (ServerSocket sServer = new ServerSocket(1000);
                    Socket cn = sServer.accept();
                    InputStream input = cn.getInputStream();
                    OutputStream output = cn.getOutputStream();
                    BufferedReader bis = new BufferedReader(new InputStreamReader(input));) {

                String operandi = bis.readLine();
                int num1 = Integer.parseInt(operandi.split(",")[0]);
                int num2 = Integer.parseInt(operandi.split(",")[1]);

                rezultat = String.valueOf(num1 + num2);
                output.write((rezultat + "\r\n").getBytes());

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (Socket cn = new Socket("localhost", 1001);
                    BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());) {
                bos.write(rezultat.getBytes());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
