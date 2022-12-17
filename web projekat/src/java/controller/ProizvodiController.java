package controller;

import java.sql.SQLException;
import model.Kupci;
import model.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;

@Controller  
public class ProizvodiController {
    @RequestMapping(value="/proizvodi", method=RequestMethod.GET)  
    public String prikazSadrzaja(ModelMap model) throws ClassNotFoundException, SQLException {  
        
      model.addAttribute("proizvodi", new Proizvodi());  
      model.addAttribute("sviProizvodi", Proizvodi.prikazProizvoda());  
      return "proizvodi";  
        
    }  
      
    @RequestMapping(value="/proizvodi", params="Dodaj" , method=RequestMethod.POST)  
    public String dodajProizvod(@ModelAttribute("proizvodi") Proizvodi odabraniProizvod, ModelMap model) throws ClassNotFoundException, SQLException {  
        
      odabraniProizvod.kreiranjeProizvoda();  
      prikazSadrzaja(model);  
      return "proizvodi";  
        
    }  
      
    @RequestMapping(value="/proizvodi", params="Obrisi" , method=RequestMethod.POST)  
    public String obrisiProizvod(@ModelAttribute("proizvodi") Proizvodi bivsiProizvod, ModelMap model) throws ClassNotFoundException, SQLException {  
         
      bivsiProizvod.brisanjeProizvoda();  
      prikazSadrzaja(model);  
      return "proizvodi";  
        
    }  
}
