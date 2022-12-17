
package walletsoapclient;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Wallet", targetNamespace = "http://soap.shop.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Wallet {


    /**
     * 
     * @param amount
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deposit", targetNamespace = "http://soap.shop.com/", className = "walletsoapclient.Deposit")
    @ResponseWrapper(localName = "depositResponse", targetNamespace = "http://soap.shop.com/", className = "walletsoapclient.DepositResponse")
    @Action(input = "http://soap.shop.com/Wallet/depositRequest", output = "http://soap.shop.com/Wallet/depositResponse")
    public String deposit(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "amount", targetNamespace = "")
        String amount);

    /**
     * 
     * @param amount
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "withdraw", targetNamespace = "http://soap.shop.com/", className = "walletsoapclient.Withdraw")
    @ResponseWrapper(localName = "withdrawResponse", targetNamespace = "http://soap.shop.com/", className = "walletsoapclient.WithdrawResponse")
    @Action(input = "http://soap.shop.com/Wallet/withdrawRequest", output = "http://soap.shop.com/Wallet/withdrawResponse")
    public String withdraw(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "amount", targetNamespace = "")
        String amount);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getbalance", targetNamespace = "http://soap.shop.com/", className = "walletsoapclient.Getbalance")
    @ResponseWrapper(localName = "getbalanceResponse", targetNamespace = "http://soap.shop.com/", className = "walletsoapclient.GetbalanceResponse")
    @Action(input = "http://soap.shop.com/Wallet/getbalanceRequest", output = "http://soap.shop.com/Wallet/getbalanceResponse")
    public String getbalance(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}
