package com.shkj.coolweather2.activity;


import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by zhyantai on 2017/7/18.
 */

public class InitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
