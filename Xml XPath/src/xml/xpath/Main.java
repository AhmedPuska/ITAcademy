
package xml.xpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Main {

    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
        
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath();
        XPathExpression xPathExpression = path.compile("//employee[@id=2222]/FirstName");
        
        File xmlDocument = new File("employees.xml");
        InputSource inputSource = new InputSource(new FileInputStream(xmlDocument));
        
        Object result = xPathExpression.evaluate(inputSource, XPathConstants.NODESET);
        
        NodeList nodeList = (NodeList)result;
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.print("Node name: " + nodeList.item(i).getNodeName());
            System.out.print(" Node value: " + nodeList.item(i).getFirstChild().getNodeValue());
            System.out.print("\n");
        }
        
    }
    
}