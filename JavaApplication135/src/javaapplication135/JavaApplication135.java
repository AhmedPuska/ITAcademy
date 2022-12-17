package javaapplication135;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class JavaApplication135 {
    public static void main(String[] args) {
        Map<String,Integer> igraci = new HashMap<String, Integer>(){
            {
                put("peter",10);
                put("sally",11);
            }
        };
        
        while(true) {
            try(ServerSocket sServer = new ServerSocket(1000);
                Socket cn = sServer.accept();
                BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                OutputStream os = cn.getOutputStream();) {
                
                String message = bis.readLine().trim();
                String[] messageParts = message.split(",");
                
                String command = messageParts[0];
                String pl = messageParts[1];
                String value= messageParts[2];
                
                switch(command) {
                    case "info":
                        for(Map.Entry<String, Integer> player : igraci.entrySet()) {
                            os.write(("Player " + player.getKey() + " is on position " + player.getValue() + "|").getBytes());
                        }
                        os.write("\r\n".getBytes());
                        break;
                    case "move":
                        int pos = Integer.parseInt(messageParts[2]);
                    igraci.put(pl, pos);
                        break;
                    case "reset":
                        for(Map.Entry<String, Integer> player : igraci.entrySet()) {
                            player.setValue(0);
                        }
                        break;
                }
                
                
                for(Map.Entry<String, Integer> player : igraci.entrySet()) {
                    System.out.println("Player " + player.getKey() + " is on position " + player.getValue());
                }
                
            } catch (IOException ex) {
                System.out.println("Connection error: " + ex.getMessage());
            }
        }
    }    
}