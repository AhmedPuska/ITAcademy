package javaapplication150;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication150 {
    static Button b, b1;
    static Frame f;
    static Label l1, l2;
    static TextField tf1, tf2, tfr;
    static TextField text1, text2, racunica;
   public static void main(String[] args) {
       
       GridBagLayout lay = new GridBagLayout();  
        GridBagConstraints gbc = new GridBagConstraints();  
        f = new Frame("Klijent-Server");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension frameSize = f.getSize();  
        
        int x = (screenSize.width - frameSize.width) / 2;  
        int y = (screenSize.height - frameSize.height) / 2;  
        f.setLocation(x-250, y-200);  
        f.setSize(500,400);  
        f.setBackground(Color.darkGray);  
        f.addWindowListener(new WindowAdapter () {  
          public void windowClosing(WindowEvent e) {  
           System.exit(0);  
          }
        });
        f.setLayout(lay);  
        f.setVisible(true);  
        
        l1 = new Label("Prvi broj:");  
        l1.setForeground(Color.white);  
        gbc.gridx = 2;  
        gbc.gridy = 1;  
        f.add(l1,gbc);
        
        
        tf1 = new TextField();  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridx = 2;  
        gbc.gridy = 2;  
        gbc.insets = new Insets(0,0,0,0);  
        f.add(tf1,gbc);  
        
        l2 = new Label("Drugi broj:");  
        l2.setForeground(Color.white);  
        gbc.gridx = 5;  
        gbc.gridy = 1;  
        gbc.gridwidth = 1;  
        f.add(l2, gbc);  
        
        tf2 = new TextField();  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridx = 5;  
        gbc.gridy = 2;  
        gbc.insets = new Insets(0,0,0,0);  
        f.add(tf2, gbc);  
        
        
        tfr = new TextField();  
        tfr.setBackground(Color.darkGray);  
        tfr.setForeground(Color.yellow);  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridx = 2;  
        gbc.gridy = 4;  
        gbc.gridwidth = 4;  
        gbc.insets = new Insets(5,0,0,0);  
        f.add(tfr, gbc);
        
        
        f = new Frame("DEMO-Klijent-Server-DEMO");
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints controlGBC = new GridBagConstraints();
       
//        b = new Button("Izracunaj");
//        b.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent ae) {
//               try(Socket sc = new Socket("localhost",1000);
//                       OutputStream output = sc.getOutputStream();) {
//                   output.write((text1.getText()).getBytes());
//                   output.write(("o").getBytes());
//                   output.write((text2.getText()).getBytes());
//                   output.flush();
//               } catch (IOException ex) {
//                   System.out.println(ex.getMessage());
//               }
//           }
//       });
        
        
        f.setLayout(gridBagLayout);
        
        //controls goes here
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
 });
        text1 = new TextField("");
        text2 = new TextField("");
        f.add(text1);
        f.add(text2);
        text1.getText();
        text2.getText();
        racunica = new TextField();  
        racunica.setBackground(Color.darkGray);  
        racunica.setForeground(Color.yellow);  
        controlGBC.fill = GridBagConstraints.HORIZONTAL;  
        controlGBC.gridx = 2;  
        controlGBC.gridy = 4;  
        controlGBC.gridwidth = 4;  
        controlGBC.insets = new Insets(5,0,0,0);  
        f.add(racunica, controlGBC);
        f.setLocation(x-250, y-200);  
        f.setSize(500,400);  
        
        
        b = new Button("Izracunaj");
        b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               try(Socket sc = new Socket("localhost", 1000);
                       BufferedOutputStream bos = new BufferedOutputStream(sc.getOutputStream());) {
                   bos.write((text1.getText()).getBytes());
                   bos.write((",").getBytes());
                   bos.write((text2.getText()).getBytes());
                   bos.flush();
                   
               }catch (IOException ex) {
                   System.out.println(ex.getMessage());
               }
           }
       });
        controlGBC.gridx = 3;
        controlGBC.gridy = 8;
        controlGBC.gridwidth = 2;
        controlGBC.insets = new Insets(20,0,0,0);
        
        f.add(b, controlGBC);
        f.setVisible(true);
        
        while(true) {
            try (ServerSocket sS = new ServerSocket(1001);
                    Socket cn = sS.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(cn.getInputStream()));){
                racunica.setText(br.readLine());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
           }
        }
   }
}