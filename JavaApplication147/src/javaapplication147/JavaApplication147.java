
package javaapplication147;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class JavaApplication147 {

    
    static String rezultat; 
    
    public static void main(String[] args) throws IOException {
        
        try(Socket cn = new Socket("localhost", 1000);
        InputStream input = cn.getInputStream();
                OutputStream output = cn.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(input));
                BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());) {
         
            
            output.write("Dobar dan\r\n".getBytes());
            System.out.println("Server kaze");
            System.out.println(br.readLine());
            
            Scanner sc = new Scanner(System.in);
            System.out.println(br.readLine());
            
            System.out.println("Prvi operand");
            
            String op1 = sc.nextLine();
            System.out.println("Drugi operand");
            
            String op2 = sc.nextLine();
            
            String poruka = (op1.trim()+","+op2.trim())+"\r\n";
            output.write(poruka.getBytes());
            System.out.println("Rezultat je");
            System.out.println(br.readLine());
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}