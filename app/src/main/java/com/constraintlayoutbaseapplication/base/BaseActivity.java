package com.constraintlayoutbaseapplication.base;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.constraintlayoutbaseapplication.R;

public class BaseActivity extends AppCompatActivity {

    public Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        context = this;
    }

    public void setBaseContentView(int layoutId) {
        ((ScrollView)findViewById(R.id.base_scroll_view)).setFillViewport(true);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.base_main_layout);
        LayoutInflater inflater = getLayoutInflater();
        final View view = inflater.inflate(layoutId, null);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        layout.addView(view, params);
    }
//    layout = (ConstraintLayout)inflater.inflate(layoutId, (ViewGroup) layout, true);
//        ButterKnife.bind(this);
//        view.setOnTouchListener(new View.OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View arg0, MotionEvent arg1) {
//                hideKeyBoard();
//                view.setFocusable(true);
//                view.setFocusableInTouchMode(true);
//                return false;
//            }
//        });

    public void hideKeyBoard() {
        View view = ((Activity) context).getWindow().peekDecorView();
        if (view != null) {
            InputMethodManager inputmanger = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputmanger.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
