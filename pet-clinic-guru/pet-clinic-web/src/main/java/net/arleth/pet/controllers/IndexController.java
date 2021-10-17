package net.arleth.pet.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    @RequestMapping({"/", "", "/index", "/index.html"})
    public String petClinicIndex(Model model) {
        log.info("Asking IndexController for stuff");
        model.addAttribute("welcome", "Velkommen - could be localized");
        log.info("IndexController put the welcome text");
        return "index";
    }

}
