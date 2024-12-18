package com.edaakyil.kotlin.math.geometry

import kotlin.math.sqrt

class Point(var x: Double = 0.0, val y: Double = 0.0) {
    fun distance(a: Double = 0.0, b: Double = 0.0) = sqrt((x - a) * (x - a) + (y - b) * (y - b))

    fun distance(other: Point) = distance(other.x, other.y)
}