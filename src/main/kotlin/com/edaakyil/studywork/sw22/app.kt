/*
Sınıf Çalışması: Bir karmaşık sayıyı temsil eden Complex isimli immutable sınıfı yazınız.
Sınıf karmaşık sayının 0 + 0i sayısına uzaklığı olan Norm bilgisini de verecektir: |a + bi| = sqrt(a*a + b*b)
 */

package com.edaakyil.studywork.sw22

import kotlin.math.sqrt

fun main() {
    val z = Complex(3.0, 4.5)

    println("|${z.real} + ${z.imaginary}| = ${z.norm}")
    println("|${z.real} + ${z.imaginary}| = ${z.length}")
}

class Complex(val real: Double = 0.0, val imaginary: Double = 0.0) {
    val norm: Double
        get() = sqrt(real * real + imaginary * imaginary)

    val length: Double
        get() = norm

    val conjugate: Complex
        get() = Complex(real, -imaginary)
}