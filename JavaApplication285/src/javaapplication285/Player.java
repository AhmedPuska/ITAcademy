package javaapplication285;

public class Player {

    private int id;
    private String name;

    public Player() {
    }
    
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void show() {
        System.out.println("Player " + getName());
    }
}
