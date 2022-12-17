package javaapplication285;

public class User {

    public int Id;
    public String ime;

    public User(int id, String ime) {
        this.Id = id;
        this.ime = ime;
    }

    @Override
    public String toString() {
        return Id + " " + ime;
    }
    
}
