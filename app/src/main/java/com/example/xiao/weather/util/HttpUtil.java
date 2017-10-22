package com.example.xiao.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * Created by Xiao航 on 2017/10/18.
 */

public class HttpUtil {
    public static void sendOkHttpRequests(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

