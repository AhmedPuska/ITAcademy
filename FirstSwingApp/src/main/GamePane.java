///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package main;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.LayoutManager;
//import java.awt.Point;
//import java.util.List;
//import java.awt.Polygon;
//import java.awt.Rectangle;
//import java.util.ArrayList;
//import javax.swing.JPanel;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Collections;
//import java.util.Random;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;
//
//public class GamePane extends JPanel {
//    //grid frame
//    Polygon gridPol = new Polygon(new int[]{375,625,625,375}, new int[]{175,175,425,425},4);
//    //grid
//    private List<Rectangle> gridRect;
//    //shapes
//    Polygon shape1 = new Polygon(new int[]{200,300,300,250,250,200}, new int[]{300,300,450,450,350,350}, 6);
//    Polygon shape2 = new Polygon(new int[]{700,800,800,750,750,700}, new int[]{100,100,250,250,150,150}, 6);
//    Polygon shape3 = new Polygon(new int[]{850,900,900,800,800,850}, new int[]{250,250,450,450,400,400}, 6);
//    Polygon square = new Polygon(new int[]{50, 150, 150, 50}, new int[]{250, 250, 350, 350}, 4);
//    Polygon rect = new Polygon(new int[]{350, 550, 550, 350}, new int[]{100, 100, 150, 150}, 4);
//    Polygon t = new Polygon(new int[]{50,100,100,150,150,100,100,50}, new int[]{50,50,100,100,150,150,200,200}, 8);
//    private List<Polygon> shapes;
//    //selected shape
//    private Polygon hitBox;   
//    //colors and background
//    private List<Color> shapeColors; 
//    Color ran_color;
//    Image background;    
//       
//    public GamePane() throws IOException {
////        this.background = ImageIO.read(getClass().getResource("/back8.jpg"));
//        
//        gridRect = new ArrayList<>();
//        
//        shapes = new ArrayList<>();
//        Collections.addAll(shapes,shape1,shape2,shape3,square,rect,t);
//        
//        shapeColors = new ArrayList<>();
//        Collections.addAll(shapeColors, Color.CYAN, Color.GRAY, Color.GREEN, Color.ORANGE, Color.WHITE);
//        Random randomGenerator = new Random();
//        int index = randomGenerator.nextInt(shapeColors.size());
//        ran_color = shapeColors.get(index);
//
//        MouseAdapter handler;
//        handler = new MouseAdapter() {
//            
//            Point startDrag, endDrag; // start i end positions
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                startDrag = new Point(e.getX(), e.getY());
//                endDrag = startDrag;
//
//                //if click is inside a shape
//                for (Polygon p : shapes) {
//                    if (p.contains(startDrag)) { 
//                        hitBox = p;
//                        //moves selected shape on top
//                        while (shapes.indexOf(hitBox) != 0) {
//                            int i = shapes.indexOf(hitBox);
//                            Collections.swap(shapes, i, i - 1);
//                        }
//                        Collections.reverse(shapes);
//                        break;
//                    }
//                }
//                repaint();
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                endDrag = null;
//                startDrag = null;
//                hitBox = null;
//                
//                //first vicory combination
//                if(shape1.getBounds().x == 475 && shape1.getBounds().y == 225 &&
//                        shape2.getBounds().x == 425 && shape2.getBounds().y == 275 &&
//                        shape3.getBounds().x == 525 && shape3.getBounds().y == 225 &&
//                        square.getBounds().x == 375 && square.getBounds().y == 325 &&
//                        rect.getBounds().x == 425 && rect.getBounds().y == 175 &&
//                        t.getBounds().x == 375 && t.getBounds().y == 175){
//                                       
//                    InputStream inputStream = getClass().getResourceAsStream("/sound.wav");
//                    AudioStream audioStream = null;
//                        try {
//                            audioStream = new AudioStream(inputStream);
//                        } catch (IOException ex) {
//                            Logger.getLogger(GamePane.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    AudioPlayer.player.start(audioStream);                      
//                    
//                    JFrame win = new JFrame();
//                    JLabel juhu = new JLabel("Congratulations YOU WON!");
//                    juhu.setHorizontalAlignment(JLabel.CENTER);
//                    LayoutManager lay = new BorderLayout();
//                    win.setLayout(lay);
//                    win.setTitle("VICTORY!");
//                    win.setBackground(Color.DARK_GRAY);
//                    win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                    win.getContentPane().add(juhu, BorderLayout.CENTER);
//                    win.setSize(400, 200);
//                    win.setResizable(false);
//                    win.setLocationRelativeTo(null);
//                    win.setVisible(true);
//                } 
//                //second victory combination
//                if(shape2.getBounds().x == 475 && shape2.getBounds().y == 225 &&
//                        shape1.getBounds().x == 425 && shape1.getBounds().y == 275 &&
//                        shape3.getBounds().x == 525 && shape3.getBounds().y == 225 &&
//                        square.getBounds().x == 375 && square.getBounds().y == 325 &&
//                        rect.getBounds().x == 425 && rect.getBounds().y == 175 &&
//                        t.getBounds().x == 375 && t.getBounds().y == 175){
//                    
//                    InputStream inputStream = getClass().getResourceAsStream("/sound.wav");
//                    AudioStream audioStream = null;
//                        try {
//                            audioStream = new AudioStream(inputStream);
//                        } catch (IOException ex) {
//                            Logger.getLogger(GamePane.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    AudioPlayer.player.start(audioStream);
//                    
//                    JFrame win = new JFrame();
//                    JLabel juhu = new JLabel("Congratulations YOU WON!");
//                    juhu.setHorizontalAlignment(JLabel.CENTER);
//                    LayoutManager lay = new BorderLayout();
//                    win.setLayout(lay);
//                    win.setTitle("VICTORY!");
//                    win.setBackground(Color.DARK_GRAY);
//                    win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                    win.getContentPane().add(juhu, BorderLayout.CENTER);
//                    win.setSize(400, 200);
//                    win.setResizable(false);
//                    win.setLocationRelativeTo(null);
//                    win.setVisible(true);
//                } 
//            }
//
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                endDrag = new Point(e.getX(), e.getY());
//                int xtrans;
//                int ytrans;
//
//                if (hitBox != null) {   //click inside shape
//                    
//                    if(hitBox.getBounds().x <= 0){ //if left edge is touched
//                        startDrag = new Point(1, e.getY());
//                        xtrans = 1 + startDrag.x;
//                        ytrans = endDrag.y - startDrag.y;
//                        hitBox.translate(xtrans, ytrans);   //shape moving
//                        repaint();
//                        startDrag = endDrag;                        
//                    }
//                    else if(hitBox.getBounds().x + hitBox.getBounds().width >= 1000){ //if right edge is touched
//                        ytrans = endDrag.y - startDrag.y;
//                        hitBox.translate(-1, ytrans);   
//                        repaint();
//                        startDrag = endDrag;                        
//                    }
//                    else if(hitBox.getBounds().y <= 0){ //upper edge touched
//                        startDrag = new Point(e.getX(), 1);
//                        xtrans = endDrag.x - startDrag.x;
//                        ytrans = 1 + startDrag.y;
//                        hitBox.translate(xtrans, ytrans);   
//                        repaint();
//                        startDrag = endDrag; 
//                    }
//                    else if(hitBox.getBounds().y + hitBox.getBounds().height >= 550){ //bottom edge touchedu
//                        xtrans = endDrag.x - startDrag.x;
//                        hitBox.translate(xtrans, -1);   
//                        repaint();
//                        startDrag = endDrag;                        
//                    }
//                    else if(gridPol.contains(endDrag)){ //moving inside grid
//                        for(Rectangle r : gridRect) {
//                            if(r.contains(endDrag)) {
//                                hitBox.translate(r.getBounds().x - hitBox.getBounds().x, r.getBounds().y - hitBox.getBounds().y);
//                            }
//                        } 
//                        repaint();
//                        startDrag = endDrag;                        
//                    }
//                    else { //moving inside window, outside grid
//                        xtrans = endDrag.x - startDrag.x;
//                        ytrans = endDrag.y - startDrag.y;
//                        hitBox.translate(xtrans, ytrans);   
//                        repaint();
//                        startDrag = endDrag;                    
//                    }
//                }
//            }
//        };
//
//        addMouseListener(handler);
//        addMouseMotionListener(handler);
//        
//    }    
//
//    @Override
//    protected void paintComponent(Graphics g) {        
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        //painting background and grid frame
//        g2d.drawImage(background, 0, 0, this);
//        g2d.setColor(Color.DARK_GRAY);
//        g2d.fillPolygon(gridPol);
//        //painting grid
//        int x=375;
//        int y=175;
//        int n=50;
//        g2d.setColor(Color.YELLOW);
//        for(int i=0; i<5; i++) {
//            for(int j=0; j<5; j++) {
//                g2d.drawRect(x,y,n,n);
//                gridRect.add(new Rectangle(x,y,n,n));
//                x+=50;
//            }
//            x=375;
//            y+=50;
//        }
//        //painting shapes
//        g2d.setColor(ran_color);
//        g2d.fillPolygon(shape1);
//        g2d.fillPolygon(shape2);
//        g2d.fillPolygon(shape3);
//        g2d.fillPolygon(square);
//        g2d.fillPolygon(rect);
//        g2d.fillPolygon(t);
//
//        g2d.dispose();
//    }
//}