package javaapplication292;

public class User {

    public String id;
    public String name;
    public String score;

    public static User parse(String input) {
        User ret = new User();
        String[] array = input.split("-");
        ret.id = array[0];
        ret.name = array[1];
        ret.score = array[2];
        return ret;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.score;
    }
    
}
