package com.chenmy.latte.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by 16571 on 2017/8/14.
 */

public final class Latte {
    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }
}
