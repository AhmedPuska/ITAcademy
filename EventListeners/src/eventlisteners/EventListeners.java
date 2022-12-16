
package eventlisteners;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListeners {
    
    static JButton btn;
    static JFrame f;
    static JFrame f1;
    
    public static void main(String[] args) {
        
        MyForm form = new MyForm();
        form.setVisible(true);
        
//        JFrame form = new JFrame();
//        form.setLayout(new FlowLayout());
//
//        JButton button = new JButton("Runner");
//        form.add(button);
//
//        form.addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e) {
//                button.setLocation(e.getX(), button.getLocation().y);
//            }
//        });
//
//        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        form.setSize(600, 400);
//        form.setLocationRelativeTo(null);
//        form.setVisible(true);
        
    }
}