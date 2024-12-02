/*
Sınıf Çalışması: Bir karmaşık sayıyı temsil eden MutableComplex isimli sınıfı yazınız.
Sınıf, karmaşık sayının 0 + 0i sayısına uzaklığı olan Norm bilgisini de verecektir: |a + bi| = sqrt(a*a + b*b)
 */

package com.edaakyil.studywork.sw21

import kotlin.math.sqrt

fun main() {
    val z = MutableComplex(3.0, 4.5)

    println("|${z.real} + ${z.imaginary}| = ${z.norm}")
    println("|${z.real} + ${z.imaginary}| = ${z.length}")

    z.real = 5.6
    z.imaginary = 8.9

    println("|${z.real} + ${z.imaginary}| = ${z.norm}")
    println("|${z.real} + ${z.imaginary}| = ${z.length}")

}

class MutableComplex(var real: Double = 0.0, var imaginary: Double = 0.0) {
    val norm: Double
        get() = sqrt(real * real + imaginary * imaginary)

    val length: Double
        get() = norm

    val conjugate: MutableComplex
        get() = MutableComplex(real, -imaginary)
}
