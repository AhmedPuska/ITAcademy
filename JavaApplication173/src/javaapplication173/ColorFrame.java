package javaapplication173;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ColorFrame {
    static JFrame cf;
    static ImageIcon ii;
    
    static void startTheShow() {
        cf = new JFrame();
        cf.setSize(500, 200);
        cf.setLocation(500, 100);
        cf.getContentPane().setBackground(new Color(44, 50, 100));
        cf.setTitle("TIMER color frame");
        
        cf.setVisible(true);
    }
}