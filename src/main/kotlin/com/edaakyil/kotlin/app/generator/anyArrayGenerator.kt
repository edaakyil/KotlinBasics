package com.edaakyil.kotlin.app.generator

import com.edaakyil.kotlin.math.Complex
import com.edaakyil.kotlin.math.geometry.Point
import kotlin.random.Random

fun createArray(count: Int): Array<Any> {
    val result = Array<Any>(count) { }

    for (i in result.indices)
        result[i] = createObject()

    return result
}

private fun createObject(): Any {
    return when (Random.nextInt(5)) {
        0 -> Point(Random.nextDouble(-100.0, 100.0), Random.nextDouble(-100.0, 100.0))
        1 -> Complex(Random.nextDouble(-10.0, 10.0), Random.nextDouble(-10.0, 10.0))
        2 -> Random.nextInt(-1128, 128)
        3 -> Random.nextBoolean()
        else -> (if (Random.nextBoolean()) 'A' else 'a') + Random.nextInt(26)
    }
}