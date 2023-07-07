package com.dagger.app.modules

import com.dagger.app.interfaces.AnalyticService
import com.dagger.app.interfaces.FirebaseAnalytics
import com.dagger.app.interfaces.SaveUserDB
import com.dagger.app.interfaces.UserReposistory
import dagger.Module
import dagger.Provides

@Module
class UserReposistoryModule {

    @Provides
    fun saveToDb(analytics: AnalyticService): UserReposistory {
        return SaveUserDB(analytics)
    }
}