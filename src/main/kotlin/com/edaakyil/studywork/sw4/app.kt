/*
Sınıf Çalışması: Klavyeden katsayıları girilen ikinci dereceden bir denklemin köklerini bulan programı yazınız.

Açıklama: Programda yeni nesil sqrt global fonksiyonunu kullanınız.
 */

package com.edaakyil.studywork.sw4

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

fun findQuadraticEquationRoots(a: Double, b: Double, c: Double): String {
    fun calculateDelta() = b * b - 4 * a * c
    val delta = calculateDelta()

    fun calculateRoots(): String {
        val sqrtDelta = sqrt(delta)
        return "x1 = ${(-b + sqrtDelta) / (2 * a)}, x2 = ${(-b - sqrtDelta) / (2 * a)}"
    }

    return if (delta > 0)
        calculateRoots()
    else if (delta == 0.0)
        "x1 = x2 = ${-b / (2 * a)}"
    else
        "No real root"
}

/*
fun findQuadraticEquationRoots(a: Double, b: Double, c: Double): String {
    fun calculateDelta() = b * b - 4 * a * c

    val delta = calculateDelta()

    fun calculateRoots(): String {
        val sqrtDelta = sqrt(delta)

        return "x1 = ${(-b + sqrtDelta) / (2 * a)}, x2 = ${(-b - sqrtDelta) / (2 * a)}"
    }

    return if (delta >= 0)
        calculateRoots()
    else
        "No real root"
}
 */