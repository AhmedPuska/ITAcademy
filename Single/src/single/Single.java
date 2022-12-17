package single;

public class Single {

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    public static void m1() {
        Database db = Database.getInstance();
        db.querry("okk");
    }

    public static void m2() {
        Database db = Database.getInstance();
        db.querry("kakk");
    }

    public static void m3() {
        Database db = Database.getInstance();
        db.querry("ukkk");
    }
}
