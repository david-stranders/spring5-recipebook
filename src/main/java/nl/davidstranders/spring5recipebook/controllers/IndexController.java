package nl.davidstranders.spring5recipebook.controllers;

import lombok.extern.slf4j.Slf4j;
import nl.davidstranders.spring5recipebook.model.Category;
import nl.davidstranders.spring5recipebook.model.UnitOfMeasure;
import nl.davidstranders.spring5recipebook.repositories.CategoryRepository;
import nl.davidstranders.spring5recipebook.repositories.UnitOfMeasureRepository;
import nl.davidstranders.spring5recipebook.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Dell on 1-9-2017.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.debug("getting index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
