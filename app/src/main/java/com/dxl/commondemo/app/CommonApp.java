package com.dxl.commondemo.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import org.androidannotations.annotations.EApplication;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/4 9:33 AM
 */
@EApplication
public class CommonApp extends Application {

    /**
     * 主线程Handler
     */
    private static Handler sHandler;

    public static Handler getMainHandler() {
        return sHandler;
    }

    public static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = getApplicationContext();
        sHandler = new Handler();
    }

    public static Context getAppContext() {
        return sAppContext;
    }

}
