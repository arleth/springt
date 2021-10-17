package net.arleth.pet.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class VetController {
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String vetIndex(Model model) {
        log.info("Asking VetController for stuff");
        model.addAttribute("welcome", "Vets - could be localized");
        log.info("VetController put the welcome text");
        return "vets/index";
    }

}
