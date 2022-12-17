package javaapplication292;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class World {

    String date;
    String latituda;
    String longituda;
    String vrijeme;
    String ime;

    public static World parse(String input) {
        World world = new World();
        String[] podaci = input.split(",");
        world.date = podaci[0];
        world.latituda = podaci[1];
        world.longituda = podaci[2];
        world.vrijeme = podaci[3];
        world.ime = podaci[4];
        return world;
    }

    @Override
    public String toString() {
        return date + " " + latituda + " " + longituda + " " + vrijeme + " " + ime;
    }
    
    
}
