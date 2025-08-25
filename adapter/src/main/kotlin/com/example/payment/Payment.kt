package com.example.payment

import java.math.BigInteger

interface Payment {
    fun pay(amount: BigInteger)
}