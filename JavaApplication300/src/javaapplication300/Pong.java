package javaapplication300;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.util.Random;
import java.util.Timer;

public class Pong extends Canvas implements MouseListener {

    private Color curColor;
    private String curMessage;

    public Pong() {
        addMouseListener(this);

        curColor = Color.red;
        curMessage = "The square is red.";
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(Font.decode("Calibri-BOLD-24"));
        g.drawString(curMessage, 400, 100);

        g.setColor(curColor);
        g.fillRect(250, 100, 100, 100);
    }

    public void mouseClicked(MouseEvent evt) {
        System.out.println("You clicked at (" + evt.getX() + "," + evt.getY() + ")");

        curMessage = "The square is green.";

        repaint();
        curColor = Color.green;
    }

    public void mousePressed(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    public static void main(String[] args) {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("MouseDemo");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Pong());
        win.setVisible(true);
    }

}
