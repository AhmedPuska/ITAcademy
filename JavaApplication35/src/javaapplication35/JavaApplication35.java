package javaapplication35;
public class JavaApplication35 {
    public static void main(String[] args) {
        MetalskiAlbum metal = new MetalskiAlbum("before i Forget", "Slipknot", 2000);
        Album.najjaciBend = "Depeshe Mode";
        HipHopAlbum hh = new HipHopAlbum("Many Men", "50 Cent",2005);
        Album.najjaciBend = "Nervozni Postar";
        
        
        System.out.println(hh.najjaciBend);
        System.out.println(metal.najjaciBend);
        
    }
    
}
