package com.example.whether.gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by walle on 2/16/17.
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
