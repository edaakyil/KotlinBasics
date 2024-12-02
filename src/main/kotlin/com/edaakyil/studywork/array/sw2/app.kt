/*
Sınıf Çalışması: Parametresi ile aldığı Long türden bir sayının basamaklarından oluşan diziyi döndüren
digits fonksiyonunu yazınız ve aşağıdaki kod ile test ediniz.

Not: Sayı negatif olsa bile basamak değerleri pozitif olacaktır.
 */

package com.edaakyil.studywork.array.sw2

import com.edaakyil.kotlin.util.console.printArray
import kotlin.random.Random

fun main() = runDigitsTest()

fun runDigitsTest() {
    while (true) {
        print("Input a value: ")
        val count = readln().toLong()

        if (count <= 0)
            break

        for (i in 1..count) {
            val value = Random.nextLong()
            print("$value -> ")
            printArray(digits(value))
        }

        println("-----------------------------")
    }
}

fun digits(value: Long): IntArray {
    val n = countDigits(value)
    val arr = IntArray(n)
    var temp = value

    for (i in n - 1 downTo 0) {
        arr[i] = (temp % 10).toInt()
        temp /= 10
    }

    return arr
}

fun countDigits(value: Long): Int {
    var count = 0
    var temp = value

    do {
        ++count
        temp /= 10
    } while (temp != 0L)

    return count
}