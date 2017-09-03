package nl.davidstranders.spring5recipebook.repositories;

import nl.davidstranders.spring5recipebook.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dell on 3-9-2017.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
