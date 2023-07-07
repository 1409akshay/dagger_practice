package com.dagger.app.component

import com.dagger.app.ActivityScope

import com.dagger.app.MainActivity
import com.dagger.app.modules.AnalyticsModule
import com.dagger.app.modules.NotificationServiceModule
import com.dagger.app.modules.UserReposistoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
//@Component(dependencies = [AppComponent::class], modules = [UserReposistoryModule::class, NotificationServiceModule::class])
@Subcomponent(modules = [UserReposistoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

//    @Subcomponent.Factory
//    interface Factory {
//        fun create(@BindsInstance count: Int): UserRegistrationComponent
//    }
}