/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;
import javafx.scene.canvas.GraphicsContext; 
public abstract class GameObject {
    int x;
    int y;
    int w;
    int h;
    double speed;
    Engine engine;
    public GameObject(Engine engine){
        this.engine = engine;
    }
    public abstract void update(double delta);
    public abstract void render(GraphicsContext g);
}
