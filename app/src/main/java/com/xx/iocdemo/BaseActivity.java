package com.xx.iocdemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectUtils.injectLayout(this);
        InjectUtils.injectView(this);
        InjectUtils.injectClick(this);
        initView();
    }

    protected void initView() {

    }
}
