package com.dej.recipe.repositories;

import com.dej.recipe.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UOMRepository extends CrudRepository<UnitOfMeasure, Long> {
}
