package javaapplication121;
public class JavaApplication121 {
    public static void main(String[] args) {
        MyClass class1 = MyClass.getInstance();
        MyClass class2 = MyClass.getInstance();
        
        class1.x = 100;
        class2.x = 20;
        
        System.out.println(class1.x);
    }
}