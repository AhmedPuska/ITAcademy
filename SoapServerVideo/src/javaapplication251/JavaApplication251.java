package javaapplication251;

import javax.xml.ws.Endpoint;

public class JavaApplication251 {
    public static void main(String[] args) {
        Sabiranje sabiranje = new Sabiranje();
        Endpoint.publish("http://localhost:8085/", sabiranje);
    }
    
}
