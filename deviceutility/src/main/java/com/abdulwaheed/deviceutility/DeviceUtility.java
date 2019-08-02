package com.abdulwaheed.deviceutility;

import android.content.res.Resources;

public class DeviceUtility {

    public static boolean isDeviceTablet () {
        return false;
    }

    public static int getDeviceHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int getDeviceWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
