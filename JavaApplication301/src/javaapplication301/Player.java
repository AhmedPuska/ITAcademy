package javaapplication301;

public class Player {

    public String name;
    public int x;
    public int y;

    public static Player deserialize(String player) {
        String[] playerParts = player.split("\\,");
        Player p = new Player();
        p.name = playerParts[0];
        p.x = Integer.valueOf(playerParts[1]);
        p.y = Integer.valueOf(playerParts[2]);
        return p;
    }

    public String serialize() {
        return name + "," + x + "," + y;
    }

    @Override
    public String toString() {
        return serialize();
    }
    
    
}
