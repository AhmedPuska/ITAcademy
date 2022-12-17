
package xmlvjezba;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerConfigurationException, TransformerException {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document doc = db.parse("intro.xml");
        
        Element root = doc.getDocumentElement();
        
        Element book = doc.createElement("book");
        Element title = doc.createElement("title");
        Element author = doc.createElement("author");
        
        book.appendChild(title);
        book.appendChild(author);
        
        root.appendChild(book);
        
        book.setAttribute("_id", "_03");
        book.setAttribute("isbn", "11222");
        title.setTextContent("The Caves of Steel");
        author.setTextContent("Isaac Asimov");
        
        DOMSource xmlDoc = new DOMSource(doc);
        String outputURL = "books_edit.xml";
        StreamResult result = new StreamResult(new FileOutputStream(outputURL));
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer transformer = transFactory.newTransformer();
        transformer.transform(xmlDoc, result);
        
    }
    
}