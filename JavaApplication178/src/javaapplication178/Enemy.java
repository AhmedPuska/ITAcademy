/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication178;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author user
 */
public class Enemy extends GameObject {

    public Enemy(Engine engine) {
        super(engine);
        this.x = 0;
        this.y = engine.GameHeight - 40;
        this.w = 40;
        this.h = 5;
        this.speed = 100;
    }

    @Override
    public void update(double delta) {
        this.x += this.speed*delta;
        if(this.x <= 0 || this.x + this.w >= this.engine.GameWidth) {
            this.speed *= -1;
        }
    }

    @Override
    public void render(GraphicsContext g) {
        g.setFill(Color.RED);
        g.fillRect(x, y, w, h);
    }
    
}
