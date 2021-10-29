package com.kunal.omnicellbackend.repository;

import com.kunal.omnicellbackend.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RecipeRepository extends MongoRepository<Recipe,String> {
    @Query("{id : ?0}")
    Recipe findRecipeById(String id);
}
