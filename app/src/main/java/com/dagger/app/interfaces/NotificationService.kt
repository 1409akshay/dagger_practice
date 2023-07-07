package com.dagger.app.interfaces

import android.util.Log
import com.dagger.app.ActivityScope

import com.dagger.app.Constants
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, frm: String, body: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, frm: String, body: String) {
        Log.i(Constants.TAG, "Welcome Email Sent")
    }
}

class SendMessage(private val retryCount: Int) : NotificationService {
    override fun send(to: String, frm: String, body: String) {
        Log.i(Constants.TAG, "Welcome Message Sent - count $retryCount")
    }

}