package single;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance = null;

    private Object conn = null;

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private void connect() {
        if (conn == null) {
            System.out.println("Uspostavljam konekciju...");
            conn = "konekcija";
        }
    }

    public List<Object> querry(String sqlQuery) {
        connect();
        System.out.println("Izvrsavam upit...");
        ArrayList<Object> rezultati = new ArrayList<>();
        rezultati.add("Rezultat 1");
        rezultati.add("Rezultat 2");
        rezultati.add("Rezultat 3");
        return rezultati;
    }
}
