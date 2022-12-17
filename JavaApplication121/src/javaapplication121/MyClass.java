package javaapplication121;
public class MyClass {
    
    static MyClass instance;
    
    public int x;
    
    private MyClass() {
        
    }
    public static MyClass getInstance() {
        if (MyClass.instance == null) {
            instance = new MyClass();
        }
        return instance;
    }
}