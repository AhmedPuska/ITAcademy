
package controller;

import java.sql.SQLException;
import model.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProizvodiController {
    
    @RequestMapping(value = "/proizvodi", method = RequestMethod.GET)
    public String prikazPro(ModelMap model) throws ClassNotFoundException, SQLException {
        model.addAttribute("proizvodi", new Proizvodi());
        model.addAttribute("proizvodis", Proizvodi.prikazProizvoda());
        
        return "proizvodi";
    }
    
    @RequestMapping(value = "/proizvodi", method = RequestMethod.POST)
    public String dodajProizvod(@ModelAttribute("proizvodi") Proizvodi proizvodi, ModelMap model) throws ClassNotFoundException, SQLException {
        
        proizvodi.unosProizvoda();
        prikazPro(model);
        
        return "proizvodi";
    }
}