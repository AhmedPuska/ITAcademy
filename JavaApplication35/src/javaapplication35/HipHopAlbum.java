package javaapplication35;
public class HipHopAlbum extends Album {
    
    public HipHopAlbum(String naziv, String izvodjac, int godina) {
        super(naziv, izvodjac, godina);
    }
    
    String getPlaylist(){
        return "Hip hop playlista: "+this.playlist;
    }
    void play(){
        System.out.println("Playing HipHop...");
        super.play();
    }
}
