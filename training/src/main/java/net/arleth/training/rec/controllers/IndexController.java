package net.arleth.training.rec.controllers;

import net.arleth.training.rec.RecipeService;
import net.arleth.training.rec.domain.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        Set<Recipe> recipes = recipeService.getRecipes();
        model.addAttribute("recipes", recipes);
        return "index";
    }
}
