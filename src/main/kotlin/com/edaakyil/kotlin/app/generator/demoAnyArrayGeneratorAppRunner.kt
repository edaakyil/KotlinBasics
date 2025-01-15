package com.edaakyil.kotlin.app.generator

import com.edaakyil.kotlin.math.Complex
import com.edaakyil.kotlin.math.geometry.Point
import com.edaakyil.kotlin.util.console.readInt

fun main() = runDemoAnyArrayGeneratorApp()

fun runDemoAnyArrayGeneratorApp() {
    val count = readInt("Input count: ")
    val array = createArray(count)

    for (a in array) {
        println("-----------------")
        println(a.javaClass.name)

        when (a) {
            is Point -> println("(${a.x}, ${a.y})")
            is Complex -> println("|(${a.real}, ${a.imaginary})| = ${a.norm}")
            is Int -> println("$a * $a = ${a * a}")
            is Boolean -> println("Not of: ${!a}")
            is Char -> println("Character: $a, Upper: ${a.uppercase()}")
        }
    }
}