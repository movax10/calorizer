package io.github.movax10.calorizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.movax10.calorizer.model.Ingredient;

/**
 * @author Roman Voloboev
 */
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
