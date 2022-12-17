package javaapplication312;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class JavaApplication312 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException, TransformerException, SQLException, XPathExpressionException {
        
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("movies.xml");
        
//        NodeList movies = doc.getElementsByTagName("movie");
//        System.out.println(movies.item(0).getTextContent());
        
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();
        XPathExpression exp = xpath.compile("movies/movie[price>50]/year");
        NodeList movies = (NodeList) exp.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < movies.getLength(); i++) {
            System.out.println(movies.item(i).getTextContent());
        }
        
//        
//        
//        
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        dbf.setIgnoringElementContentWhitespace(true);
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        Document doc = db.newDocument();
//        
//        
//        Element prognoze = doc.createElement("prognoze");
//        doc.appendChild(prognoze);
//        
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/g4_prognoza", "root", "");
//        ResultSet rs = conn.createStatement().executeQuery("select * from prognoze");
//        while (rs.next()) {
//
//            Element prognoza = doc.createElement("prognoza");
//            prognoza.setAttribute("id", rs.getString("id"));
//            prognoze.appendChild(prognoza);
//
//            Element grad = doc.createElement("grad");
//            grad.setTextContent(rs.getString("grad"));
//            prognoza.appendChild(grad);
//
//            Element temperatura = doc.createElement("temperatura");
//            temperatura.setTextContent(String.valueOf(rs.getInt("temperatura")));
//            prognoza.appendChild(temperatura);
//        }
        
        
//        Document doc = db.parse("http://localhost:8081/prognoza.xml");
        
//        DOMSource xmldoc = new DOMSource(doc);
//        StreamResult result = new StreamResult(new FileOutputStream(""));
//        TransformerFactory tf = TransformerFactory.newInstance();
//        Transformer tr = tf.newTransformer();
//        tr.transform(xmldoc, result);
        
//        System.out.println(new String(bos.getBytes()));
        
//        
//        
//        
//        
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        dbf.setIgnoringElementContentWhitespace(true);
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        Document doc = db.parse("http://localhost:8081/prognoza.xml");
////        Document doc = db.parse("C:\\Users\\user\\Documents\\rad\\java vjezbe\\JavaApplication312\\src\\javaapplication312\\prognoza.xml");
//        
//        Element root = doc.getDocumentElement();
//        Node prvodijete = root.getFirstChild();
//        System.out.println(prvodijete.getTextContent());
//        System.out.println(root.getTextContent());
//        NodeList
//        
//        
//
//
//        SAXParserFactory spf = SAXParserFactory.newInstance();
//        SAXParser sp = spf.newSAXParser();
//        sp.parse(new FileInputStream("C:\\wamp64\\www\\prognoza.xml"), new DefaultHandler(){
//            
//            String currentTag = "";
//            
//            @Override
//            public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
//                super.startElement(string, string1, string2, atrbts);
////                System.out.println("<" + string2 + ">");
//                currentTag = string2;
//            }
//
//            @Override
//            public void endElement(String string, String string1, String string2) throws SAXException {
////                System.out.println("</" + string2 + ">");
//                currentTag = "";
//            }
//
//            @Override
//            public void characters(char[] chars, int i, int i1) throws SAXException {
//                super.characters(chars, i, i1);
//                String karakteri = new String(chars, i, i1);
////                System.out.println(currentTag);
//                if ("grad".equals(currentTag)) {
//                    System.out.println(karakteri);
//                }
//            }
//        });
    }

}
