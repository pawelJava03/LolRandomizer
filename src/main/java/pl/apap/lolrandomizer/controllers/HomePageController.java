package pl.apap.lolrandomizer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.apap.lolrandomizer.models.Champions;
import pl.apap.lolrandomizer.models.Spells;
import pl.apap.lolrandomizer.repositories.ChampionsRepository;
import pl.apap.lolrandomizer.repositories.SpellsRepository;

import java.util.List;

@Controller
public class HomePageController {

    private final ChampionsRepository championsRepository;
    private final SpellsRepository spellsRepository;

    @Autowired
    public HomePageController(ChampionsRepository championsRepository, SpellsRepository spellsRepository) {
        this.championsRepository = championsRepository;
        this.spellsRepository = spellsRepository;
    }


    @GetMapping("/home")
    public String siteForm(Model model){

        List<Spells> spellsForJungler = spellsRepository.spellsForJungler();
        model.addAttribute("spellsForJungler",spellsForJungler);

        List<Spells> spellsForAnotherLanes = spellsRepository.spellForEveryone();
        model.addAttribute("spellsForEveryone",spellsForAnotherLanes);

        List<Champions> random5Champions = championsRepository.findRandomUniqueChampions();
        model.addAttribute("champions", random5Champions);
        return "home_site";
    }

}
