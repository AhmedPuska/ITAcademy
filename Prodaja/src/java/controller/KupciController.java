
package controller;

import model.Kupci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KupciController {
    @RequestMapping(value = "/kupci", method = RequestMethod.GET)
    public String prikazKuapaca(ModelMap model) throws ClassNotFoundException {
        model.addAttribute("kupci", new Kupci());
        model.addAttribute("prikazKuapaca", Kupci.prikazKupaca());
        return "kupci";
    }
    
    @RequestMapping(value = "/kupci", params="Unesi", method = RequestMethod.POST)
    public String unosKupaca(@ModelAttribute("kupci") Kupci kupci, ModelMap model) throws ClassNotFoundException {
        
        kupci.unesiKupca();
        prikazKuapaca(model);
        
        return "kupci";
    }
    
    @RequestMapping(value = "/kupci", params="Obrisi", method = RequestMethod.POST)
    public String deleteKupca(@ModelAttribute("kupci") Kupci kupci, ModelMap model) throws ClassNotFoundException {
        
        kupci.obrisiKupca();
        prikazKuapaca(model);
        
        return "kupci";
    }
}