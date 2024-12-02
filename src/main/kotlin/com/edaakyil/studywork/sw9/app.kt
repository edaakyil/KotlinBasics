/*
Sınıf Çalışması: Parametresi ile aldığı Int türden bir sayının palindrom olup olmadığını test eden
isPalindrome fonksiyonunu yazınız ve aşağıdaki kod ile test ediniz.
 */

package com.edaakyil.studywork.sw9

import kotlin.math.abs

fun main() = runIsPalindromTest()

fun runIsPalindromTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        // println("$value sayısı " + if (isPalindrom(value)) "Palindrom'dur." else "Palindrom değildir.")
        println("$value sayısı ${if (isPalindrom(value)) "Palindrom" else "Palindrom değil"}")

        if (value == 0)
            break
    }
}

fun isPalindrom(a: Int) = a == reverse(a)

fun reverse(a: Int): Int {
    var temp = a
    var result = 0

    while (temp != 0) {
        result = result * 10 + temp % 10
        temp /= 10
    }

    return abs(result)
}