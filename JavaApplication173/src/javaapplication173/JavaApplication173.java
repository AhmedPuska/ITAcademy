/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication173;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class JavaApplication173 {
 
 
    public static void main(String[] args) {
        MyForm m = new MyForm();
        m.setVisible(true);
        final JFrame framee = new JFrame("Popup Menu Demo");
        
        int dialogButton = JOptionPane.showOptionDialog(null, "Choose option?", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Cancel"}, null); 
        
        switch(dialogButton) {
            case JOptionPane.YES_OPTION:
                SetFrame frame = new SetFrame();
                frame.setSize(500, 400);  
                frame.setLocation(100, 200);  
                ImageIcon ii = new ImageIcon("rgb.png");  
                frame.setIconImage(ii.getImage());  
                frame.getContentPane().setBackground(new Color(02, 84, 82));  
                frame.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
        }
        
        
        
//        if (JOptionPane.showConfirmDialog(null, "Choose option?", "Option dialog",
//        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//            SetFrame frame = new SetFrame();
//                frame.setSize(500, 400);  
//                frame.setLocation(100, 200);  
//                ImageIcon ii = new ImageIcon("rgb.png");  
//                frame.setIconImage(ii.getImage());  
//                frame.getContentPane().setBackground(new Color(44, 62, 80));  
//                frame.setVisible(true);
//        } else {
//            System.exit(0);
//        }
        
        
//        ImageIcon icon = new ImageIcon("E:\\rad\\java vjezbe\\JavaApplication173\\src\\javaapplication173\\rgp.png");
//	int input = JOptionPane.showConfirmDialog(null, "Do you like turtles?", "Be honest...",
//			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        
        
//        // build poup menu
//        final JPopupMenu popup = new JPopupMenu();
//        // New project menu item
//        JMenuItem menuItem = new JMenuItem("Settings",
//                new ImageIcon("images/newproject.png"));
//        menuItem.setMnemonic(KeyEvent.VK_P);
//        menuItem.getAccessibleContext().setAccessibleDescription(
//                "New Project");
//        menuItem.addActionListener(new ActionListener() {
// 
//            public void actionPerformed(ActionEvent e) {
//                SetFrame frame = new SetFrame();
//                frame.setSize(500, 400);  
//                frame.setLocation(100, 200);  
//                ImageIcon ii = new ImageIcon("rgb.png");  
//                frame.setIconImage(ii.getImage());  
//                frame.getContentPane().setBackground(new Color(44, 62, 80));  
//                frame.setVisible(true);  
//            }
//        });
//        popup.add(menuItem);
//        // New File menu item
//        menuItem = new JMenuItem("Close",
//                new ImageIcon("images/newfile.png"));
//        menuItem.setMnemonic(KeyEvent.VK_F);
//        menuItem.addActionListener(new ActionListener() {
// 
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        popup.add(menuItem);
// 
//        // add mouse listener
//        frame.addMouseListener(new MouseAdapter() {
// 
//            @Override
//            public void mousePressed(MouseEvent e) {
//                showPopup(e);
//            }
// 
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                showPopup(e);
//            }
// 
//            private void showPopup(MouseEvent e) {
//                if (e.isPopupTrigger()) {
//                    popup.show(e.getComponent(),
//                            e.getX(), e.getY());
//                }
//            }
//        });
 
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
 
    }
}