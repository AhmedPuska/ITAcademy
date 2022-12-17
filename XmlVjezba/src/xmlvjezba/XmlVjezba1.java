
package xmlvjezba;

import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.*;
import org.xml.sax.InputSource;

public class XmlVjezba1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerConfigurationException, TransformerException {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
//        Document doc = db.parse("page.html");
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><books><book id=\"01\" isbn=\"12345\"><title>Childhood's End</title><author>Arthur Clarke</author></book></books>";
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource( new StringReader( xmlString ) );
        Document doc = db.parse(is);
        
        FileInputStream fis = new FileInputStream("myBooks.xml");
        Document doce = db.parse(fis);
      }
    
}
