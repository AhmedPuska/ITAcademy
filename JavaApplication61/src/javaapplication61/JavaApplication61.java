package javaapplication61;
public class JavaApplication61 {
    public static void main(String[] args) {
        Circle k = new Circle(4);
        System.out.println(Calc.area(k));   // 50.26548245743669

        Rectangle r = new Rectangle(2, 3);
        System.out.println(Calc.area(r));
    }
    
}
