package com.example.notification.impl

import com.example.notification.strategy.NotificationStrategy

class SmsNotification : NotificationStrategy {
    override fun sendNotification(message: String, recipient: String): Boolean { 
        println("Sending SMS to $recipient with message: $message")
        return true
    }
}