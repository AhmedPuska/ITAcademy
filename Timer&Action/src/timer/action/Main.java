
package timer.action;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import static javax.swing.Action.ACCELERATOR_KEY;
import static javax.swing.Action.ACTION_COMMAND_KEY;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

    static JFrame f;

    public static void main(String[] args) {

        f = new JFrame();
        f.setSize(300,300);

        Action myAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
               setEnabled(false);
               ((JButton) e.getSource()).setText(getValue("text").toString());

            }
        };
myAction.putValue(ACTION_COMMAND_KEY, "sayHello");
        for(int i=0; i<10; i++)
        {
            myAction.putValue("text", "Hello!");
//            myAction.putValue(ACTION_COMMAND_KEY, "sayHello");
            JButton btn = new JButton(myAction);
            f.add(btn);
        }
        f.setVisible(true);
    }
}