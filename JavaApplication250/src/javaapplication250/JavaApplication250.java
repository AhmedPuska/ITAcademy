package javaapplication250;

import generated.Movie;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JavaApplication250 {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext ctx = JAXBContext.newInstance("generated");
        Unmarshaller unm = ctx.createUnmarshaller();
        Movie movie = (Movie) unm.unmarshal(new FileInputStream("c:/wamp64/www/movie.xml"));
        
        System.out.println(movie.getTitle());
        System.out.println(movie.getYear());
        
        
    }
    
}