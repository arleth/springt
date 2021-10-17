package net.arleth.pet.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class PetController {
    @RequestMapping({"/pets", "/pets/index", "/pets/index.html"})
    public String petIndex(Model model) {
        log.info("Asking PetController for stuff");
        model.addAttribute("welcome", "Pets - could be localized");
        log.info("PetController put the welcome text");
        return "pets/index";
    }

}
