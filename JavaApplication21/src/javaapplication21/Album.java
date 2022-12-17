package javaapplication21;
public class Album {
    
    String naziv;
    String izvodjac;
    String playlist;
    int godina;
    
    Album (String naziv , String izvodjac, int godina){
    this.naziv      = naziv;
    this.izvodjac   = izvodjac;
    this.godina     = godina;
}
    void play(){
        System.out.println("Playing...");
        System.out.println(this.playlist);
    }
    
    void play (Album album){
        String playlistaDrugogAlbuma = album.playlist;
        album.playlist=null;
        this.play(playlistaDrugogAlbuma);
    }
    
    void play(String playlist){
        System.out.println("Playing...");
        System.out.println(playlist);
    }
}
