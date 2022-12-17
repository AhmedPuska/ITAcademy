package javaapplication314;

import javax.xml.ws.Endpoint;

public class JavaApplication314 {

    public static void main(String[] args) {
        Sabiranje sabiranje = new Sabiranje();
        Endpoint.publish("http://localhost:8085/", sabiranje);
    }
    
}
