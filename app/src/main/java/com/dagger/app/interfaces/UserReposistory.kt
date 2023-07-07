package com.dagger.app.interfaces

import android.util.Log

import com.dagger.app.Constants
import javax.inject.Inject

interface UserReposistory {
    fun saveUser(email: String, pswd: String)
}

class SaveUserDB @Inject constructor(private val analytics: AnalyticService) : UserReposistory {
    override fun saveUser(email: String, pswd: String) {
        Log.i(Constants.TAG, "User Saved in DB!!")
        analytics.sendEvent("Message Printed from Analytics", "General")
    }
}

class SaveUserServer(private val analytics: AnalyticService) : UserReposistory {
    override fun saveUser(email: String, pswd: String) {
        Log.i(Constants.TAG, "User Saved in Server!!")
        analytics.sendEvent("Message Printed from Analytics", "General")
    }
}