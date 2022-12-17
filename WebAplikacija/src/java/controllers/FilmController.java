package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmController {
    
    @RequestMapping(value = "/film", method = RequestMethod.GET)
    public String films(@RequestParam(value = "name", required = false, defaultValue = "SuperMan")String name, ModelMap model) {
        model.addAttribute("film", name + " Ovo je prvi film");
        return "film";
    }
}
