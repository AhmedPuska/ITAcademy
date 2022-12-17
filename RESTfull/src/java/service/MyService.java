
package service;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/MyRestService/{id}")
public class MyService {
    
    @DELETE
    public String doPost(@PathParam("id") String id) {
        
        return "Element with ID = " + id + " deleted";
    }
    
}