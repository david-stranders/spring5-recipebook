package nl.davidstranders.spring5recipebook.services;

import nl.davidstranders.spring5recipebook.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long reciveId, Long ingredientIdToDelete);
}
