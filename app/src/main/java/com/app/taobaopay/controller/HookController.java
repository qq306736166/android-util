package com.app.taobaopay.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.util.List;

@SuppressLint("Registered")
public class HookController extends Activity {
    private ResolveInfo resolveInfo;
    /**
     * 判断是否在前台运行
     * @param context
     * @return
     */
    public boolean isRunningForeground(Context context){
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> processes = activityManager.getRunningAppProcesses();
        for(ActivityManager.RunningAppProcessInfo processInfo : processes){
            if(processInfo.processName.equals(context.getPackageName())){
                if(processInfo.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 遍历所有前台运行应用名
     * @param context
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.Q)
    public String RunningForeground_PackName(Context context){
        ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> task = activityManager.getRunningTasks(1);
        for(ActivityManager.RunningTaskInfo taskInfo : task){
            if(taskInfo.isRunning){
                return taskInfo.topActivity.getPackageName();
            }
        }
        return "";
    }

    /**
     * 获取应用运行状态
     * @param fileDescriptor
     * @param context
     * @param package_name
     */
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void Running_State(FileDescriptor fileDescriptor, Context context, String package_name){
        ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> service = activityManager.getRunningServices(1);
        for(ActivityManager.RunningServiceInfo serviceInfo : service){
            if(serviceInfo.started){
                if(serviceInfo.clientCount > 0){
                    activityManager.dumpPackageState(fileDescriptor,package_name);
                }
            }
        }
    }

    /**
     * 执行home键
     * @param bundle
     * @param view
     */
    public void RunningHomeKey(Bundle bundle, View view) {
        super.onCreate(bundle);
        setContentView(view);
        PackageManager pm = getPackageManager();
        resolveInfo = pm.resolveActivity(new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME),0);
        RunningTold();
    }

    private void RunningTold(){
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setComponent(new ComponentName(activityInfo.packageName,activityInfo.name));
    }
}
