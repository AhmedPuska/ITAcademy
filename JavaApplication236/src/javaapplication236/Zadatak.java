
package javaapplication236;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Zadatak {

    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document doc = db.parse("catalog_1.xml");
        
        Element root = doc.getDocumentElement();
        
        NodeList books = root.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            System.out.println("Id: " + books.item(i).getAttributes().item(0).getNodeValue());
            System.out.println("Author: " + books.item(i).getFirstChild().getTextContent());
            System.out.println("Book title: " + books.item(i).getFirstChild().getNextSibling().getTextContent());
            System.out.println("Genre: " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getTextContent());
            System.out.println("Price " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent() );
            System.out.println("Publish date: " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent() );
            System.out.println("Description: " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent() );
            System.out.println("\n");
        }
        
    }
    
}