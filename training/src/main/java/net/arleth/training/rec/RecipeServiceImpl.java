package net.arleth.training.rec;

import net.arleth.training.rec.domain.Recipe;
import net.arleth.training.rec.repos.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> result = new HashSet<>();
        Iterable<Recipe> iter = recipeRepository.findAll();
        iter.forEach(result::add);
        return result;
    }
}
