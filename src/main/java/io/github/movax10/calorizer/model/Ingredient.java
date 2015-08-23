package io.github.movax10.calorizer.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Roman Voloboev
 */
public class Ingredient {
    private Integer id;

    @NotNull(message = "Ingredient's name can't be null")
    @Size(max = 200, message = "Incorrect ingredient's name size")
    private String name;

    @NotNull(message = "Ingredient's calories can't be null")
    private Float calories;

    @NotNull(message = "Ingredient's carbs can't be null")
    private Float carbs;

    @NotNull(message = "Ingredient's fats can't be null")
    private Float fats;

    @NotNull(message = "Ingredient's proteins can't be null")
    private Float proteins;

    public Ingredient() {
    }

    public Ingredient(String name, Float calories, Float carbs, Float fats, Float proteins) {
        this.name = name;
        this.calories = calories;
        this.carbs = carbs;
        this.fats = fats;
        this.proteins = proteins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCalories() {
        return calories;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }

    public Float getCarbs() {
        return carbs;
    }

    public void setCarbs(Float carbs) {
        this.carbs = carbs;
    }

    public Float getFats() {
        return fats;
    }

    public void setFats(Float fats) {
        this.fats = fats;
    }

    public Float getProteins() {
        return proteins;
    }

    public void setProteins(Float proteins) {
        this.proteins = proteins;
    }
}
