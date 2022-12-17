
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
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class JavaApplication236 {

    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
        dbf.setIgnoringElementContentWhitespace(true);  
        DocumentBuilder db = dbf.newDocumentBuilder();

        XPathFactory factory = XPathFactory.newInstance();  
        XPath path = factory.newXPath();  
        XPathExpression xPE = path.compile("//book[price>=10 and translate(publish_date,'-','')>20050000]");
//
        File xmlDoc = new File("catalog_1.xml");  
        InputSource source = new InputSource(new FileInputStream(xmlDoc));  

        
        FileInputStream fis = new FileInputStream("catalog_1.xml");
        Document doc = db.parse(fis);
        
        
        Element r = doc.getDocumentElement();
        NodeList books = r.getElementsByTagName("book");
        for(int i=0;i<books.getLength();i++)
            {
//                System.out.println("ID: " + books.item(i).getAttributes().item(0).getNodeValue());
//                System.out.println("Author: " + books.item(i).getFirstChild().getNextSibling().getTextContent());
//                System.out.println("Book name: " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getTextContent());
//                System.out.print("\n");
                
                
                System.out.print(books.item(i).getNodeName() + " ");  
            System.out.println(books.item(i).getAttributes().item(0));  
            System.out.println(" Author: " + books.item(i).getFirstChild().getNextSibling().getTextContent());  
            System.out.println(" Title: " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent());  
            System.out.println(" Genre: " + books.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent());  
            System.out.println(" Price: " + books.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());  
            System.out.println(" Publish date: " + books.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());  
            System.out.println(" Description: " + books.item(i).getLastChild().getPreviousSibling().getTextContent());  
            System.out.print("\n");
                
 
//                System.out.println("ISBN: " + books.item(i).getAttributes().item(1).getNodeValue());
             }
        
//        Object result = xPE.evaluate(source, XPathConstants.NODESET);  
//        NodeList nList = (NodeList)result;  
//
//        for (int i = 0; i < nList.getLength(); i++) {
//            System.out.print(nList.item(i).getNodeName() + " ");  
//            System.out.println(nList.item(i).getAttributes().item(0));  
//            System.out.println(" Author: " + nList.item(i).getFirstChild().getNextSibling().getTextContent());  
//            System.out.println(" Title: " + nList.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent());  
//            System.out.println(" Genre: " + nList.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent());  
//            System.out.println(" Price: " + nList.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());  
//            System.out.println(" Publish date: " + nList.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());  
//            System.out.println(" Description: " + nList.item(i).getLastChild().getPreviousSibling().getTextContent());  
//            System.out.print("\n");
//        }
    }
    
}