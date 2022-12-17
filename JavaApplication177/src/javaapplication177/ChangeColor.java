/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication177;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ChangeColor {
    static JFrame f;
    
    static void startChangeColor() {
        f = new JFrame();
        f.setSize(500, 300);
        f.setLocation(100, 300);
        f.getContentPane().setBackground(new Color(34, 45, 90));
        f.setVisible(true);
    }
}
