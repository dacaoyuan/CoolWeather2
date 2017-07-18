package com.shkj.coolweather2.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhyantai on 2017/7/18.
 */

public class HttpUtil {


    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
