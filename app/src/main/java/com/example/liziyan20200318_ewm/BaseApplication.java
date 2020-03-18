package com.example.liziyan20200318_ewm;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
