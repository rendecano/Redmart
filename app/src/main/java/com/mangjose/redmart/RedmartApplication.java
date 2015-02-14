
package com.mangjose.redmart;

import com.mangjose.redmart.network.VolleyHelper;

import android.app.Application;
import android.graphics.Bitmap;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

import java.security.KeyStore;

public class RedmartApplication extends Application {


    private static RedmartApplication mInstance;


    @Override
    public void onCreate() {

        super.onCreate();

        mInstance = this;

        VolleyHelper.init(this);

        // Initialize image loader

    }

    public static RedmartApplication getInstance() {
        return mInstance;
    }

}
