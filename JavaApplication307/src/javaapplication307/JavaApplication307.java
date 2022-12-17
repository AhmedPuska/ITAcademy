package javaapplication307;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Date;

public class JavaApplication307 {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ServerSocket server = new ServerSocket(1500);
        String ROOT = "c:/wamp64/www";
        String INDEX = "/index.html";

        while (true) {

            Socket socket = server.accept();

            BufferedReader ulaz = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream izlaz = socket.getOutputStream();

            String httpRequest = ulaz.readLine();
            String[] httpRequestPart = httpRequest.split(" ");
            String desiredPath = httpRequestPart[1].equals("/")?INDEX:httpRequestPart[1];

            String line;
            
            System.out.println(httpRequest);
            while (!(line = ulaz.readLine()).isEmpty()) {
                System.out.println(line);
            }
            
            if (desiredPath.contains(".ahmo")) {
                // /vrijeme.ahmo 
                
                String parts1 = desiredPath.split("/")[1];
                String className = parts1.split(".ahmo")[0];
                
                izlaz.write("HTTP/1.1 200 OK\r\nConnection: close\r\n\r\n".getBytes());
                Class klasa = Class.forName("javaapplication307." + className);
                AHMOResponse p = (AHMOResponse)klasa.newInstance();
                p.proces(izlaz);
                
            } else {

                File file = new File(ROOT + desiredPath);

                if (!file.exists()) {

                    izlaz.write("HTTP/1.1 404 Not Found\r\nConnection: close\r\n\r\n<html><body><div style='position: absolute; top: 50%; left: 50%; width:255px;height:145px;background-color:green' ><p style='position: absolute; top: 50%; left: 50%; margin-right: -50%; transform: translate(-50%, -50%); color:red; font-size:25px;'>Nema odgovora</p></div></body></html>".getBytes());
                } else {
                    izlaz.write("HTTP/1.1 200 OK\r\nConnection: close\r\n\r\nDobro dosli\r\n".getBytes());
                    FileInputStream fis = new FileInputStream(ROOT + desiredPath);

                    int bajt;

                    while ((bajt = fis.read()) != -1) {
                        izlaz.write(bajt);
                    }

                    fis.close();
                }
            }
            izlaz.flush();
            izlaz.close();
            socket.close();
        }
    }

}
