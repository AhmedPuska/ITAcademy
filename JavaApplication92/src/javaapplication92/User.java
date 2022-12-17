package javaapplication92;

import java.io.Serializable;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class User implements Serializable {
    public int id;
    public String model;
    public double maximumSpeed;

    @Override
    public String toString()
    {
        return this.id + " " + this.model + " " + this.maximumSpeed;
    }
}
