package com.example.notification

import com.example.notification.context.Notificator
import com.example.notification.impl.EmailNotification
import com.example.notification.impl.WhatsAppNotification
import com.example.notification.impl.SmsNotification

fun main(vararg args: String) {
    val message = "Hello, this is a test notification!"
    val recipient = args.getOrNull(0) ?: "Lucas Ribino"
    val channel = args.getOrNull(1) ?: "email"

    val strategy = when (channel.toLowerCase()) {
        "sms" -> SmsNotification()
        "whatsapp" -> WhatsAppNotification()
        "email" -> EmailNotification()
        else -> throw IllegalArgumentException("Unknown notification channel: $channel")
    }

    val notificator = Notificator(strategy)
    
    notificator.notify(message, recipient)
}