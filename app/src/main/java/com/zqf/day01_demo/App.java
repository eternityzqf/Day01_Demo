package com.zqf.day01_demo;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;
import com.zqf.day01_demo.util.LogUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        initBuglyCrash();
    }

    // 初始化Bugly
    private void initBuglyCrash() {
        Context context = getApplicationContext();
        // 获取当前包名
        String packageName = context.getPackageName();
        // 获取当前进程名
        String processName = getProcessName(android.os.Process.myPid());
        // 设置是否为上报进程
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(context);
        strategy.setUploadProcess(processName == null || processName.equals(packageName));

//        CrashReport.initCrashReport(context, "22cea408d9", true, strategy);
        // 如果通过“AndroidManifest.xml”来配置APP信息，初始化方法如下
//        CrashReport.initCrashReport(context, strategy);

        //升级SDK统一配置
        Bugly.init(context, "22cea408d9", true, strategy);
    }


    /**
     * 获取进程号对应的进程名
     *
     * @param pid 进程号
     * @return 进程名
     */
    private static String getProcessName(int pid) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            String processName = reader.readLine();
            if (!TextUtils.isEmpty(processName)) {
                processName = processName.trim();
            }
            return processName;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }
}
