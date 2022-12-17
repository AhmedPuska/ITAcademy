package javaapplication110;
public class Trka<T extends ITrkac, E extends ITrkac> {
    T t1;
    E t2;
    
    public void start(){
        t1.trci();
        t2.trci();
    }
}