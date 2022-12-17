package javaapplication112;


public class JavaApplication112 implements MyListener{
    
    static JavaApplication112 javaApplication112 = new JavaApplication112();
            
    public static void main(String[] args) throws InterruptedException {
        
        
        
        Reservour res = new Reservour();
        for(int i=0;i<100;i++){
            res.getFuel();
        }
        
        MyClass class1 = new MyClass();
        class1.addMyListeners(new JavaApplication112());
        class1.doSomeWork();
    }

    @Override
    public void onJobDone(MyEventArgs event) {
        System.out.println("Message from method: " + event.msg);
    }
}