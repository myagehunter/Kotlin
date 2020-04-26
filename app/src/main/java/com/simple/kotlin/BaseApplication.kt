package com.simple.kotlin

import android.app.Application
import org.quick.component.QuickAndroid
import org.quick.component.QuickToast

/**
 *    author : jianghuizhong
 *    date   : 2020/4/26
 *    desc   :
 */
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        QuickAndroid.init(this);
    }

}