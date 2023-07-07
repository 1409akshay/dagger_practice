package com.dagger.app

import android.app.Application
import com.dagger.app.component.AppComponent
import com.dagger.app.component.DaggerAppComponent

class MyApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}