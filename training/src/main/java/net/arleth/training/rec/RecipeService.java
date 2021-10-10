package net.arleth.training.rec;

import net.arleth.training.rec.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
