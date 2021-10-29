package com.kunal.omnicellbackend.controller;

import com.kunal.omnicellbackend.model.Recipe;
import com.kunal.omnicellbackend.repository.RecipeRepository;
import com.kunal.omnicellbackend.responses.FetchAllRecipesBean;
import com.kunal.omnicellbackend.responses.FetchRecipeBean;
import com.kunal.omnicellbackend.responses.FetchRecipeImageBean;
import com.kunal.omnicellbackend.responses.SaveRecipeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeRepository repository;

    @PostMapping("/")
    public SaveRecipeBean fetchAllRecipes(@Valid @RequestBody Recipe body){
        try {
            repository.save(body);
            return new SaveRecipeBean(true,"success", body);
        }catch (Exception e){
            return new SaveRecipeBean(false,"failed", null);
        }
    }

    @GetMapping("/")
    public FetchAllRecipesBean fetchAllRecipes(){
        try {
            List<Recipe> recipes = repository.findAll();
            return new FetchAllRecipesBean(true,"success", recipes);
        }catch (Exception e){
            return new FetchAllRecipesBean(false,"failed", null);
        }
    }

    @GetMapping("/{id}")
    public FetchRecipeBean fetchRecipeById(@PathVariable String id){
        try {
            Recipe recipe = repository.findRecipeById(id);
            return new FetchRecipeBean(true,"success", recipe);
        }catch (Exception e){
            return new FetchRecipeBean(false,"failed", null);
        }
    }

    @GetMapping("/{id}/show")
    public FetchRecipeImageBean fetchRecipeImageById(@PathVariable String id){
        try {
            Recipe recipe = repository.findRecipeById(id);
            return new FetchRecipeImageBean(true,"success", recipe.image);
        }catch (Exception e){
            return new FetchRecipeImageBean(false,"failed", null);
        }
    }
}
