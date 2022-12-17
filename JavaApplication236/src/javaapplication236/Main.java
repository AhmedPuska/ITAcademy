
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
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        
//        DocumentBuilder db = dbf.newDocumentBuilder();
        
//        Document doc = db.parse("company.xml");
        
        XPathFactory factory = XPathFactory.newInstance();
        XPath xPath = factory.newXPath();
        XPathExpression xPathExpression = xPath.compile("//Employee");
        
        File xmlDocument = new File("company.xml");
        InputSource inputSource = new InputSource(new FileInputStream(xmlDocument));
        
        Object result = xPathExpression.evaluate(inputSource, XPathConstants.NODESET);
        NodeList nList = (NodeList)result;
        
        for (int i = 0; i < nList.getLength(); i++) {
            System.out.print(nList.item(i).getNodeName() + " ");  
            System.out.println(nList.item(i).getAttributes().item(0));  
            System.out.println(" FirstName: " + nList.item(i).getFirstChild().getNextSibling().getTextContent());  
            System.out.println(" LastName: " + nList.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent());  
            System.out.println(" ContactNo: " + nList.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent());  
//            System.out.println(" Price: " + nList.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());  
//            System.out.println(" Publish date: " + nList.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());  
//            System.out.println(" Description: " + nList.item(i).getLastChild().getPreviousSibling().getTextContent());  
            System.out.print("\n");
        }
        
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
//        dbf.setIgnoringElementContentWhitespace(true);  
//
//        XPathFactory factory = XPathFactory.newInstance();  
//        XPath path = factory.newXPath();  
//        XPathExpression xPE = path.compile("//book[price>=10 and translate(publish_date,'-','')>20050000]");  
//
//        File xmlDoc = new File("catalog.xml");  
//        InputSource source = new InputSource(new FileInputStream(xmlDoc));  
//
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