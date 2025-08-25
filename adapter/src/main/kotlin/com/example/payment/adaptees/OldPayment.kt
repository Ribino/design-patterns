package com.example.payment.adaptees

import java.math.BigInteger

class OldPaymment() {
    fun makePayment(amount: BigInteger) {
        println("Processing payment of R\$$amount using OldPayment system.")
    }
}