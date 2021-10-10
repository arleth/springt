package net.arleth.training.rec.bootstrap;

import net.arleth.training.rec.domain.*;
import net.arleth.training.rec.repos.CategoryRepository;
import net.arleth.training.rec.repos.RecipeRepository;
import net.arleth.training.rec.repos.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Optional;

@Component
public class BootstrapRecipeData implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    private final RecipeRepository recipeRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public BootstrapRecipeData(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        // get some generic metadata refs
        Optional<UnitOfMeasure> ripesOptional = unitOfMeasureRepository.findByDescription("Ripe");
        if (ripesOptional.isEmpty()) {
            throw new RuntimeException("No Ripe in DB");
        }
        UnitOfMeasure ripe = ripesOptional.get();
        Optional<UnitOfMeasure> teaspoonOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        if (teaspoonOptional.isEmpty()) {
            throw new RuntimeException("No teaspoon in DB");
        }
        UnitOfMeasure teaspoon = teaspoonOptional.get();
        Optional<UnitOfMeasure> tablespoonOptional = unitOfMeasureRepository.findByDescription("Tablespoon");
        if (tablespoonOptional.isEmpty()) {
            throw new RuntimeException("No Tablespoon in DB");
        }
        UnitOfMeasure tablespoon = tablespoonOptional.get();
        Optional<UnitOfMeasure> cupOptional = unitOfMeasureRepository.findByDescription("Cup");
        if (cupOptional.isEmpty()) {
            throw new RuntimeException("No Cup in DB");
        }
        UnitOfMeasure cup = cupOptional.get();
        Optional<UnitOfMeasure> pinchOptional = unitOfMeasureRepository.findByDescription("Pinch");
        if (pinchOptional.isEmpty()) {
            throw new RuntimeException("No Pinch in DB");
        }
        UnitOfMeasure pinch = pinchOptional.get();
        Optional<UnitOfMeasure> ounceOptional = unitOfMeasureRepository.findByDescription("Ounce");
        if (ounceOptional.isEmpty()) {
            throw new RuntimeException("No Ounce in DB");
        }
        UnitOfMeasure ounce = ounceOptional.get();
        Optional<Category> mexicanOptional = categoryRepository.findByCategoryName("Mexican");
        if (mexicanOptional.isEmpty()) {
            throw new RuntimeException("No Mexican Category!");
        }
        Category mexican = mexicanOptional.get();

        // create the Recipes
        Recipe guacaMole = new Recipe();
        guacaMole.addCategory(mexican);
        setGuacaMoleSimpleValues(guacaMole);
        recipeRepository.save(guacaMole);
        // now we have the ID for the guacaMoleIngredients

        Ingredient avocado = new Ingredient();
        avocado.setRecipe(guacaMole);
        avocado.setAmount(BigDecimal.valueOf(2));
        avocado.setDescription("Avocados");
        avocado.setUnitOfMeasure(ripe);
        guacaMole.addIngredient(avocado);
        // salt
        Ingredient salt = new Ingredient("Salt", BigDecimal.valueOf(0.25), teaspoon, guacaMole);
        guacaMole.addIngredient(salt);
        Ingredient freshLime = new Ingredient("Fresh Lime", BigDecimal.valueOf(1), tablespoon, guacaMole);
        guacaMole.addIngredient(freshLime);
        Ingredient readOnion = new Ingredient("Read Onion", BigDecimal.valueOf(2), tablespoon, guacaMole);
        guacaMole.addIngredient(readOnion);
        Ingredient pepper = new Ingredient("Pepper", BigDecimal.valueOf(1), pinch, guacaMole);
        guacaMole.addIngredient(pepper);
        Ingredient tomato = new Ingredient("Tomato", BigDecimal.valueOf(0.5), ripe, guacaMole);
        guacaMole.addIngredient(tomato);
        Ingredient cilantro = new Ingredient("Cilantro", BigDecimal.valueOf(2), tablespoon, guacaMole);
        guacaMole.addIngredient(cilantro);

        recipeRepository.save(guacaMole);

    }

    private void setGuacaMoleSimpleValues(Recipe recipe) {
        String s = """
                Guacamole: A Classic Mexican Dish.
                The word "guacamole" and the dip, are both originally from Mexico, where avocados have been cultivated for thousands of years. The name is derived from two Aztec Nahuatl words—ahuacatl (avocado) and molli (sauce).""";
        recipe.setDescription(s);
        recipe.setPrepTime(10);
        recipe.setServings(2);
        recipe.setCookTime(10);
        recipe.setUrl("https://www.simplyrecipes.com/recipes/perfect_guacamole/");
        recipe.setDirections("Cut the avocado:\n" +
                "Cut the avocados in half. Remove the pit. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. (See How to Cut and Peel an Avocado.) Place in a bowl.");
        recipe.setCookTime(0);
        recipe.setDifficulty(Difficulty.EASY);
        Notes notes = new Notes();
        notes.setRecipe(recipe);
        notes.setRecipeNotes("Be careful handling chilis! If using, it's best to wear food-safe gloves. If no gloves are available, wash your hands thoroughly after handling, and do not touch your eyes or the area near your eyes for several hours afterwards.");
        recipe.setNotes(notes);

    }
}
