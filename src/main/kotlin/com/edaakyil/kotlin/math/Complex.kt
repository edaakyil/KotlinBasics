package com.edaakyil.kotlin.math

import kotlin.math.sqrt

class Complex(val real: Double = 0.0, val imaginary: Double = 0.0) {
    val norm: Double
        get() = sqrt(real * real + imaginary * imaginary)

    val length: Double
        get() = norm

    val conjugate: Complex
        get() = Complex(real, -imaginary)
}