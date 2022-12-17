package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class DictionaryReader {
    static final String[] supportedSourceLangs = {"en", "bs"};
    static final String[] supportedTranslationLangs = {"en", "bs"};
    
    private String dictionaryFileLocation;

    public DictionaryReader(String dictionaryFileLocation) {
        this.dictionaryFileLocation = dictionaryFileLocation;
    }
    
    public String loadTranslation(String word, String sourceLanguage, String translationLanguage) throws XPathExpressionException{
        String translatedWord = "";
        XPathFactory factory = XPathFactory.newInstance();
        XPath path = factory.newXPath(); 
        XPathExpression xPE = path.compile("//word[@"+sourceLanguage+"='" + word.trim().toLowerCase() + "']");
        System.out.println(sourceLanguage);
        try {
            InputSource source = new InputSource(new FileInputStream(new File(dictionaryFileLocation)));
            Object object = xPE.evaluate(source, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) object;
            if (nodeList.getLength() < 1) {
                return String.format("Dictionary is empty for first language '%s' and last language '%s'", sourceLanguage, translationLanguage);
            } else {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    if(node.getAttributes().getNamedItem(sourceLanguage)!=null){
                        return node.getTextContent();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
        return translatedWord;
    } 
}