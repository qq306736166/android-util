package com.app.taobaopay.controller;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;

public class ManuFacturerController extends AppCompatActivity {

    /**
     * 判断是否华为设备
     * @return
     */
    public Boolean isHuaWei(){
        String huawei = Build.MANUFACTURER.toLowerCase();
        return huawei.contains("huawei");
    }

    /**
     * 判断是否魅族设备
     * @return
     */
    public Boolean isMeiZu(){
        String meizu = Build.MANUFACTURER.toLowerCase();
        return meizu.contains("meizu");
    }

    /**
     * 判断是否小米设备
     * @return
     */
    public Boolean isXiaoMi(){
        String xiaomi = Build.MANUFACTURER.toLowerCase();
        return xiaomi.contains("xiaomi");
    }

    /**
     * 判断是否oppo设备
     * @return
     */
    public Boolean isOppo(){
        String oppo = Build.MANUFACTURER.toLowerCase();
        return oppo.contains("oppo");
    }

    /**
     * 判断是否vivo设备
     * @return
     */
    public Boolean isVivo(){
        String vivo = Build.MANUFACTURER.toLowerCase();
        return vivo.contains("vivo");
    }

    /**
     * 判断是否三星设备
     * @return
     */
    public Boolean isSamsung(){
        String samsung = Build.MANUFACTURER.toLowerCase();
        return samsung.contains("samsung");
    }

    /**
     * 判断是否中兴设备
     * @return
     */
    public Boolean isZte(){
        String zte = Build.MANUFACTURER.toLowerCase();
        return zte.contains("zte");
    }

    /**
     * 判断是否酷派设备
     * @return
     */
    public Boolean isYulong(){
        String yulong = Build.MANUFACTURER.toLowerCase();
        return yulong.contains("yulong");
    }

    /**
     * 判断是否联想设备
     * @return
     */
    public Boolean islenovo(){
        String lenovo = Build.MANUFACTURER.toLowerCase();
        return lenovo.contains("lenovo");
    }

    /**
     * 判断是否索尼设备
     * @return
     */
    public Boolean issony(){
        String sony = Build.MANUFACTURER.toLowerCase();
        return sony.contains("sony");
    }
}
