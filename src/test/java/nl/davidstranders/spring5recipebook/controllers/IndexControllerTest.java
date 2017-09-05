package nl.davidstranders.spring5recipebook.controllers;

import nl.davidstranders.spring5recipebook.model.Recipe;
import nl.davidstranders.spring5recipebook.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Dell on 5-9-2017.
 */
public class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() throws Exception {

        //given
        Set<Recipe> recipesSet = new HashSet<>();
        recipesSet.add(new Recipe());
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        recipesSet.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipesSet);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        //when
        String template = indexController.getIndexPage(model);

        //then
        assertEquals("index", template);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());
    }

}