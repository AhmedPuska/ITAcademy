package javaapplication19;
public class JavaApplication19 {
    public static void main(String[] args) {
        Konj zimzelen = null;
        System.out.println(zimzelen);
        zimzelen = new Konj();
        zimzelen.ime        = "Zimzelen";
        zimzelen.brzina     = 1.5;
        zimzelen.rasa       = "Punokrvnjak";
        Konj sarenko = zimzelen;
        
        sarenko.brzina = 5;
        
        System.out.println(zimzelen.brzina);
        
    }
    
}
