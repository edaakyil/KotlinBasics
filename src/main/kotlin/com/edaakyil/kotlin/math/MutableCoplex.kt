package com.edaakyil.kotlin.math

import kotlin.math.sqrt

class MutableComplex(var real: Double = 0.0, var imaginary: Double = 0.0) {
    val norm: Double
        get() = sqrt(real * real + imaginary * imaginary)

    val length: Double
        get() = norm

    val conjugate: MutableComplex
        get() = MutableComplex(real, -imaginary)
}