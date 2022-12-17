package javaapplication21;
public class JavaApplication21 {
    public static void main(String[] args) {
        
        String preuzetiPlaylist = "Rock or bust , Rock house...";
        
        Album album = new Album("Hajde", "AC DC", 2014);
        album.playlist  = "Playball, Rock or bust, Rock house...";
        album.play();
        album.play(preuzetiPlaylist);
        
        Album album1 = new Album("Dragan Lakovic","Dragan lakovic", 1977);
        album1.playlist = "Zakleo se bumbar, ivin voz, Drugarstvo...";
        album1.play(album1);
    }
    
}
