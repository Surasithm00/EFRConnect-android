package com.siliconlabs.bledemo.Application

import android.app.Application
import com.siliconlabs.bledemo.Bluetooth.Parsing.Engine
import com.siliconlabs.bledemo.BuildConfig
import timber.log.Timber
import timber.log.Timber.DebugTree
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SiliconLabsDemoApplication : Application() {
    companion object {
        lateinit var APP: SiliconLabsDemoApplication
    }

    init {
        APP = this
    }

    override fun onCreate() {
        super.onCreate()
        Engine.init(this)

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }

}