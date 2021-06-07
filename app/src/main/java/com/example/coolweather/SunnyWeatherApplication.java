package com.example.coolweather;

import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getContext();
    }

    public static Context getContext() {
        return context;
    }
}
