
package xmlvjezba2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class XmlVjezba2 {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        
        XMLInputFactory xmlif = XMLInputFactory.newFactory();
        
        Reader reader = new FileReader("intro.xml");
        XMLEventReader xmler = xmlif.createXMLEventReader(reader);
        
        while (xmler.hasNext()) {

            XMLEvent event = xmler.nextEvent();
            switch (event.getEventType()) {
                
                case XMLStreamReader.START_ELEMENT:
//                    System.out.println("START_ELEMENT");
                    
                    StartElement startElement = event.asStartElement();
                    
                    String elementName = startElement.getName().toString();
                    
                    switch(elementName) {
                        case "book":
                            Iterator i = startElement.getAttributes();
                            
                            while(i.hasNext()) {
                                
                                Attribute attribute = (Attribute)i.next();
                                System.out.println(attribute.getName() + " = " + attribute.getValue());
                            }
                            break;
                            
                        case "title":
                            System.out.println("Title " + xmler.getElementText());
                            break;
                            
                        case "author":
                            System.out.println("Author: " + xmler.getElementText() + "\n");
                            break;
                    }
                    
//                    System.out.println(" Start element: " + xmlsr.getName());

                    break;
                
            }
        }
        
//        for (int i = 0; i < xmlsr.getAttributeCount(); i++) {
//            String attributeName = xmlsr.getAttributeLocalName(i);
//            String attributeValue = xmlsr.getAttributeValue(i);
//            System.out.println("Attribute value for " + attributeName + " = " + attributeValue);
//        }
 
    }
    
}