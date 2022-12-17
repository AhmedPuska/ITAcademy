package swingdialogs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
public String getDisplayName() {
        return "My panel";
}
    public static void main(String[] args) {
        
//        MyChooserPanel chooserPanel = new MyChooserPanel();
//        chooserPanel.setVisible(true);
        
        
        JFileChooser jfc = new JFileChooser();
        
        if(JFileChooser.CANCEL_OPTION == jfc.showOpenDialog(null))
        JOptionPane.showMessageDialog(null, "File is not selected");
        else if(jfc.getSelectedFile() != null)
        JOptionPane.showMessageDialog(null, jfc.getSelectedFile().getPath());
        
        
//        JFrame f = new JFrame();
//        
//        f.setSize(300,100);
//        f.setLayout(new FlowLayout());
//
//        JColorChooser jcc = new JColorChooser();
//        JDialog dialog = JColorChooser.createDialog(null, "Choose color", true, jcc, new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null, "Ok pressed");
//        }
//        }, null);
//        jcc.removeChooserPanel(jcc.getChooserPanels()[0]);
//        dialog.setVisible(true);
//        Color c = jcc.showDialog(null, "Choose background color", Color.yellow);
//        f.getContentPane().setBackground(c);
//        
//        
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
        
    }
}