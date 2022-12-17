package javaapplication292;

import java.util.ArrayList;
import java.util.List;

public class Match {

    List players = new ArrayList();
    int id;

    public Match(int id) {
        this.id = id;
        this.players = new ArrayList();
    }

    public void Start() {
        System.out.println("Match " + this.id + " is started");
    }
}
