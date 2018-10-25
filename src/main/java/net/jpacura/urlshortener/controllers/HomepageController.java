package net.jpacura.urlshortener.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomepageController {

    @GetMapping("/")
    public String index(@RequestParam(name="name", required=false, defaultValue="Unspecified") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

}