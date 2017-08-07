package com.eqdd.annotation.api;

import android.app.Activity;

import java.lang.reflect.Method;

/**
 * @author hiphonezhu@gmail.com
 * @version [CompilerAnnotation, 17/6/20 11:28]
 */

public class DataInjector {
    public static void saveData(Activity host) {
        String classFullName = host.getClass().getName() + "$$ViewInjector";
        try {
            Class proxy = Class.forName(classFullName);
            Method saveMethod = proxy.getDeclaredMethod("saveData", host.getClass());
            saveMethod.invoke(proxy.newInstance(), host);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void recoverData(Activity host) {
        String classFullName = host.getClass().getName() + "$$ViewInjector";
        try {
            Class proxy = Class.forName(classFullName);
            Method saveMethod = proxy.getDeclaredMethod("recoverData", host.getClass());
            saveMethod.invoke(proxy.newInstance(), host);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clearData(Activity host) {
        String classFullName = host.getClass().getName() + "$$ViewInjector";
        try {
            Class proxy = Class.forName(classFullName);
            Method saveMethod = proxy.getDeclaredMethod("clearData", host.getClass());
            saveMethod.invoke(proxy.newInstance(), host);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
