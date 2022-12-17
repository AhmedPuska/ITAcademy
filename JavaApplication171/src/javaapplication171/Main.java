/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication171;

import javax.swing.*;  
  import java.awt.*;  
  import java.awt.event.*;  
  import java.io.File;  
  import javax.imageio.ImageIO;  
    
  /*  
8:   * Djordje Gavrilovic  
9:   */  
    
  public class Main {  
    public static void main(String[] args) {  
      SwingUtilities.invokeLater(new Runnable() {  
        public void run() {  
          stMenu();  
      }  
      });  
    }  
      
    private static void stMenu() {  
     if (!SystemTray.isSupported()) {  
        System.out.println("SystemTray is not supported");  
        return;  
      }  
      int dialogButton = JOptionPane.showOptionDialog(null, "Choose option?", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Cancel"}, null); 
        
        switch(dialogButton) {
            case JOptionPane.YES_OPTION:
                SetFrame frame = new SetFrame();
                frame.setSize(500, 400);  
                frame.setLocation(100, 200);  
                ImageIcon ii = new ImageIcon("E:\\rad\\java vjezbe\\JavaApplication171\\rgp.png");  
                frame.setIconImage(ii.getImage());  
                frame.getContentPane().setBackground(new Color(44, 62, 80));  
                frame.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
        }
        
      SystemTray st = SystemTray.getSystemTray();  
      try {  
        Image img = ImageIO.read(new File("E:\\rad\\java vjezbe\\JavaApplication171\\rgp.png"));  
        TrayIcon ico = new TrayIcon(img);  
        ico.setImageAutoSize(true);  
        ico.setToolTip("Assignment");    
        st.add(ico);
      } catch (Exception e) {  
        JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());  
     }  
    }
}   

