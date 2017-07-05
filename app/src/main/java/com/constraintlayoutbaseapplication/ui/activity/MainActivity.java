package com.constraintlayoutbaseapplication.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.constraintlayoutbaseapplication.R;
import com.constraintlayoutbaseapplication.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBaseContentView(R.layout.activity_main);
    }
}
