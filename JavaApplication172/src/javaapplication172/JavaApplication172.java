
package javaapplication172;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class JavaApplication172 {
    
    public static void main(String[] args) throws InterruptedException {
        JFrame f = new JFrame("Aplikacija");
        JCheckBox b = new JCheckBox();
                
        f.setLayout(new FlowLayout());
        f.setSize(600, 400);

        
        
        SwingUtilities.invokeLater(new Runnable() {  
        public void run() {  
          stMenu();  
        }  
      });  
    }  
        private static void stMenu() {
            if (!SystemTray.isSupported()) {  
        System.out.println("SystemTray is not supported");  
        return;  
      }  
        PopupMenu pm = new PopupMenu();
        MenuItem pmClose = new MenuItem("Close");
        MenuItem pmSet = new MenuItem("Settings");
        pmClose.addActionListener(new ActionListener() {  
        @Override  
        public void actionPerformed(ActionEvent e) {  
          System.exit(0);  
        }  
      });  
        pmSet.addActionListener(new ActionListener() {  
        @Override  
        public void actionPerformed(ActionEvent e) {  
        SetFrame frame = new SetFrame();
        frame.setSize(500, 400);  
        frame.setLocation(100, 200);  
        ImageIcon ii = new ImageIcon("rgb.png");  
        frame.setIconImage(ii.getImage());  
        frame.getContentPane().setBackground(new Color(44, 62, 80));  
        frame.setVisible(true);  
        }  
      });  
        pm.add(pmClose);  
      pm.add(pmSet); 
      
      SystemTray st = SystemTray.getSystemTray();  
     try {  
        Image img = ImageIO.read(new File("rgb.png"));  
        TrayIcon ico = new TrayIcon(img);  
        ico.setImageAutoSize(true);  
        ico.setToolTip("Assignment");  
        ico.setPopupMenu(pm);  
        st.add(ico);  
      } catch (Exception e) {  
       JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());  
      }  
//        int yourSide = JOptionPane.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Dark side", "Bright side"}, null);
//
//        switch(yourSide)
//        {
//        case JOptionPane.YES_OPTION:
//        JOptionPane.showMessageDialog(null, "You have choosen dark side");
//        break;
//        case JOptionPane.NO_OPTION:
//        JOptionPane.showMessageDialog(null, "You have choosen bright side");
//        break;
//        }
//        
        
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
    }
}