package com.edaakyil.kotlin.math.geometry

import kotlin.math.PI
import kotlin.math.abs

class Circle(radius: Double = 0.0) {
    var radius: Double = abs(radius)
        set(value) {
            field = abs(radius)
        }
    val area: Double
        get() = PI * radius * radius

    val circumference: Double
        get() = 2 * PI * radius
}