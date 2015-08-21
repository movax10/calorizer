package io.github.movax10.calorizer.model;

/**
 * @author Roman Voloboev
 */
public class Ingredient {
    private Integer id;
    private String name;
    private Float calories;
    private Float carbs;
    private Float fats;
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
