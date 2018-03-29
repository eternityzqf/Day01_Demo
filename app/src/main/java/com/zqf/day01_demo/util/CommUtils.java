package com.zqf.day01_demo.util;

import android.content.Context;
import android.content.Intent;

/**
 * class from
 * Created by zqf
 * Time 2018/3/29 14:49
 */

public class CommUtils {
    private static CommUtils instance = null;

    private CommUtils() {
    }

    public static CommUtils getInstance() {
        if (instance == null) {
            synchronized (CommUtils.class) {
                if (instance == null) {
                    instance = new CommUtils();
                }
            }
        }
        return instance;
    }


    public void startActivity(Context context,Class<?> cls) {
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
}
