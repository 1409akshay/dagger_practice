package com.dagger.app.modules

import com.dagger.app.Email
import com.dagger.app.interfaces.EmailService
import com.dagger.app.Message
import com.dagger.app.interfaces.NotificationService
import com.dagger.app.interfaces.SendMessage
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule() {

    @Message
    @Provides
    fun sendMessage(): NotificationService {
        return SendMessage(3)
    }

    @Email
    @Provides
    fun sendEmail(emailService: EmailService): NotificationService {
        return emailService
    }
}