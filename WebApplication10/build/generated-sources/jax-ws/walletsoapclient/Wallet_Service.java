
package walletsoapclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Wallet", targetNamespace = "http://soap.shop.com/", wsdlLocation = "http://localhost:8080/WebApplication9/Wallet?wsdl")
public class Wallet_Service
    extends Service
{

    private final static URL WALLET_WSDL_LOCATION;
    private final static WebServiceException WALLET_EXCEPTION;
    private final static QName WALLET_QNAME = new QName("http://soap.shop.com/", "Wallet");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebApplication9/Wallet?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WALLET_WSDL_LOCATION = url;
        WALLET_EXCEPTION = e;
    }

    public Wallet_Service() {
        super(__getWsdlLocation(), WALLET_QNAME);
    }

    public Wallet_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WALLET_QNAME, features);
    }

    public Wallet_Service(URL wsdlLocation) {
        super(wsdlLocation, WALLET_QNAME);
    }

    public Wallet_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WALLET_QNAME, features);
    }

    public Wallet_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Wallet_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Wallet
     */
    @WebEndpoint(name = "WalletPort")
    public Wallet getWalletPort() {
        return super.getPort(new QName("http://soap.shop.com/", "WalletPort"), Wallet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Wallet
     */
    @WebEndpoint(name = "WalletPort")
    public Wallet getWalletPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.shop.com/", "WalletPort"), Wallet.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WALLET_EXCEPTION!= null) {
            throw WALLET_EXCEPTION;
        }
        return WALLET_WSDL_LOCATION;
    }

}
