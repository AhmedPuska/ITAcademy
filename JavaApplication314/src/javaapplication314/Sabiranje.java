package javaapplication314;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Sabiranje {
    
    @WebMethod
    public int saberi(int a, int b) {
        return a + b;
    }
}
