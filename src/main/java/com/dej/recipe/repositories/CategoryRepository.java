package com.dej.recipe.repositories;

import com.dej.recipe.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
