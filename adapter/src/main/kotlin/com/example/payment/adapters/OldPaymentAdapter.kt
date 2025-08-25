package com.example.payment.adapters

import com.example.payment.adaptees.OldPaymment
import com.example.payment.Payment
import java.math.BigInteger

class OldPaymentAdapter(
    private val oldPayment: OldPaymment
) : Payment  {
    override fun pay(amount: BigInteger) { 
        oldPayment.makePayment(amount);
    }

}