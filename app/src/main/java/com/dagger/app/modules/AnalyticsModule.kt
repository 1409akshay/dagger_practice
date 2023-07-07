package com.dagger.app.modules

import com.dagger.app.interfaces.AnalyticService
import com.dagger.app.interfaces.FirebaseAnalytics
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticService {
        return FirebaseAnalytics()
    }
}