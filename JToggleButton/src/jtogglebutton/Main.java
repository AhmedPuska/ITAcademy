package jtogglebutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Main {

    public static void main(String[] args) {
        
        MyForm form = new MyForm();
        form.setVisible(true);
        
        
//        JFrame f = new JFrame("What do you prefer?");
//        f.setSize(300,100);
//        f.setLayout(new FlowLayout());
//
//         ActionListener osListener = new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//
//               if(e.getActionCommand().equals("macos"))
//                   JOptionPane.showMessageDialog(null, "You prefer Mac OS");
//               if(e.getActionCommand().equals("ms"))
//                   JOptionPane.showMessageDialog(null, "You prefer Microsoft Windows");
//               if(e.getActionCommand().equals("linux"))
//                   JOptionPane.showMessageDialog(null, "You prefer Linux");
//            }
//        };
//
//        ButtonGroup myChoices = new ButtonGroup();
//
//        JRadioButton macos = new JRadioButton("Mac OS");
//        macos.setActionCommand("macos");
//        macos.addActionListener(osListener);
//
//        JRadioButton ms = new JRadioButton("Microsoft");
//        ms.setActionCommand("ms");
//        ms.addActionListener(osListener);
//
//        JRadioButton linux = new JRadioButton("Linux");
//        linux.setActionCommand("linux");
//        linux.addActionListener(osListener);
//
//        myChoices.add(macos);
//        myChoices.add(ms);
//        myChoices.add(linux);
//
//        ms.setSelected(true);
//  linux.setSelected(true);
//  macos.setSelected(true);
//
//        f.add(macos);
//        f.add(ms);
//        f.add(linux);
//
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setLocationRelativeTo(null);
        
        
        
//        JFrame f = new JFrame();
//        f.setSize(300,100);
//        f.setLayout(new FlowLayout());
//        
////        JRadioButton macos = new JRadioButton("Mac OS");
//        ButtonGroup myChoices = new ButtonGroup();
//
//        JRadioButton macos = new JRadioButton("Mac OS");
//        JRadioButton linux = new JRadioButton("Linux OS");
//        JRadioButton win = new JRadioButton("Windows OS");
//
//        myChoices.add(macos);
//        myChoices.add(linux);
//        myChoices.add(win);
//        
//        macos.setSelected(true);
//        linux.setSelected(true);
//        win.setSelected(true);
//        
//        String cmd = myChoices.getSelection().getActionCommand();
//        if(cmd.equals("macos"))
//        
//        f.add(macos);
//        f.add(linux);
//        f.add(win);
//
//        
//        JCheckBox cb = new JCheckBox("Do you agree?", true);
//        System.out.println(cb.isSelected());
//        cb.setSelected(false);
//        System.out.println(cb.isSelected());
////        cb.setIcon(new ImageIcon("cow.png"));
////        cb.setSelectedIcon(new ImageIcon("mySelectedIcon.png"));
////        cb.setDisabledIcon(new ImageIcon("myDisabledIcon.png"));
////        cb.setPressedIcon(new ImageIcon("myPressedIcon.png"));
//        
//        JToggleButton jtb = new JToggleButton("Hello, click me!");
//        jtb.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//               ((JToggleButton) e.getItem()).setText((e.getStateChange() == ItemEvent.SELECTED) ? "Active" : "Inactive");
//            }
//        });
//        
//        f.add(cb);
////        f.add(macos);
//        f.add(jtb);
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
    }   
}