/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication171;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ColorFrame {
    static JFrame cf;  
    static ImageIcon ii;  
      
    static void startTheShow(){  
      cf = new JFrame();  
      cf.setSize(500,200);  
      cf.setLocation(605, 190);  
      cf.getContentPane().setBackground(new Color(44,62,80));  
      ii = new ImageIcon("E:\\rad\\java vjezbe\\JavaApplication171\\rgp.png");  
      cf.setIconImage(ii.getImage());  
      cf.setTitle("TA Color Frame");  
        
      cf.setVisible(true);  
    }  
}
