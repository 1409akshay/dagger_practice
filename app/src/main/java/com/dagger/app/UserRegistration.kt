package com.dagger.app

import com.dagger.app.interfaces.NotificationService
import com.dagger.app.interfaces.UserReposistory
import javax.inject.Inject

class UserRegistration @Inject constructor(
    private val userReposistory: UserReposistory,
    @Email private val notificationService: NotificationService
) {
    fun registerUser(email: String, pswd: String) {
        userReposistory.saveUser(email, pswd)
        notificationService.send(email, "sender@gmail.com", "Hey Welcome here!!")
    }
}