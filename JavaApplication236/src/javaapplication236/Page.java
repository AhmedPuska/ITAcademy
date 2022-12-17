
package javaapplication236;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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

public class Page {

    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("page.html");
        Element r = doc.getDocumentElement();
        NodeList links = r.getElementsByTagName("a");
        for(int i=0;i<links.getLength();i++)
            {
                String page = links.item(i).getAttributes().getNamedItem("href").getNodeValue();
                FileOutputStream fos = new FileOutputStream(page.replace("http://", "").replace("/", ""));
                URL u = new URL(page);
                InputStream is = u.openStream();
                DataInputStream dis = new DataInputStream(new BufferedInputStream(is));
                int bt;
                while((bt=dis.read())!=-1)
                            fos.write((byte)bt);
                fos.close();
                dis.close();
            }
    }
}