package com.example.practiceproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practiceproject.R;
import com.example.practiceproject.model.City;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<City> cityList;

    public GridViewAdapter(Context context, int layout, List<City> cityList) {
        this.context = context;
        this.layout = layout;
        this.cityList = cityList;
    }

    @Override
    public int getCount() {
        return cityList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout, null);

        TextView cityNameGrid = view.findViewById(R.id.nameCityItem);
        ImageView cityImageGrid = view.findViewById(R.id.imageCityItem);

        City city = cityList.get(i);
        cityNameGrid.setText(city.getCityName());
        cityImageGrid.setImageResource(city.getCityImage());
        return view;
    }
}
