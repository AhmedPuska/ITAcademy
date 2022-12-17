/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication174;

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
    
    static void startTheShow() {
        cf = new JFrame();
        cf.setSize(500, 300);
        cf.setLocation(500, 100);
        cf.getContentPane().setBackground(new Color(44, 50, 100));
        cf.setTitle("TIMER color frame");
        
        cf.setVisible(true);
    }
}