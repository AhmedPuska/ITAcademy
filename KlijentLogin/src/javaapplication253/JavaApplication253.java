package javaapplication253;

import soap.Login;
import soap.Login_Service;

public class JavaApplication253 {
    public static void main(String[] args) {
        
        String username = "ahmed";
        String password = "ahmed";
        
        Login_Service loginservice = new Login_Service();
        Login login = loginservice.getLoginPort();
        String token = login.login(username, password);
        if (!"".equals(token)) {
            System.out.println("Welcome user");
            System.out.println(token);
        } else {
            System.out.println("Unauthorized user");
        }
    }
    
}