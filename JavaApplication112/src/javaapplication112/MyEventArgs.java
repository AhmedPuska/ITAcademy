package javaapplication112;

import java.util.EventObject;

class MyEventArgs extends EventObject {
    
    String msg;
    
    public MyEventArgs(Object o, String msg) {
        super(o);
        
        this.msg = msg;
    }
    
}