package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

public class TranslationController {

    private static final String dictionaryFileLocation = "C:\\Users\\user\\Documents\\rad\\java vjezbe\\WebTranslator\\dictionary.xml";
    private DictionaryReader dictionaryReader;

    public TranslationController() {
        dictionaryReader = new DictionaryReader(dictionaryFileLocation);
    }
    
    

    public  String translate(String word, String sourceLanguage, String translationLanguage) throws XPathExpressionException {
        
        
        if(!Arrays.asList(DictionaryReader.supportedSourceLangs).contains(sourceLanguage)){
            return "Unsupported source language " + sourceLanguage;
        }
        System.out.println(Arrays.asList(DictionaryReader.supportedTranslationLangs));
        System.out.println(translationLanguage);
        if(!Arrays.asList(DictionaryReader.supportedTranslationLangs).contains(translationLanguage.trim())){
            return "Unsupported translation language " + translationLanguage;
        }
        return dictionaryReader.loadTranslation(word, sourceLanguage, translationLanguage);
    }
}
