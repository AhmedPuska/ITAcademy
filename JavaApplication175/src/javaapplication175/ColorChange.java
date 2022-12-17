/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication175;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ColorChange {
    static JFrame cC;
    
    static void startTheShow() {
        cC = new JFrame();
        cC.setSize(500, 200);
        cC.setLocation(500, 100);
        cC.getContentPane().setBackground(new Color(02, 84, 82));
        
        cC.setVisible(true);
    }
}
