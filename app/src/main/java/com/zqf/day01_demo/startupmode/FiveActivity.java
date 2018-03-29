package com.zqf.day01_demo.startupmode;

import android.app.Activity;
import android.os.Bundle;
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

public class FiveActivity extends Activity {

    @Bind(R.id.five_start_four)
    TextView fiveStartFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_layout);
        ButterKnife.bind(this);
        LogUtil.logD("Five-->onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.logD("Five-->onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.logD("Five-->onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.logD("Five-->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.logD("Five-->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.logD("Five-->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.logD("Five-->onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtil.logD("Five-->onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtil.logD("Five-->onRestoreInstanceState");
    }

    @OnClick(R.id.five_start_four)
    public void onViewClicked() {
        CommUtils.getInstance().startActivity(this, FourActivity.class);
    }
}
