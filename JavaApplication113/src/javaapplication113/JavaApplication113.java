
package javaapplication113;
public class JavaApplication113 {
    public static void main(String[] args) throws InterruptedException {
        UI ui = new UI();
        Graphic g = new Graphic();
        Round r = new Round(UI.getUserFloat("Enter tank position:").intValue(),g); 
    }
    
}
