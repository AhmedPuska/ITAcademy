
package javaapplication239;

import com.sun.jmx.remote.internal.Unmarshal;
import country.Country;
import country.ObjectFactory;
import country.Root;
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JavaApplication239 {

    public static void main(String[] args) throws JAXBException {
        
        
        JAXBContext jaxbc = JAXBContext.newInstance("country");
        
        Unmarshaller unmarshaller = jaxbc.createUnmarshaller();
        
        Root root = (Root)unmarshaller.unmarshal(new File("country.xml"));
        
        List<Country> countries = root.getCountry();
        
        for (Country countrie : countries) {
            
            System.out.println("Name: " + countrie.getName());
            System.out.println("Capital: " + countrie.getCapital());
            System.out.println("Code: " + countrie.getCountryCode());
            System.out.println("Desc: " + countrie.getDescription());
        }
        
    }
}