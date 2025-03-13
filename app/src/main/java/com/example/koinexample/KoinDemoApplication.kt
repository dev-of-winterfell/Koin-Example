package com.example.koinexample

import android.app.Application
import com.example.koinexample.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinDemoApplication:Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@KoinDemoApplication)
            modules(appModule)
        }
    }
}