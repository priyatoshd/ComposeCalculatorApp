package com.priyatosh.composecalculator

import com.priyatosh.composecalculator.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
