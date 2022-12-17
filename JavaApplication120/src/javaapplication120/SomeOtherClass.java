package javaapplication120;
public class SomeOtherClass {
    static SomeOtherClass instance;
    public int x;
    private SomeOtherClass() {
        
    }
    public static SomeOtherClass getInstance() {
        if (SomeOtherClass.instance==null)
            instance  = new SomeOtherClass();
        return instance;
    }
}