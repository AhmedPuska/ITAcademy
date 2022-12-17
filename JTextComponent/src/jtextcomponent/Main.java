package jtextcomponent;

import com.sun.java.swing.plaf.motif.MotifTextUI.MotifCaret;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.MaskFormatter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.rtf.RTFEditorKit;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        
        MyForm form = new MyForm();
        form.setVisible(true);
        
//        JFrame f = new JFrame();
//f.setSize(300,200);
//f.setLayout(new FlowLayout());

////JEditorPane ep = new JEditorPane("http://www.google.com");
////JEditorPane ep = new JEditorPane(new URL("http://www.google.com"));
//JEditorPane ep = new JEditorPane("text/html","Hello <strong>HTML!</strong>");
//RTFEditorKit rek = new RTFEditorKit();
//SimpleAttributeSet attr = new SimpleAttributeSet();
//StyleConstants.setFontFamily(attr, "Verdana");
//StyleConstants.setFontSize(attr, 25);
//rek.getInputAttributes().addAttributes(attr);
//
//f.add(ep);

//JTextArea ta = new JTextArea(10, 20);
//ta.setWrapStyleWord(false);
//ta.setLineWrap(true);
//
//JScrollPane sp = new JScrollPane(ta);
//f.add(sp);
//sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//ta.append("New text");
//ta.insert("Inserted text", 2);


//f.setVisible(true);
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        JFrame f = new JFrame();
//        f.setSize(300,100);
//        f.setLayout(new FlowLayout());
//
//        JTextField tf = new JTextField("Press enter here", 10);
//        final JButton btn = new JButton("Not default button");
//        btn.addActionListener(new ActionListener()
//  {
//            public void actionPerformed(ActionEvent e)
//{
//               JOptionPane.showMessageDialog(null, "Button is pressed!");
//            }
//        });
//
//        f.add(tf);
//        f.add(btn);
//        tf.addKeyListener(new KeyAdapter()
//  {
//            @Override
//            public void keyReleased(KeyEvent e)
//{
//                if(e.getKeyCode() == 10)
//                    btn.doClick();
//            }
//        });
//        f.setVisible(true);
//  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//  
//        JFormattedTextField ftf = new JFormattedTextField(new MaskFormatter("###-###-###"));
//        f.add(ftf);
//        JPasswordField pf = new JPasswordField(10);
//        pf.setEchoChar('#');
//        pf.setText("HELLO");
//
//        f.add(pf);
//
//        for(Character c : pf.getPassword())
//        JOptionPane.showMessageDialog(null, c.toString());

        
//        JTextField tf = new JTextField("Hello from my field!Hello from my field!Hello from my field!Hello from my field!Hello from my field!Hello from my field!Hello from my field!Hello from my field!Hello from my field!Hello from my field!");
//        Document tfDoc = tf.getDocument();
//        String myText = tfDoc.getText(0, tfDoc.getLength());
//        tf.setSelectionStart(10);
//        tf.setSelectionEnd(20);
//        tf.setSelectedTextColor(Color.YELLOW);
//        tf.setSelectionColor(Color.GRAY);
//        
//        Caret c = new MotifCaret();       
//        tf.setCaret(c);
//        System.out.println(tf.getCaret().getDot());
//        tf.getCaret().addChangeListener(new ChangeListener()
//        {
//        public void stateChanged(ChangeEvent e)
//        {
//        Caret c = (Caret) e.getSource();
//        JOptionPane.showMessageDialog(null, c.getDot());
//        }
//        });
//        
////        JTextField tf = new JTextField("Hello from my component!");
//        tf.selectAll();
//        tf.copy();
//        tf.write(new FileWriter("myText.txt"));
//        tf.read(new FileReader("myText.txt"), tf.getDocument());
        
//        frame.add(tf);
//        
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }
}