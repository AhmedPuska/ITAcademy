///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package main;
//
//import java.awt.BorderLayout;
//import java.awt.Cursor;
//import java.awt.Image;
//import java.awt.LayoutManager;
//import java.awt.Point;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
///**
// *
// * @author djordje gavrilovic
// */
//public class Main extends JFrame {
//
//    static JButton reset;
//    static Main frame;
//    static Cursor cursor;
//
//    public Main() throws IOException {
//        // custom-cursor. not full color on Linux
//        Toolkit tk = Toolkit.getDefaultToolkit();
////        Image img = ImageIO.read(getClass().getResource("/rocket_curs3.png")); 
//        Point point = new Point(0, 0);
////        cursor = tk.createCustomCursor(img, point, "rocketcursor");
//    }
//    
//
//    static void setGUI() throws IOException {
//        frame = new Main();
//        LayoutManager lay = new BorderLayout();
//        frame.setLayout(lay);
//        frame.setCursor(cursor);
//        frame.setTitle("Puzzle");
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.getContentPane().add(new GamePane());
//        frame.getContentPane().add(reset, BorderLayout.PAGE_END);
//        frame.setSize(1000, 600);
//        frame.setResizable(false);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//    
//
//    public static void main(String[] args) throws IOException {
//        
//        reset = new JButton("Reset");
//        reset.addActionListener((ActionEvent e) -> {
//            frame.dispose();
//            try {
//                setGUI();
//            } catch (IOException ex) {
//                System.out.println("ALARM! ALARM!: " + ex.getMessage());
//            }
//
//        });
//        setGUI();
//    }
//
//}