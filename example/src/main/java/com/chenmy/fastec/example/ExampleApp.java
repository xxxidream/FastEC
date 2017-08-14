package com.chenmy.fastec.example;

import android.app.Application;

import com.chenmy.latte.app.Latte;

/**
 * Created by 16571 on 2017/8/14.
 */

public class ExampleApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this).
                withApiHost("http://127.0.0.1")
                .configure();
    }
}
