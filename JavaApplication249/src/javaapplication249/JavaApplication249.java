
package javaapplication249;

import generated.Movie;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaApplication249 {
    public static void main(String[] args) throws JAXBException, FileNotFoundException, InterruptedException {
        int x = 10;
        while (true) {
            Movie m = new Movie();
            m.setTitle("Star Wars");
            m.setYear(x++);

            JAXBContext ctx = JAXBContext.newInstance("generated");

            Marshaller mars = ctx.createMarshaller();
            mars.marshal(m, new FileOutputStream("c:/wamp64/www/movie.xml"));
            
            Thread.sleep(1000);
        }
    }
    
}