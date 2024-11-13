package com.example.practiceproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.practiceproject.adapter.CityAdapter;
import com.example.practiceproject.model.City;

import java.util.ArrayList;
import java.util.List;

public class AdvancedListView extends AppCompatActivity {
    ListView myAdvLv;
    ArrayList<City> cityList = new ArrayList<>();
    CityAdapter cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_advanced_list_view);
        myAdvLv = findViewById(R.id.advListView);
        cityList.add(new City("London", R.drawable.rome));
        cityList.add(new City("Paris", R.drawable.rome));
        cityList.add(new City("Rome", R.drawable.rome));
        cityAdapter = new CityAdapter(AdvancedListView.this, R.layout.city_item, cityList);
        myAdvLv.setAdapter(cityAdapter);
    }
}