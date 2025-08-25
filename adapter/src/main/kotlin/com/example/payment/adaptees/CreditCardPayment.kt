package com.example.payment

import java.math.BigInteger

class CreditCardPayment() {
    fun processCreditCardPayment(amount: BigInteger, cardNumber: String) {
        println("Processing credit card number $cardNumber payment of R\$$amount.")
    }
}