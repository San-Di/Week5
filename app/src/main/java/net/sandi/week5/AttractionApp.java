package net.sandi.week5;

import android.app.Application;
import android.content.Context;

/**
 * Created by UNiQUE on 7/7/2016.
 */
public class AttractionApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
