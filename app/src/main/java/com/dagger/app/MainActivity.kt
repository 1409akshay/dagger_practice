package com.dagger.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dagger.app.component.AppComponent
import com.dagger.app.component.UserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var userRegistrationComponent: UserRegistrationComponent
    lateinit var appComponent: AppComponent

    @Inject
    lateinit var userRegistration: UserRegistration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appComponent = (application as MyApp).appComponent
        userRegistrationComponent = appComponent.getUserRegistrationComponentFactory()
            //DaggerUserRegistrationComponent.factory().create(3, appComponent)
        userRegistrationComponent.inject(this)
        userRegistration.registerUser("1409akshay@gmail.com", "11111")
    }
}