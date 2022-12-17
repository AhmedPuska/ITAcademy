package service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.xpath.XPathExpressionException;

@Path("/translation/{word}/{sourceLanguage}/{translationLanguage}")
public class TranslationService {

    
    @GET
    public String getTranslation(@PathParam("word") String word, //
            @PathParam("sourceLanguage") String sourceLanguage, //
            @PathParam("translationLanguage") String translationLanguage) throws XPathExpressionException {
        
       return new TranslationController().translate(word, sourceLanguage, translationLanguage);
    }
    
    @POST
    public String get(String parameterString) throws XPathExpressionException {
        System.out.println(parameterString);
        String[] parameters = parameterString.split("&");
        if(parameters.length!=3){
            return "Incorrect parameters";
        }
        return new TranslationController().translate(parameters[0], parameters[1], parameters[2])+" from POST";
    }
    

}
