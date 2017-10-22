package com.example.xiao.weather.gson;

import static android.R.attr.max;

/**
 * Created by Xiao航 on 2017/10/18.
 */

import com.google.gson.annotations.SerializedName;
public class Suggestion {


    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
    public  CarWash carWash;


    public Sport sport;



    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }



}
