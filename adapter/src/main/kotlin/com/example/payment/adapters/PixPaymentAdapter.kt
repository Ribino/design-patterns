package com.example.payment.adapters

import com.example.payment.adaptees.PixPayment
import com.example.payment.Payment
import java.math.BigInteger

class PixPaymentAdapter(
    private val pixPayment: PixPayment,
    private val pixKey: String
) : Payment {
    
    override fun pay(amount: BigInteger) {
        pixPayment.processPixPayment(amount, pixKey)
    }

}