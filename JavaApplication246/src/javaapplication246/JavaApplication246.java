package javaapplication246;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class JavaApplication246 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document doc = (Document) db.parse("C:\\wamp64\\www\\prognoza.xml");
        
        Element root = doc.getDocumentElement();
        
        NodeList prognoze = root.getElementsByTagName("prognoza");
        for (int i = 0; i < prognoze.getLength(); i++) {
            Element prognoza = (Element) prognoze.item(i);
            String grad = prognoza.getElementsByTagName("grad").item(0).getTextContent();
//            System.out.println(prognoza.getTextContent());
//            String grad = prognoza.getFirstChild().getTextContent();
            System.out.println(grad);
            System.out.println(prognoza.getElementsByTagName("temperatura").item(0).getTextContent());
        }
        
        
        
        
//        Node prvoDijete = root.getFirstChild();
//        System.out.println(prvoDijete.getNextSibling().getTextContent());
        
    }
}