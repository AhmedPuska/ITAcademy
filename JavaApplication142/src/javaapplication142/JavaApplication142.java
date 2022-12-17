
package javaapplication142;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaApplication142 {
    
    public static void main(String[] args) throws InterruptedException {
        Frame f = new Frame("Hello java, this is container");
        Label l = new Label("Click me");
        l.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ((Label)e.getComponent()).setText("Mouse clicked");
            }
});
        f.add(l);
        f.setSize(300,100);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
});
    }
}