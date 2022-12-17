
package controller;

import java.sql.SQLException;
import model.Kupci;
import model.Prodaja;
import model.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdajaController {
    
    @RequestMapping(value="/prodaja", params="Prodaj", method=RequestMethod.POST)  
    public String prodaja(@ModelAttribute("kupci") Kupci kupci, @ModelAttribute("proizvodi") Proizvodi proizvodi, @ModelAttribute("prodaja") Prodaja prodaja, ModelMap model) throws ClassNotFoundException, SQLException{  
             
      int kupac = prodaja.getKupac_id();
      int proizvod = prodaja.getProizvod_id(); 
      Prodaja.prodaja(kupac, proizvod);  
      prikazProdaje(model);  
      return "prodaja";  
        
    }  
    
    @RequestMapping(value = "/prodaja", method = RequestMethod.GET)
    public String prikazProdaje(ModelMap model) throws SQLException, ClassNotFoundException {
        model.addAttribute("prodaja", new Prodaja());
        model.addAttribute("prikazKupaca", Kupci.prikazKupaca());
        model.addAttribute("prikaziProizvode", Proizvodi.prikazProizvoda());
        model.addAttribute("prikaziProdaju", Prodaja.prodajaPrikaz());
        
        return "prodaja";
    }
    
}