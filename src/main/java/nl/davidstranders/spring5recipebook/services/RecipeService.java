package nl.davidstranders.spring5recipebook.services;

import nl.davidstranders.spring5recipebook.commands.RecipeCommand;
import nl.davidstranders.spring5recipebook.model.Recipe;

import java.util.Set;

/**
 * Created by Dell on 4-9-2017.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
