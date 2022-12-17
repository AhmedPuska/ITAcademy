package javaapplication103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class JavaApplication103 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> igraci = new HashMap<String, Integer>(){
            {
                put("peter",10);
                put("sally",11);
            }
        };
        ServerSocket ss = new ServerSocket(1500);
        while(true){
        Socket socket = ss.accept();
        BufferedReader ulaz = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        OutputStream izlaz = socket.getOutputStream();
        
        String poruka = ulaz.readLine().trim();
//        String poruka = "move, sally, 15";
        String[] messageParts = poruka.split(",");
        
        String command = messageParts[0];
        String pl = messageParts[1];
        String value = messageParts[2];
        
        switch(command){
            
            case  "move":
                int pos = Integer.parseInt(messageParts[2]);
                igraci.put(pl, pos);
                break;
            case "reset":
                for (Map.Entry<String, Integer> player : igraci.entrySet())
                    player.setValue(0);
                break;
        }
        
            for (Map.Entry<String, Integer> player : igraci.entrySet()){
                System.out.println("Player " + player.getKey() + " is on positon " + player.getValue());
            }
        }
    }
}