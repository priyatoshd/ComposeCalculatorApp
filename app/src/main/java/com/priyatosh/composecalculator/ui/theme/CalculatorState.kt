package com.priyatosh.composecalculator.ui.theme

import com.priyatosh.composecalculator.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
