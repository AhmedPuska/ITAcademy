package javaapplication245;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class JavaApplication245 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException {
        
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        File file = new File("C:\\wamp64\\www\\prognoza.xml");
        sp.parse(new FileInputStream("C:\\wamp64\\www\\prognoza.xml"), new DefaultHandler() {
            
            String currentTag = "";
            
            @Override
            public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
                super.startElement(string, string1, string2, atrbts);
//                System.out.println( "<" + string2 + ">");
                currentTag = string2;
            }

            @Override
            public void endElement(String string, String string1, String string2) throws SAXException {
                super.endElement(string, string1, string2);
//                System.out.println("</" + string2 + ">");
                currentTag="";
            }

            @Override
            public void characters(char[] chars, int i, int i1) throws SAXException {
                super.characters(chars, i, i1);
                String karakteri = new String(chars, i, i1);
                if ("grad".equals(currentTag)) {
                    System.out.println(karakteri);
                }
            }
            
            
            
        });
        
    }
    
}