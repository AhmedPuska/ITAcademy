
package javaapplication314;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javaapplication314 package. 
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

    private final static QName _Saberi_QNAME = new QName("http://javaapplication314/", "saberi");
    private final static QName _SaberiResponse_QNAME = new QName("http://javaapplication314/", "saberiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javaapplication314
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaberiResponse }
     * 
     */
    public SaberiResponse createSaberiResponse() {
        return new SaberiResponse();
    }

    /**
     * Create an instance of {@link Saberi }
     * 
     */
    public Saberi createSaberi() {
        return new Saberi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saberi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javaapplication314/", name = "saberi")
    public JAXBElement<Saberi> createSaberi(Saberi value) {
        return new JAXBElement<Saberi>(_Saberi_QNAME, Saberi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaberiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javaapplication314/", name = "saberiResponse")
    public JAXBElement<SaberiResponse> createSaberiResponse(SaberiResponse value) {
        return new JAXBElement<SaberiResponse>(_SaberiResponse_QNAME, SaberiResponse.class, null, value);
    }

}
