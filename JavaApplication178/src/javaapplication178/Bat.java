/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication178;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

/**
 *
 * @author user
 */
public class Bat extends GameObject{

    public Bat(Engine engine) {
        super(engine);
        
        this.x       = 0;
        this.y       = 0;
        this.w       = 20;
        this.h       = 50;
        this.speed   = 250;
    }

    @Override
    public void update(double delta) {
        if(engine.keyPool.contains(KeyCode.UP)) {
            y -= (speed*delta);
        }
        if(engine.keyPool.contains(KeyCode.DOWN)) {
            y += (speed*delta);
        }
        if(engine.keyPool.contains(KeyCode.LEFT)) {
            x -= (speed*delta);
        }
        if(engine.keyPool.contains(KeyCode.RIGHT)) {
            x += (speed*delta);
        }
    }

    @Override
    public void render(GraphicsContext g) {
        g.setFill(Color.BLUE);
        g.fillRect(x, y, w, h);
    }
}