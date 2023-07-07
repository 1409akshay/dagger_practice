package com.dagger.app

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class Message(
    /** The name.  */
    val value: String = "message"
)

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class Email(
    /** The name.  */
    val value: String = "email"
)