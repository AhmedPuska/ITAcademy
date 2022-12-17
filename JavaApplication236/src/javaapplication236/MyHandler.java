package javaapplication236;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {
    
    private String actualNodeName;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Program je startovan(parsiranje)");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Program je zavrsio(parsiranje)");
    }

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        
        this.actualNodeName = string2;
        
        System.out.println("Start element: " + string2);
        
        
        for (int i = 0; i < atrbts.getLength(); i++) {
            System.out.println("    Attribute: " + atrbts.getLocalName(i) + ": " + atrbts.getValue(i));
        }
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        System.out.println("End element: " + string2);
    }

    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        
        if (!actualNodeName.equals("name")) {
            return;
        }
        
        String nodeValue = new String(chars, i, i1);
        
        if (!nodeValue.trim().equals("")) {
            System.out.println("Node value: " + nodeValue);
        }
    }
    
    
    
    
}