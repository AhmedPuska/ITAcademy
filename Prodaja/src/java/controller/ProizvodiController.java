
package controller;

import model.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProizvodiController {
    @RequestMapping(value = "proizvodi", method = RequestMethod.GET)
    public String prikazProizvoda(ModelMap model) throws ClassNotFoundException {
        
        model.addAttribute("proizvodi", new Proizvodi());
        model.addAttribute("prikaziProizvode", Proizvodi.prikazProizvoda());
        
        return "proizvodi";
    }
    
    @RequestMapping(value = "proizvodi", params = "Unesi", method = RequestMethod.POST)
    public String unosProizvoda(@ModelAttribute("proizvodi") Proizvodi proizvodi, ModelMap model) throws ClassNotFoundException {
        
        proizvodi.unosProizvoda();
        prikazProizvoda(model);
        
        return "proizvodi";
    }
    
    @RequestMapping(value = "proizvodi", params = "Obrisi", method = RequestMethod.POST)
    public String deleteProizvoda(@ModelAttribute("proizvodi") Proizvodi proizvodi, ModelMap model) throws ClassNotFoundException {
        
        proizvodi.obrisiProizvod();
        prikazProizvoda(model);
        
        return "proizvodi";
    }
}