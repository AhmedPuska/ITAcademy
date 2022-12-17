/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication144;

import java.io.IOException;  
 import java.net.*;  
 import java.io.*;  
  import java.awt.*;  
  import java.awt.event.*;  
public class Klijent extends Thread {
    static Frame f;  
   static Label l1;  
    static Label l2;  
    static TextField tf1;  
   static TextField tf2;  
    static TextField tfr;  
    static Button b;  
    static String rezultat;  
      
    public void run(){  
      //GUI  
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
       
      b = new Button("Izracunaj");  
      b.addActionListener(new ActionListener () {  
        @Override  
       public void actionPerformed(ActionEvent ae) {  
         try( Socket soc = new Socket("localhost",1050);  
          BufferedOutputStream bos = new BufferedOutputStream (soc.getOutputStream());) {  
          
           bos.write((tf1.getText()).getBytes());  
           bos.write(("o").getBytes());  
           bos.write((tf2.getText()).getBytes());  
           bos.flush();  
         }  
         catch (IOException e){}  
       }  
     });  
      gbc.gridx = 3;  
    gbc.gridy = 8;  
      gbc.gridwidth = 2;  
gbc.insets = new Insets(20,0,0,0);  
f.add(b, gbc);  
f.setVisible(true);

while(true){  
        try ( ServerSocket sS = new ServerSocket(1051);  
Socket soc2 = sS.accept();  
BufferedReader bis = new BufferedReader( new InputStreamReader(soc2.getInputStream()));){  
          
            tfr.setText(bis.readLine());  
}  
catch (IOException ex) {}  
}  
}    
  }  