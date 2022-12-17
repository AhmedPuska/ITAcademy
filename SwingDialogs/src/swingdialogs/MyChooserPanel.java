/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdialogs;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class MyChooserPanel extends AbstractColorChooserPanel {

    JTextField r;
    JTextField g;
    JTextField b;

    @Override
    public void updateChooser() {

    }

    @Override
    protected void buildChooser() {

         r = new JTextField("0",3);
         g = new JTextField("0",3);
         b = new JTextField("0",3);

         KeyListener kl = new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                getColorSelectionModel().setSelectedColor(new Color(
                        Integer.parseInt(r.getText()),
                        Integer.parseInt(g.getText()),
                        Integer.parseInt(b.getText())));
            }
        };

        r.addKeyListener(kl);
        g.addKeyListener(kl);
        b.addKeyListener(kl);

        add(r);
        add(g);
        add(b);
    }

    @Override
    public String getDisplayName() {
        return "My panel";
    }

    @Override
    public Icon getSmallDisplayIcon() {
        return new ImageIcon();
    }

    @Override
    public Icon getLargeDisplayIcon() {
        return new ImageIcon();
    }
}