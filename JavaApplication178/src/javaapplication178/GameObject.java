package javaapplication178;

import javafx.scene.canvas.GraphicsContext;

public abstract class GameObject {
    
    int x;
    int y;
    int w;
    int h;
    double speed;
    Engine engine;
    
    public GameObject(Engine engine) {
        this.engine = engine;
    }
    
    public abstract void update(double delta);
    
    public abstract void render(GraphicsContext g);
}