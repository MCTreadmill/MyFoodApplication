package com.example.lukeskywalker.foodapp.model;

/**
 * Created by Luke Skywalker on 12.10.2017.
 */

public class Category {
    private int id;
    private Food food;
    private String name;


    public Category(){

    }

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name=" + name + '\'' +
                '}';
    }
}
