package com.du.hast

import android.app.Application
import com.du.hast.di.applicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(applicationModule))
        }
    }
}