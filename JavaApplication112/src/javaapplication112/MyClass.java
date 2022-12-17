package javaapplication112;

import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {
    
    private ArrayList<MyListener> allListeners = new ArrayList<>();
    public synchronized void addMyListeners(MyListener listener){
        allListeners.add(listener);
    }
    
    public synchronized void removeMyListeners(MyListener listener){
        allListeners.remove(listener);
    }
    
    private synchronized void fireEvent(){
        MyEventArgs myEventArgs = new MyEventArgs(this, "JobsDone");
        Iterator listeners = allListeners.iterator();
        
        while(listeners.hasNext()){
            ((MyListener)listeners.next()).onJobDone(myEventArgs);
        }
    }
    
    public void doSomeWork() throws InterruptedException{
        System.out.println("Work in progress...");
        Thread.sleep(3000);
    }
}
