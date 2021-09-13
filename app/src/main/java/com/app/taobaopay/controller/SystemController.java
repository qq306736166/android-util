package com.app.taobaopay.controller;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

@SuppressLint("Registered")
public class SystemController extends AppCompatActivity {

    /**
     * 系统安装包获取
     */

    public List<String> getPackage_name(){
        PackageManager packageManager = getPackageManager();
        List<PackageInfo> info = packageManager.getInstalledPackages(0);;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < info.size(); i++) {
            if ((info.get(i).applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                list.add(info.get(i).packageName);
            }
        }
        return list;
    }

    /**
     * 获取系统版本号
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    public String getSystem_Version(){
        return Build.VERSION.RELEASE;
    }

    /**
     * 获取系统的API级别
     * @return
     */
    public int getSDK(){
        return Build.VERSION.SDK_INT;
    }
    /**
     * 获取设备品牌
     */
    public String getBrand(){
        return Build.BRAND;
    }

    /**
     * 获取设备基板名称
     */
    public String getBoard(){
        return Build.BOARD;
    }

    /**
     * 获取设备指令集名称（CPU的类型）
     */
    public String getCPU_ABL(){
        return Build.CPU_ABI;
    }

    /**
     * 获取第二个指令集名称（CPU的类型）
     */
    public String getCPU_ABL2(){
        return Build.CPU_ABI2;
    }

    /**
     * 获取设备驱动名称
     */
    public String getDevice(){
        return Build.DEVICE;
    }

    /**
     * 获取设备显示的版本包（在系统设置中显示为版本号）和ID一样
     */
    public String getDis(){
        return Build.DISPLAY;
    }

    /**
     * 获取设备的唯一标识。由设备的多个信息拼接合成。
     */
    public String getFINGERPRINT(){
        return Build.FINGERPRINT;
    }

    /**
     * 获取设备硬件名称,一般和基板名称一样（BOARD）
     */
    public String getHardWare(){
        return Build.HARDWARE;
    }

    /**
     * 获取设备主机地址
     */
    public String getHostAddress(){
        return Build.HOST;
    }

    /**
     * 获取设备版本号
     */
    public String getID(){
        return Build.ID;
    }

    /**
     * 获取手机的型号 设备名称
     */
    public String getModel(){
        return Build.MODEL;
    }

    /**
     * 获取设备制造商
     */
    public String getManufacturer(){
        return Build.MANUFACTURER;
    }

    /**
     * 整个产品的名称
     */
    public String getProduct(){
        return Build.PRODUCT;
    }

    /**
     * 无线电固件版本号，通常是不可用的 显示
     */
    public String getRadio(){
        return Build.RADIO;
    }

    /**
     * 设备标签。如release-keys 或测试的 test-keys
     */
    public String getTAGS(){
        return Build.TAGS;
    }

    /**
     * 系统时间
     */
    public Long getSystemTime(){
        return Build.TIME;
    }

    /**
     * 设备版本类型 主要为"user" 或"eng".
     */
    public String getType(){
        return Build.TYPE;
    }

    /**
     * 设备用户名 基本上都为android-build
     */
    public String getUserName(){
        return Build.USER;
    }

    /**
     * 设备当前的系统开发代号
     */
    public String getSystemNumber(){
        return Build.VERSION.CODENAME;
    }

    /**
     * 系统源代码控制值
     */
    public String getSystemIncrmental(){
        return Build.VERSION.INCREMENTAL;
    }
}
