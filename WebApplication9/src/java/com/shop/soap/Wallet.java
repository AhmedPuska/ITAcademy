
package com.shop.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Wallet")
public class Wallet {


    @WebMethod(operationName = "getbalance")
    public String getbalance(@WebParam(name = "id") String id) {
        
        int userId = Integer.parseInt(id);
        return String.valueOf(new com.shop.business.Wallet().getBalance(userId));
    }
    
    @WebMethod(operationName = "withdraw")
    public String withdraw(@WebParam(name = "id") String id, @WebParam(name = "amount") String amount) {
        
        int userId = Integer.parseInt(id);
        double am = Double.parseDouble(amount);
        if (new com.shop.business.Wallet().withdraw(userId, am)) {
            return "0";
        } else {
            return "-1";
        }
    }
    
    @WebMethod(operationName = "deposit")
    public String deposit(@WebParam(name = "id") String id, @WebParam(name = "amount") String amount) {
        
        int userId = Integer.parseInt(id);
        double am = Double.parseDouble(amount);
        if (new com.shop.business.Wallet().deposit(userId, am)) {
            return "0";
        } else {
            return "-1";
        }
    }
}
