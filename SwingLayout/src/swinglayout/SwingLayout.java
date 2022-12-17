package swinglayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

public class SwingLayout {
    static JButton invisible;
    
    static void switchButtons(JButton clickedButton) {
        if (invisible.getLocation().x < (clickedButton.getLocation().x - clickedButton.getSize().width)
                || invisible.getLocation().x > (clickedButton.getLocation().x + clickedButton.getSize().width)
                || invisible.getLocation().y < (clickedButton.getLocation().y - clickedButton.getSize().height)
                || invisible.getLocation().y > (clickedButton.getLocation().y + clickedButton.getSize().height)
                || (invisible.getLocation().y != clickedButton.getLocation().y
                && invisible.getLocation().x != clickedButton.getLocation().x))
        return;
        
        Point tmpLoc = clickedButton.getLocation();
        clickedButton.setLocation(invisible.getLocation());
        invisible.setLocation(tmpLoc);
    }
   public static void main(String[] args) {
       LayoutManager layOut = new GridLayout(3, 3);

		Frame ef = new Frame();
		ef.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
                ef.setLayout(layOut);
                
                JButton btn = new JButton();
                for (int i = 1; i < 13; i++) {
                    btn = new JButton(String.valueOf(i));
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            switchButtons((JButton) ae.getSource());
                        }
                    });
                ef.add(btn);
       }
        btn.setVisible(false);
        invisible = btn;
        ef.setSize(300, 300);
        ef.setVisible(true);
                
        JFrame frame = new JFrame();
        frame.getContentPane().add(btn);
       
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

for(int i=0; i<8; i++)
    frame.getContentPane().add(new JButton("Button " + i));

        JButton a = new JButton("Hello a");
        JButton b = new JButton("Hello b");
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(a).addComponent(b));
        layout.setVerticalGroup(layout.createParallelGroup().addComponent(a).addComponent(b));
        
        JFrame jFrame = new JFrame();
 jFrame.setLayout(new FlowLayout());
 jFrame.setSize(new Dimension(250, 150));
        
 JPanel redPnl = new JPanel();
 redPnl.setBackground(Color.gray);
 redPnl.setPreferredSize(new Dimension(100, 100));
 redPnl.add(new JButton("Gray"));
 redPnl.add(new JButton("Button"));
 redPnl.add(new JButton("Group"));

       JTextArea ta = new JTextArea();
ta.setLineWrap(true);

JFrame framee = new JFrame();
JScrollPane sp = new JScrollPane(ta);
sp.setColumnHeaderView(new JLabel("header column"));
sp.setRowHeaderView(new JLabel("header row"));
sp.setPreferredSize(new Dimension(500, 300));
JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

JFrame myFrame = new JFrame();

JTabbedPane jtp = new JTabbedPane();

//JPanel red = new JPanel();
//red.setBackground(Color.red);
//red.setPreferredSize(new Dimension(300,100));
//jtp.addTab("Red tab", red);
//
//JPanel yellow = new JPanel();
//yellow.setBackground(Color.yellow);
//yellow.setPreferredSize(new Dimension(300,100));
//jtp.addTab("Yellow tab", yellow);
//
//JPanel white = new JPanel();
//white.setBackground(Color.white);
//white.setPreferredSize(new Dimension(300,100));
//jtp.addTab("White tab", new ImageIcon("icon.png"), white);

myFrame.getContentPane().add(jtp);

for(int i=1; i<4; i++)
{
     JInternalFrame jif = new JInternalFrame("My internal frame " + i);
     jif.add(new JButton("click"));
     jif.setPreferredSize(new Dimension(200, 100));

     myFrame.add(jif);

     jif.setVisible(true);
     jif.setResizable(true);
     jif.setMaximizable(true);
}


myFrame.setSize(500,400);
myFrame.setVisible(true);



JPanel leftC = new JPanel();
leftC.setBackground(Color.gray);
leftC.setPreferredSize(new Dimension(200,200));

JPanel rightC = new JPanel();
rightC.setBackground(Color.green);
rightC.setPreferredSize(new Dimension(200,200));

jsp.setLeftComponent(leftC);
jsp.setRightComponent(rightC);

framee.getContentPane().add(jsp);
framee.add(jsp);
jFrame.add(sp);
framee.setSize(500, 500);
framee.setVisible(true);



 JPanel yelPnl = new JPanel();
 yelPnl.setBackground(Color.green);
 yelPnl.setPreferredSize(new Dimension(100, 100));
 yelPnl.add(new JButton("Green"));
 yelPnl.add(new JButton("Button"));
 yelPnl.add(new JButton("Group"));

 jFrame.add(redPnl);
 jFrame.add(yelPnl);
        
 jFrame.setVisible(true);
 jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
 
//       SpringLayout layout = new SpringLayout();
//       frame.setLayout(layout);
//       
//       JButton a = new JButton("Hello a");
//       
//       layout.putConstraint(SpringLayout.WEST, a, 100, SpringLayout.WEST, frame);
//       layout.putConstraint(SpringLayout.NORTH, a, 150, SpringLayout.NORTH, frame);
//       
//       frame.add(a);
       
//       GroupLayout layout = new GroupLayout(frame.getContentPane());
//       frame.setLayout(layout);
//       
//       JButton a = new JButton("Hello a");
//       JButton b = new JButton("Hello b");
//       JButton c = new JButton("Hello c");
//       JButton d = new JButton("Hello d");
//       JButton e = new JButton("Hello e");
//       
//       layout.setAutoCreateGaps(true);
//       layout.setAutoCreateContainerGaps(true);
//       
//       layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(a).addComponent(b).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(c).addComponent(d)));
//       layout.setVerticalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b).addComponent(c)).addComponent(d));
       
       frame.setSize(600, 400);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}