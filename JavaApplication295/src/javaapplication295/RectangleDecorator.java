package javaapplication295;

public class RectangleDecorator {

    protected Rectangle r;
    protected int a;
    protected int b;

    public RectangleDecorator(Rectangle r) {
        this.r = r;
        this.a = r.a;
        this.b = r.b;
    }

    public int perimeter() {
        return 2 * (this.a * this.b);
    }
}
