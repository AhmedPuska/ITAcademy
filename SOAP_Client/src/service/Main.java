
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        
        URL url = new URL("http://localhost:8080/WebApplication7/TempConverterImplService?wsdl");
        
        QName qname = new QName("http://service/", "TempConverterImplService");
        
        Service service = Service.create(url, qname);
        
        qname = new QName("http://service/", "TempConverterImplPort");
        TempConverter tv = service.getPort(qname, TempConverter.class);
        
        System.out.println(tv.c2f(0));
        System.out.println(tv.f2c(218));
    }
}