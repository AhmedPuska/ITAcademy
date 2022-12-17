
package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Login")
public class Login {

    @WebMethod(operationName = "login")
    public String login(String username, String password) {
        
        return login.Login.login(username, password);
    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
