package jcomponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.EtchedBorder;

public class MyComponent extends JComponent
{
    public MyComponent()
    {
        this.setPreferredSize(new Dimension(165, 20));
        this.setToolTipText("This is toolTip text!");
        this.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        this.setBorder(BorderFactory.createBevelBorder(1));
        this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        this.setBorder(BorderFactory.createMatteBorder(3, 3, 5, 5, Color.green));
        this.setBorder(BorderFactory.createTitledBorder("Border title")); // this.setPreferredSize(new Dimension(165, 60)); , g.fillRect(0, 0, 165, 60);, g.drawString("Hello from my component", 10, 40);
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 165, 20);
        g.setColor(Color.darkGray);
        g.drawString("Hello from my component", 10, 15);
    }
}