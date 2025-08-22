package com.example.notification.impl

import com.example.notification.strategy.NotificationStrategy

class WhatsAppNotification : NotificationStrategy {
    override fun sendNotification(message: String, recipient: String): Boolean {
        println("Sending WhatsApp message to $recipient with message: $message")
        return true
    }
}