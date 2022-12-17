package javaapplication305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class JavaApplication305 {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> igraci = new HashMap<String, Integer>() {
            {
                put("hamdo", 10);
                put("hamo", 11);
            }
        };

        ServerSocket server = new ServerSocket(1500);
        while (true) {
            
            Socket socket = server.accept();

            BufferedReader ulaz = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream izlaz = socket.getOutputStream();
            
            String poruka = ulaz.readLine().trim();
            String[] porukaSplit = poruka.split(",");
            String command = porukaSplit[0];
            String key = porukaSplit[1];
            String value = porukaSplit[2];
            int pos = Integer.parseInt(value);
            igraci.put(key, pos);

            for (Map.Entry<String, Integer> player : igraci.entrySet()) {
                System.out.println("Player " + player.getKey() + " is on position " + player.getValue());
            }
        }
    }

}
