package com.zqf.day01_demo.startupmode;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zqf.day01_demo.R;
import com.zqf.day01_demo.util.CommUtils;
import com.zqf.day01_demo.util.LogUtil;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * class from
 * Created by zqf
 * Time 2018/3/29 14:13
 */

public class FourActivity extends Activity {

    @Bind(R.id.five_dialog_activity)
    TextView fiveDialogActivity;
    @Bind(R.id.four_activity)
    TextView fourActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_layout);
        ButterKnife.bind(this);
        LogUtil.logD("Four-->onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.logD("Four-->onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.logD("Four-->onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.logD("Four-->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.logD("Four-->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.logD("Four-->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.logD("Four-->onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtil.logD("Four-->onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtil.logD("Four-->onRestoreInstanceState");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LogUtil.logD("Four-->onConfigurationChanged");
    }

    @OnClick({R.id.four_activity, R.id.five_dialog_activity})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.four_activity:
                CommUtils.getInstance().startActivity(this, FourActivity.class);
                break;
            case R.id.five_dialog_activity:
                CommUtils.getInstance().startActivity(this, FiveActivity.class);
                break;
        }
    }
}
