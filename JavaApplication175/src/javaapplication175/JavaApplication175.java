package javaapplication175;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaApplication175 {

    public static void main(String[] args) {
        int dialogButton = JOptionPane.showOptionDialog(null, "Choose option?", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings", "Cancel"}, null); 
        
        switch(dialogButton) {
            case JOptionPane.YES_OPTION:
                MyForm frame = new MyForm();
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(null);
                frame.getContentPane().setBackground(new Color(122, 186, 122));
                frame.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
        }
    }
}
