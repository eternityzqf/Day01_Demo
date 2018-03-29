package com.zqf.day01_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zqf.day01_demo.multiprocess.SecondService;
import com.zqf.day01_demo.multiprocess.ThirdService;
import com.zqf.day01_demo.startupmode.FourActivity;
import com.zqf.day01_demo.util.CommUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.more_process)
    TextView moreProcess;
    @Bind(R.id.startup_mode)
    TextView startupMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.more_process, R.id.startup_mode})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.more_process:
                startService(new Intent(this, SecondService.class));
                startService(new Intent(this, ThirdService.class));
                break;
            case R.id.startup_mode:
                CommUtils.getInstance().startActivity(this, FourActivity.class);
                break;
        }
    }
}
