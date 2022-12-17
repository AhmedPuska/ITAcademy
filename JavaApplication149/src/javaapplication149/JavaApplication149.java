
package javaapplication149;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class JavaApplication149 {
//    static Frame f1;
//    static TextField t1, t2;
//    static Label l1, l2, l3;
//    static Button b1;
//    static Panel p1, p2, p3, p4;
    
    public JavaApplication149() {
//        f1= new Frame("Add two number");
//        l1= new Label("Enter first number");
//        l2= new Label("Enter second number");
//        l3= new Label("");
//        t1= new TextField(10);
//        t2= new TextField(10);
//        b1= new Button("Add");
        
        
        
        createFrame();
        AddfourPanelToFrame();
        
        
        
    }
    private void createFrame() {
//        f1.setLayout(new GridLayout(4,1));
//        f1.setSize(400,300);
//        f1.setVisible(true);
    }
    
    private void AddfourPanelToFrame() {
        
    }
    
    
    public static void main(String[] args) {
        try (Socket cn = new Socket("localhost", 1000);
                BufferedReader bis = new BufferedReader(new InputStreamReader(cn.getInputStream()));
                BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());)
        { 
            bos.write("Dobar dan\r\n".getBytes());
            bos.write("GET /search?q=java HTTP/1.1\r\n\r\n".getBytes());
            System.out.println("Server kaze");
            System.out.println(bis.readLine());
            
//            Scanner sc = new Scanner(System.in);
            System.out.println("koju ces operaciju ---sabiranja---");
//            String operacija = sc.nextLine()+"\r\n";
//            bos.write(operacija.getBytes());
            System.out.println(bis.readLine());
            bos.flush();
            String line;
            while ((line = bis.readLine()) != null) {
                System.out.println(line); 
            }           
        }
        catch(IOException exception)
        {
            System.out.println(exception.getMessage());
        }
        
    }
}