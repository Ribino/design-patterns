package com.example.payment.adaptees

import java.math.BigInteger

class PixPayment {
    fun processPixPayment(amount: BigInteger, pixKey: String) {
        println("Processing Pix payment of R$${amount} for key $pixKey.")
    }
}