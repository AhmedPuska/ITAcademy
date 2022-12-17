package controllers;

import javax.validation.Valid;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    
    @RequestMapping( value = "/newUser", method = RequestMethod.GET)
    public String newForm(Model model) {
        model.addAttribute("user", new User());
        
        return "newUser";
    }
    
    @RequestMapping(value = "newUser", method = RequestMethod.POST)
    public String sum(@ModelAttribute("user") @Valid User user, BindingResult result, ModelMap model) {
        
        if (result.hasErrors()) {
            return "newUser";
        }
        
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("dateOfBirth", user.getDateOfBirth());
        model.addAttribute("pid", user.getPid());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("country", user.getCountry());
        model.addAttribute("city", user.getCity());
        model.addAttribute("postal", user.getPostal());
        
        return "confirmation";
    }
    
}
