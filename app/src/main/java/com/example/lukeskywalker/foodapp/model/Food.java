package com.example.lukeskywalker.foodapp.model;

/**
 * Created by Luke Skywalker on 12.10.2017.
 */

public class Food {
    private int id;
    private String image;
    private String name;
    private String description;
    private Ingredients ingredients;
    private float calories;
    private float price;


    private Category category;

    public Food(){

    }

    public Food(String image, String name, String description, float calories, float price) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", calories='" + calories + '\'' +
                ", price=" + price +
                '}';
    }
}
