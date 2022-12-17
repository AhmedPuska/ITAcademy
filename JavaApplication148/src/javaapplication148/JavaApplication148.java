
package javaapplication148;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication148 {
    static String rezultat;
    public static void main(String[] args) {
//        1.3  Događaji
//
//2.7  Uvod u internet mrežne protokole
//2.8  TCP Socket programiranje
//2.9  UDP Socket programiranje
//
//4.15  Uvod u 2D grafiku i AWT
//4.16  Java AWT Layouts
//4.17  Java AWT kontrole
//
//Takođe, u repozitorijumu ovog kursa dodatno Vam je video predavanje AJAVA-Assignment_(klijent-server).Mp4 kao pomoć pri izradi tog zadatka. Preporučujem da ga pogledate.
//
//
//Neophodno je u dve zasebne main klase(u jednom projektu), napraviti klasu Klijent, i klasu Server. Klasa Klijent salje poruku serveru da mu sabere dva broja. Server prima ta dva broja od klijenta, sabira ih i isporucuje ih Klijentu, koji to onda prikaze u korisnickom boksu. Tu koristis AWT, a za sam protokol koristis TCP koji ti je celokupan prikazan u lekciji sa streamovima. Najbolje koristiti DataInputStream. Isto tako, u Klijentu, ceo kod ti treba biti pod ActionListener-om,koji je na dugmetu u korisnickom interfejsu, jer pritiskom na njega ces aktivirati ceo kod koji serveru salje poruku. 
//Isto pregledaj prepiske po fejsu ko je vec radio, i na wall, za druge savete i ostalo.
//Srecno! 
//
//
//Možete da koristite ili GUI (2 TextField-a za sabirke, 1 Button za pokretanje računanja i 1 TextField ili Label za zbir) ili komandnu liniju (ulaz i izlaz u konzoli).
        while(true) {
            
            try (ServerSocket sServer = new ServerSocket(1000);
                    Socket cn = sServer.accept();
                    InputStream input = cn.getInputStream();
                    OutputStream output = cn.getOutputStream();
                    BufferedReader bis = new BufferedReader(new InputStreamReader(input));)
                
            {
//                output.write("Zdravo\r\n".getBytes());
//                System.out.println("Server ocekuje obracanje klijenta");
//                System.out.println(bis.readLine());
//                output.write("Zdravo, izvoli te?\r\n".getBytes());
//                
//                output.write("Unesite operande\r\n".getBytes());
                String operandi = bis.readLine();
                System.out.println("Operandi su: " + operandi);
                
                int num1 = Integer.parseInt(operandi.split(",")[0]);
                int num2 = Integer.parseInt(operandi.split(",")[1]);
                
                rezultat = String.valueOf(num1 + num2);
                output.write((rezultat + "\r\n").getBytes());
                   
            } catch (IOException e) {
//                System.out.println("Exception caught when trying to listen on port " + 1000);
                System.out.println(e.getMessage());
            }
            try(Socket cn = new Socket("localhost", 1001);
                    BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());) {
                bos.write(rezultat.getBytes());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}