package com.example.payment

import com.example.payment.Payment
import com.example.payment.adapters.CreditCardPaymentAdapter
import com.example.payment.adapters.PixPaymentAdapter
import com.example.payment.adapters.OldPaymentAdapter
import com.example.payment.CreditCardPayment
import com.example.payment.adaptees.PixPayment
import com.example.payment.adaptees.OldPaymment

fun main() {
    val paymentList: List<Payment> = listOf(
        OldPaymentAdapter(
            oldPayment = OldPaymment()  
        ),
        CreditCardPaymentAdapter(
            creditCardPayment = CreditCardPayment(),
            cardNumber = "1234-5678-9012-3456"
        ),
        PixPaymentAdapter(
            pixPayment = PixPayment(),
            pixKey = "lucas@pix.com"
        )
    )

    paymentList.forEach { it.pay(amount = 100.toBigInteger()) }

}