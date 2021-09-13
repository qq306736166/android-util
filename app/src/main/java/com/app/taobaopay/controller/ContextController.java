package com.app.taobaopay.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class ContextController extends AppCompatActivity {

    /**
     * 获取当前手机屏幕的尺寸（实际尺寸）
     * @param context
     * @return
     */
    public static Float getPingMuSize(Context context){
        int dep = context.getResources().getDisplayMetrics().densityDpi;
        float density = context.getResources().getDisplayMetrics().density;
        float xdpi = context.getResources().getDisplayMetrics().xdpi;
        float ydpi = context.getResources().getDisplayMetrics().ydpi;
        int width = context.getResources().getDisplayMetrics().widthPixels;
        int height = context.getResources().getDisplayMetrics().heightPixels;
        float width2 = (width / xdpi) * (width / xdpi);
        float height2 = (height / ydpi) * (width / xdpi);
        return (float)Math.sqrt(width2+height2);
    }

    /**
     * 获取手机宽度像素
     * @param activity
     * @param context
     * @return
     */
    public int getDisplayWidthPx(Activity activity,Context context){
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point outsize = new Point();
        display.getSize(outsize);
        int x = outsize.x;
        return x;
    }

    /**
     * 获取手机高度像素
     * @param activity
     * @param context
     * @return
     */
    public int getDisplayHeightPx(Activity activity,Context context){
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point outsize = new Point();
        display.getSize(outsize);
        int y = outsize.y;
        return y;
    }

    /**
     * 通过getWindowManage获取宽尺寸
     * @return
     */
    public int getWindowManageWidth(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    /**
     * 通过getWindowManage获取高尺寸
     * @return
     */
    public int getWindowManageHeight(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    /**
     * 通过Resource获取宽度
     * @return
     */
    public int getResourceWidth(){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 通过Resource获取高度
     * @return
     */
    public int getResourceHeight(){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    /**
     * 获取屏幕的默认分辨率 宽
     * @return
     */
    public int getDefaultWidth(){
        Display display = getWindowManager().getDefaultDisplay();
        return display.getWidth();
    }

    /**
     * 获取屏幕的默认分辨率 高
     * @return
     */
    public int getDefaultHeight(){
        Display display = getWindowManager().getDefaultDisplay();
        return display.getHeight();
    }
}
