package javaapplication35;
public abstract class Album {
    String naziv;
    String izvodjac;
    int godina;
    String playlist;
    
    static String najjaciBend = "Rokeri s Moravu";
    
    Album(String naziv, String izvodjac, int godina){
        this.naziv = naziv;
        this.izvodjac = izvodjac;
        this.godina = godina;
        
    }
    
//    String getPlaylist(){
//        return this.playlist;
//    }
    abstract String getPlaylist();
    
    void play (){
        System.out.println("Playing...");
        System.out.println(this.getPlaylist());
    }
    
    
}
