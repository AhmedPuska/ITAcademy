/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawtlayouts;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class JavaAWTLayouts {
   
public static Choice myChoice;
    public static void main(String[] args) throws InterruptedException {
        Frame f = new Frame();
        Label l = new Label("click me");
        Button b = new Button("Click me");
        b.setPreferredSize(new Dimension(110,50));
        f.add(b);
        
        List myCars = new List(10, true);
        
        
        myCars.add("Renault");
        myCars.add("BMW");
        myCars.add("Mercedes");
        f.add(myCars);


        f.add(b);
        f.add(myChoice);
        f.setVisible(true);

        
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((Button)e.getSource()).setLabel("Click performed");
            }
        });
l.addMouseListener(new MouseAdapter() {

     @Override
    public void mouseClicked(MouseEvent e) {
        ((Label)e.getComponent()).setText("clicked");
    }
});
f.add(l);
        LayoutManager layOut = new FlowLayout();
        f.setLayout(layOut);
        f.setSize(300, 300);

        ArrayList<String> myLabels = new ArrayList();
        myLabels.add("Mercedes");
        myLabels.add("Audi");
        myLabels.add("BMW");
        myLabels.add("Volvo");
       
        for (String myLabel : myLabels) {
            Label le = new Label(myLabel);
            f.add(le);
        }

        f.setVisible(true);
        
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
});
    }
}