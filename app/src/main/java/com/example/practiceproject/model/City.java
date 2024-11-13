package com.example.practiceproject.model;

public class City {
    private String cityName;
    private int cityImage;

    public City(String cityName, int cityImage) {
        this.cityName = cityName;
        this.cityImage = cityImage;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityImage() {
        return cityImage;
    }

    public void setCityImage(int cityImage) {
        this.cityImage = cityImage;
    }
}
