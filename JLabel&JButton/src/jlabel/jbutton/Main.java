package jlabel.jbutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame("What do you prefer?");
        f.setSize(300,100);
        f.setLayout(new FlowLayout());

         ActionListener osListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {

               if(e.getActionCommand().equals("macos"))
                   JOptionPane.showMessageDialog(null, "You prefer Mac OS");
               if(e.getActionCommand().equals("ms"))
                   JOptionPane.showMessageDialog(null, "You prefer Microsoft Windows");
               if(e.getActionCommand().equals("linux"))
                   JOptionPane.showMessageDialog(null, "You prefer Linux");
            }
        };

        ButtonGroup myChoices = new ButtonGroup();

        JRadioButton macos = new JRadioButton("Mac OS");
        macos.setActionCommand("macos");
        macos.addActionListener(osListener);

        JRadioButton ms = new JRadioButton("Microsoft");
        ms.setActionCommand("ms");
        ms.addActionListener(osListener);

        JRadioButton linux = new JRadioButton("Linux");
        linux.setActionCommand("linux");
        linux.addActionListener(osListener);

        myChoices.add(macos);
        myChoices.add(ms);
        myChoices.add(linux);

        ms.setSelected(true);
  linux.setSelected(true);
  macos.setSelected(true);

        f.add(macos);
        f.add(ms);
        f.add(linux);

        f.setVisible(true);
        
//        JFrame f = new JFrame();
//	f.setLayout(new FlowLayout()); //f.setLayout(new GridLayout(3, 2));
//	f.setSize(200, 200);
//	
//	Hashtable<String, String> values = new Hashtable<>();
//	values.put("www.yahoo.com", "Yahoo");
//	values.put("www.bing.com", "Bing");
//	values.put("www.google.com", "Google");
//
//	ButtonsAdd.addPair(values, f);
//	
//	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
//	f.setVisible(true);
        
        MyForm form = new MyForm();
        form.setVisible(true);
//        JFrame frame = new JFrame();
//        frame.setLayout(new FlowLayout());
//        
//        frame.setSize(600, 400);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }   
}