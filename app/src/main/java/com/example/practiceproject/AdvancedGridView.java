package com.example.practiceproject;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.practiceproject.adapter.GridViewAdapter;
import com.example.practiceproject.model.City;

import java.util.ArrayList;

public class AdvancedGridView extends AppCompatActivity {
    GridView myGrid;
    ArrayList<City> cityList = new ArrayList<>();
    GridViewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_advanced_grid_view);
        myGrid = findViewById(R.id.advGridView);
        cityList.add(new City("London", R.drawable.rome));
        cityList.add(new City("Paris", R.drawable.rome));
        cityList.add(new City("Rome", R.drawable.rome));
        gridViewAdapter = new GridViewAdapter(AdvancedGridView.this, R.layout.city_item, cityList);
        myGrid.setAdapter(gridViewAdapter);
    }
}