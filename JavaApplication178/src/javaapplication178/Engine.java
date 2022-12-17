package javaapplication178;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Engine extends VBox{
    
    int GameWidth = 800;
    int GameHeight = 600;
    Canvas canvas;
    GraphicsContext g;
    Set<KeyCode> keyPool = new HashSet<KeyCode>();
    List<GameObject> actors = new ArrayList<GameObject>();
    
    Button btn1;
    
    public Engine() {
        canvas = new Canvas(GameWidth, GameHeight);
    }
    
    long lastTime = System.nanoTime();
    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            double timeElapsed = (now-lastTime);
            mainLoop(timeElapsed/100000000);
            lastTime = now;
        }
    };
    
    
    public void mainLoop(double delta) {
        canvas.getGraphicsContext2D().clearRect(0, 0, GameWidth, GameHeight);
        for(GameObject o : actors) {
            o.update(delta);
        }
        for(GameObject o : actors) {
            o.render(canvas.getGraphicsContext2D());
        }
        
        
    }
            
    public void init() {
        this.getChildren().add(this.canvas);
        this.canvas.requestFocus();
        this.canvas.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                keyPool.add(event.getCode());
            }
        });
        
        this.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                keyPool.remove(event.getCode());
            }
        });
        this.timer.start();
        
        
    }
}