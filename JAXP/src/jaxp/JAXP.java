
package jaxp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.xml.sax.InputSource;
import org.w3c.dom.NodeList;

public class JAXP {
    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
        
        XPathFactory factory = XPathFactory.newInstance();
        XPath xPath = factory.newXPath();
        
        XPathExpression xPathExpression = xPath.compile("catalog/book[price>=10 and translate(publish_date,'-','')>20050000]");
        
        File xmlDocument = new File("catalog.xml");
        InputSource inputSource = new InputSource(new FileInputStream(xmlDocument));
        
        Object result = xPathExpression.evaluate(inputSource, XPathConstants.NODESET);
        
        NodeList nodeList = (NodeList)result;
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(" Id: " + nodeList.item(i).getAttributes().item(0).getNodeValue());
            System.out.println(" Author: " + nodeList.item(i).getFirstChild().getNextSibling().getTextContent());
            System.out.println(" Title: " + nodeList.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent());
            System.out.println(" Genre: " + nodeList.item(i).getFirstChild().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getNextSibling().getTextContent());
            System.out.println(" Price: " + nodeList.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());
            System.out.println(" Publish date: " + nodeList.item(i).getLastChild().getPreviousSibling().getPreviousSibling().getPreviousSibling().getTextContent());
            System.out.println(" Description: " + nodeList.item(i).getLastChild().getPreviousSibling().getTextContent());
            System.out.print("\n");
        }
    }
    
}