
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Kupci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
        
@Controller
public class KupciController {
    @RequestMapping(value="/kupci", method=RequestMethod.GET)
    public String prikazSadrzaja(ModelMap model) throws ClassNotFoundException, SQLException {
        
      model.addAttribute("kupci", new Kupci());
      model.addAttribute("kupcis", Kupci.prikazKupaca());
      return "kupci";
        
    }
    
    @RequestMapping(value = "/kupci", method = RequestMethod.POST)
    public String dodajKupce(@ModelAttribute("kupci") Kupci kupci, ModelMap model) throws ClassNotFoundException, SQLException {
        
        kupci.unosKupaca();
        prikazSadrzaja(model);
        
        return "kupci";
    }
}