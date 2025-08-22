package com.example.notification.context

import com.example.notification.strategy.NotificationStrategy

class Notificator(private val strategy: NotificationStrategy) {
    fun notify(message: String, recipient: String): Boolean {
        return strategy.sendNotification(message, recipient)
    }
}