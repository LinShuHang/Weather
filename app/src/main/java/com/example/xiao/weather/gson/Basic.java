package com.example.xiao.weather.gson;

import android.text.style.UpdateAppearance;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Xiao航 on 2017/10/18.
 */

public class Basic {

    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public  String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
