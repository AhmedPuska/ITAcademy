package javaapplication108;
public class JavaApplication108 {
    public static void main(String[] args) throws InterruptedException {
        Game g = new Game();
        g.allObjects.add(new Bat(g));
        g.allObjects.add(new Ball(g));
        g.run();
    }
}
