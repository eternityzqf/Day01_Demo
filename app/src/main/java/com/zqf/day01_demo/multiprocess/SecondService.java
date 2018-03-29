package com.zqf.day01_demo.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.zqf.day01_demo.util.LogUtil;

/**
 * class from
 * Created by zqf
 * Time 2018/3/29 10:08
 */

public class SecondService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.logD("SecondService  onCreate");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
