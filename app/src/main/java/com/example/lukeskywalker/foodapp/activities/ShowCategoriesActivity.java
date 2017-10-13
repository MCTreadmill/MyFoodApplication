package com.example.lukeskywalker.foodapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.lukeskywalker.foodapp.R;
import com.example.lukeskywalker.foodapp.model.Category;
import com.example.lukeskywalker.foodapp.model.Food;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Luke Skywalker on 12.10.2017.
 */

public class ShowCategoriesActivity extends Activity{

    private int position;

    /*private Category[] categories = new Category[]{
            new Category("Salads"),
            new Category("Soups"),
            new Category("Pizzas"),
            new Category("Meat Meals"),
            new Category("Vegetarian Meals"),
            new Category("Vegan Meals"),
            new Category("Deserts")
    };*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_categories);

        final int position = getIntent().getIntExtra("position", 0);

        final String[] food = getResources().getStringArray(R.array.salads);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, R.layout.list_item, food);



        ListView listView = (ListView) findViewById(R.id.listofCategories);
        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ShowCategoriesActivity.this, ShowFoodActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
