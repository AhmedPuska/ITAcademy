
package main;

import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("MyJFrame", GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].getDefaultConfiguration());
//        frame.setLayout(new FlowLayout());
//        frame.add(new JButton("Click"));
////        frame.remove(frame.getContentPane().getComponent(0));
//        JButton b = new JButton("Napolje");
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.exit(0);
//            }
//        });
//        frame.getContentPane().getComponents();
//
//for(int i=0; i<frame.getContentPane().getComponentCount(); i++)
// frame.getContentPane().getComponent(i);
//        frame.add(b);
//        frame.setLocation(100, 200);
//        JOptionPane.showMessageDialog(frame, "x:" + frame.getLocation().x + " y:" + frame.getLocation().y);
//        frame.setSize(600,400);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.dispose();
        MyJFrame frame = new MyJFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}