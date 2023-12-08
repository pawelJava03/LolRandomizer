package pl.apap.lolrandomizer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/home")
    public String siteForm(){
        return "home_site";
    }

}
