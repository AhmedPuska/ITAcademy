
package javaapplication251;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Sabiranje", targetNamespace = "http://javaapplication251/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Sabiranje {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saberi", targetNamespace = "http://javaapplication251/", className = "javaapplication251.Saberi")
    @ResponseWrapper(localName = "saberiResponse", targetNamespace = "http://javaapplication251/", className = "javaapplication251.SaberiResponse")
    @Action(input = "http://javaapplication251/Sabiranje/saberiRequest", output = "http://javaapplication251/Sabiranje/saberiResponse")
    public int saberi(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}