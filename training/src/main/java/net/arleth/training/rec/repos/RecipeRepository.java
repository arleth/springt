package net.arleth.training.rec.repos;

import net.arleth.training.rec.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
