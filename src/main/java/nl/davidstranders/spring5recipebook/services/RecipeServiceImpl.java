package nl.davidstranders.spring5recipebook.services;

import nl.davidstranders.spring5recipebook.model.Recipe;
import nl.davidstranders.spring5recipebook.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dell on 4-9-2017.
 */
@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
