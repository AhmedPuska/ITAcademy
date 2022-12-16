/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        
        
        // JInterlan Frame 
        
//        JInternalFrame internalFrame = new JInternalFrame("My interlan frame");
//        internalFrame.add(new JButton("Button"));
//        internalFrame.setPreferredSize(new Dimension(200, 100));
//        
//        frame.add(internalFrame);
//        internalFrame.setVisible(true);
        



        //JTabbedPane sa JPanel prikazom
        
//        JTabbedPane jTabbedPane = new JTabbedPane();
//        
//        JPanel red = new JPanel();
//        red.setBackground(Color.red);
//        red.setPreferredSize(new Dimension(300, 100));
//        jTabbedPane.addTab("Red tab", red);
//        
//        JPanel yellow = new JPanel();
//        yellow.setBackground(Color.yellow);
//        yellow.setPreferredSize(new Dimension(300, 100));
//        jTabbedPane.addTab("Yellow tab", yellow);
//        
//        JPanel white = new JPanel();
//        white.setBackground(Color.white);
//        white.setPreferredSize(new Dimension(300, 100));
//        jTabbedPane.addTab("White tab", white);
//        
//        frame.add(jTabbedPane);
        
        

        //JSplitPane sa JPanel 
        
//        JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//        
//        JPanel p1 = new JPanel();
//        p1.setBackground(Color.gray);
//        
//        JPanel p2 = new JPanel();
//        p2.setBackground(Color.green);
//        
//        p1.setPreferredSize(new Dimension(200, 200));
//        p2.setPreferredSize(new Dimension(200, 200));
//        
//        jSplitPane.setLeftComponent(p1);
//        jSplitPane.setRightComponent(p2);
//        
//        frame.add(jSplitPane);
        


        //JTextArea and JScrollPane
        
//        JTextArea jTextArea = new JTextArea(10, 10);
//        jTextArea.setLineWrap(true);
//        
//        JScrollPane jScrollPane = new JScrollPane(jTextArea);
//        jScrollPane.setPreferredSize(new Dimension(200, 200));
//        
//        frame.add(jScrollPane);
        


        // JPanel containers
        
//        JPanel jPanel = new JPanel();
//        jPanel.add(new JButton("Button1"));
//        jPanel.add(new JButton("Button2"));
//        jPanel.add(new JButton("Button3"));
//        
//        jPanel.setSize(new Dimension(100, 100));
//        jPanel.setBackground(Color.gray);
//        
//        frame.add(jPanel);
        
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}