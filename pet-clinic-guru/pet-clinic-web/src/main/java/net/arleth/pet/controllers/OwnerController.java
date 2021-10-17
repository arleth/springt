package net.arleth.pet.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class OwnerController {
    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String ownerIndex(Model model) {
        log.info("Asking OwnerController for stuff");
        model.addAttribute("welcome", "Owners - could be localized");
        log.info("OwnerController put the welcome text");
        return "owners/index";
    }

}
