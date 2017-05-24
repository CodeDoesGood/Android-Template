package org.codedoesgood.androidtemplate;

import android.app.Application;
import timber.log.Timber;

/**
 * Default launch application
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
