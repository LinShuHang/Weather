package com.example.xiao.weather.gson;

import com.google.gson.annotations.SerializedName;
/**
 * Created by Xiao航 on 2017/10/18.
 */

public class Now {

    @SerializedName("tmp")
    public  String temperature;

    @SerializedName("cond")
    public  More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }
}
