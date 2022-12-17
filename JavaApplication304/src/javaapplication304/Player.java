package javaapplication304;

import java.io.Serializable;

public class Player implements Serializable {

    public String name;
    public int x;
    public int y;

    @Override
    public String toString() {
        return name + "," + x + "," + y;
    }

}
