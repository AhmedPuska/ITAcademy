
package controller;

import model.Prodaja;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdajaController {
    
    @RequestMapping(value = "prodaja", method = RequestMethod.GET)
    public String prikazProizvoda(ModelMap model) throws ClassNotFoundException {
        
        model.addAttribute("prodaja", new Prodaja());
        model.addAttribute("prikaziProdaju", Prodaja.prikazProdaje());
        
        return "prodaja";
    }
}