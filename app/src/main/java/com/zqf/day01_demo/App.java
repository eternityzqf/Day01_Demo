package com.zqf.day01_demo;

import android.app.Application;

import com.zqf.day01_demo.util.LogUtil;

/**
 * class from
 * Created by zqf
 * Time 2018/3/29 10:15
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.logD("Application  onCreate");
    }
}
