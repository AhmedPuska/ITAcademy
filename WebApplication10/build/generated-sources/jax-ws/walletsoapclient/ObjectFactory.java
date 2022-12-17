
package walletsoapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the walletsoapclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Getbalance_QNAME = new QName("http://soap.shop.com/", "getbalance");
    private final static QName _Deposit_QNAME = new QName("http://soap.shop.com/", "deposit");
    private final static QName _Withdraw_QNAME = new QName("http://soap.shop.com/", "withdraw");
    private final static QName _WithdrawResponse_QNAME = new QName("http://soap.shop.com/", "withdrawResponse");
    private final static QName _GetbalanceResponse_QNAME = new QName("http://soap.shop.com/", "getbalanceResponse");
    private final static QName _DepositResponse_QNAME = new QName("http://soap.shop.com/", "depositResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: walletsoapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link Getbalance }
     * 
     */
    public Getbalance createGetbalance() {
        return new Getbalance();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link GetbalanceResponse }
     * 
     */
    public GetbalanceResponse createGetbalanceResponse() {
        return new GetbalanceResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getbalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.shop.com/", name = "getbalance")
    public JAXBElement<Getbalance> createGetbalance(Getbalance value) {
        return new JAXBElement<Getbalance>(_Getbalance_QNAME, Getbalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.shop.com/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.shop.com/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.shop.com/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetbalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.shop.com/", name = "getbalanceResponse")
    public JAXBElement<GetbalanceResponse> createGetbalanceResponse(GetbalanceResponse value) {
        return new JAXBElement<GetbalanceResponse>(_GetbalanceResponse_QNAME, GetbalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.shop.com/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

}
