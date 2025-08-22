package com.example.notification.impl

import com.example.notification.strategy.NotificationStrategy


class EmailNotification : NotificationStrategy {
    override fun sendNotification(message: String, recipient: String): Boolean {
        println("Sending email to $recipient with message: $message")
        return true
    }
}