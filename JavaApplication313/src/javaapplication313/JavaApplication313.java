package javaapplication313;

import generated.Movie;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaApplication313 {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Movie m = new Movie();
        m.setTitle("Star Wars");
        m.setYear(1977);
        
        JAXBContext ctx = JAXBContext.newInstance("generated");
        Marshaller mars = ctx.createMarshaller();
        mars.marshal(m, new FileOutputStream("c:/wamp64/www/movie.xml"));
        
        
    }
    
}
