package com.example.hanshu.broadcastpractice;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by HanShu on 2016/7/18.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AllActivity.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AllActivity.removeActivity(this);
    }
}
