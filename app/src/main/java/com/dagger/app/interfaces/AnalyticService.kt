package com.dagger.app.interfaces

import android.util.Log
import com.dagger.app.Constants
import javax.inject.Singleton

@Singleton
interface AnalyticService {
    fun sendEvent(eventName:String,eventType: String)
}


class FirebaseAnalytics : AnalyticService {
    override fun sendEvent(eventName: String, eventType: String) {
        Log.i(Constants.TAG, "sendEvent: Firebase Analytics Delivered")
    }
}

class CleverTapAnalytics : AnalyticService {
    override fun sendEvent(eventName: String, eventType: String) {
        Log.i(Constants.TAG, "sendEvent: Clevertap Analytics Delivered")
    }
}