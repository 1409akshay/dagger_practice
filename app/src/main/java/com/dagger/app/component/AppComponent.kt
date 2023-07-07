package com.dagger.app.component

import com.dagger.app.interfaces.AnalyticService
import com.dagger.app.modules.AnalyticsModule
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])

interface AppComponent {
    fun getUserRegistrationComponentFactory(): UserRegistrationComponent
}