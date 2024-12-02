/*
Sınıf Çalışması: Klavyeden katsayıları girilen ikinci dereceden bir denklemin köklerini bulan programı yazınız.

Açıklama: Programda yeni nesil sqrt global fonksiyonunu kullanınız.
 */

package com.edaakyil.studywork.sw3

import kotlin.math.sqrt

fun main() = runQuadraticEquationRootsApp()

fun runQuadraticEquationRootsApp() {
    print("Input a: ")
    val a = readln().toDouble()

    print("Input b: ")
    val b = readln().toDouble()

    print("Input c: ")
    val c = readln().toDouble()

    findQuadraticEquationRoots(a, b, c)
}

fun findQuadraticEquationRoots(a: Double, b: Double, c: Double) {
    fun calculateDelta() = b * b - 4 * a * c
    val delta = calculateDelta()

    fun findByDeltaPositive() {
        val sqrtDelta = sqrt(delta)
        val x1 = (-b + sqrtDelta) / (2 * a)
        val x2 = (-b - sqrtDelta) / (2 * a)

        println("x1 = $x1, x2 = $x2")
    }

    fun findByDeltaZero() = println("x1 = x2 = ${-b / (2 * a)}")

    if (delta > 0)
        findByDeltaPositive()
    else if(delta == 0.0)
        findByDeltaZero()
    else
        println("No real root!...")
}

/*
fun findQuadraticEquationRoots(a: Double, b: Double, c: Double) {
    fun calculateDelta() = b * b - 4 * a * c

    val delta = calculateDelta()

    /*
    if (delta >= 0) {
        val x1 = (-b + sqrt(delta)) / (2 * a)
        val x2 = (-b - sqrt(delta)) / (2 * a)
        println("${a}x² + ${b}x + $c ikinci dereceden denkleminin kökleri: x1 = $x1, x2 = $x2")
    } else {
        println("${a}x² + ${b}x + $c ikinci dereceden denklemi için gerçek kök yok!")
    }
    */

    println(if (delta >= 0) {
        val x1 = (-b + sqrt(delta)) / (2 * a)
        val x2 = (-b - sqrt(delta)) / (2 * a)
        "${a}x² + ${b}x + $c ikinci dereceden denkleminin kökleri: x1 = $x1, x2 = $x2"
    } else {
        "${a}x² + ${b}x + $c ikinci dereceden denklemi için gerçek kök yok!"
    })

}
*/