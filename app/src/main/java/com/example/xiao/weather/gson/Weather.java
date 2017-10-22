package com.example.xiao.weather.gson;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;
/**
 * Created by Xiao航 on 2017/10/18.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;


    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
