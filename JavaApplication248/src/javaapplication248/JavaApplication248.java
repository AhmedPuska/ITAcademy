
package javaapplication248;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class JavaApplication248 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.isIgnoringElementContentWhitespace();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document doc = db.parse("movies.xml");
        
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xPath = xpf.newXPath();
        XPathExpression exp = xPath.compile("/movies/movie[price>50]/title");
        Object result = exp.evaluate(doc, XPathConstants.NODESET);
        NodeList  nodeList = (NodeList)result;
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getTextContent());
        }
        
//        NodeList movies = doc.getElementsByTagName("movie");
//        System.out.println(movies.item(0).getTextContent());
    }
    
}
