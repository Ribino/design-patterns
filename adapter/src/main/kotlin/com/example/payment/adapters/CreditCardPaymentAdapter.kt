package com.example.payment.adapters

import com.example.payment.CreditCardPayment
import com.example.payment.Payment
import java.math.BigInteger

class CreditCardPaymentAdapter(
    private val creditCardPayment: CreditCardPayment,
    private val cardNumber: String
) : Payment {
    
    override fun pay(amount: BigInteger) {
        creditCardPayment.processCreditCardPayment(amount, cardNumber)
    }

}