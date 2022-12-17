/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcomponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.Border;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        MyComponent mc = new MyComponent();
        frame.add(mc);
        
        JButton btn = new JButton("Java");
        btn.setPreferredSize(new Dimension(250, 50));
        
        JButton btn2 = new JButton("I have focus");
        btn2.requestFocusInWindow();
//        btn2.setFocusable(false);
        frame.add(btn2);
        btn.addFocusListener(new FocusListener()
        {
        public void focusGained(FocusEvent e)
        {
        System.out.println("Hi, I have focus!");
        }

        public void focusLost(FocusEvent e)
        {
        System.out.println("I lost focus");
        }
        });
        
        Border b = BorderFactory.createLineBorder(Color.GREEN,5);
        btn.setBorder(b);
        btn.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
        frame.add(btn);
        
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
