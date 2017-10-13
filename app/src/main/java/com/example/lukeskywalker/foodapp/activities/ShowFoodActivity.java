package com.example.lukeskywalker.foodapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.lukeskywalker.foodapp.R;
import com.example.lukeskywalker.foodapp.model.Food;

/**
 * Created by Luke Skywalker on 12.10.2017.
 */

public class ShowFoodActivity extends Activity {

    private int position;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_food);

        final int position = getIntent().getIntExtra("position", 0);
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
