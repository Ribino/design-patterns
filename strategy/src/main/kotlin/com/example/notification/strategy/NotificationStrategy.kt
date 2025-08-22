package com.example.notification.strategy

interface NotificationStrategy {
    fun sendNotification(message: String, recipient: String): Boolean
}