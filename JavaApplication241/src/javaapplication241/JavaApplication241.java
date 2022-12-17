
package javaapplication241;


import java.io.File;
import java.util.List;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class JavaApplication241 {
    public static void main(String[] args) throws DatatypeConfigurationException, JAXBException, SAXException {
        
        /*ObjectFactory objectFactory = new ObjectFactory();
        
        Ruler ruler = objectFactory.createRuler();
        ruler.setRulerName("Joachim Gauck");
        
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        
        GregorianCalendar birthday = new GregorianCalendar();
        birthday.set(1940, 01, 24);
        
        XMLGregorianCalendar xml_birthday = datatypeFactory.newXMLGregorianCalendar(birthday);
        
        ruler.setDateOfBirth(xml_birthday);
        
        Country country = objectFactory.createCountry();
        country.setName("Germany");
        country.setCapital("Berlin");
        country.setCountryCode("de");
        country.setDescription("Germany is ...");
        country.setPopulation(80716000);
        country.setRuler(ruler);
        
        JAXBContext jaxbc = JAXBContext.newInstance("generated");
        
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("country.xsd"));
        
        Marshaller marshaller = jaxbc.createMarshaller();
        
        marshaller.setSchema(schema);
        marshaller.setEventHandler(new XmlValidationEventHandler());
        
        marshaller.marshal(country, new File("out.xml"));
        */
        
        JAXBContext jaxbc = JAXBContext.newInstance("generated");
        
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("country.xsd"));
        
        Unmarshaller unmarshaller = jaxbc.createUnmarshaller();
        
        unmarshaller.setSchema(schema);
        unmarshaller.setEventHandler(new XmlValidationEventHandler());
        
//        Root root = (Root)unmarshaller.unmarshal(new File("country.xml"));
//        
//        List<Country> countries = root.getCountry();
//        
//        for (Country countrie : countries) {
//            
//            System.out.println("Name: " + countrie.getName());
//            System.out.println("Capital: " + countrie.getCapital());
//            System.out.println("Code: " + countrie.getCountryCode());
//            System.out.println("Desc: " + countrie.getDescription());
//            System.out.println("Population: " + countrie.getPopulation());
//            System.out.println("Ruler name: " + countrie.getRuler().getRulerName());
//            System.out.println("Ruler birthday: " + countrie.getRuler().getDateOfBirth());
//        }
        
    }
}