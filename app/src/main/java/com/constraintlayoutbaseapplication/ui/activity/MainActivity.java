package com.constraintlayoutbaseapplication.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.constraintlayoutbaseapplication.R;
import com.constraintlayoutbaseapplication.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBaseContentView(R.layout.activity_main);

        //设置title文本
        setTitle("新Title");
        //设置返回拦截
        getBaseBack().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("log","退不出去了吧");
            }
        });
        //设置功能键，以及点击方法回调监听
        setBaseRightIcon1(R.mipmap.more, "更多", new OnClickRightIcon1CallBack() {
            @Override
            public void clickRightIcon1() {
                Log.i("Exception","这都找到我了");
            }
        });
    }
}
