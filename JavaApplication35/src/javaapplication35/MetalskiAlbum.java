package javaapplication35;
public class MetalskiAlbum extends Album {
    
    public MetalskiAlbum(String naziv, String izvodjac, int godina) {
        super(naziv, izvodjac, godina);
    }
    
    @Override
    String getPlaylist(){
        return "Metalska playlista" + this.playlist;
    }
    void play(){
        System.out.println("Playing heavy metal");
        super.play();
    }
    
    
}
