package javaapplication306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication306 {

    public static void main(String[] args) throws UnknownHostException, IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            Socket socket = new Socket(InetAddress.getLocalHost(), 1500);

            BufferedReader ulaz = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream izlaz = socket.getOutputStream();

            izlaz.write((sc.nextLine() + "\r\n").getBytes());
        }

    }

}
