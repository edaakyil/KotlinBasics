/*
Sınıf Çalışması: Parametresi ile aldığı Int türden bir sayının tersini döndüren reverse isimli
fonksiyonu yazınız ve aşağıdaki kod ile test ediniz.

Algoritma: 123 -> 3 -> 3 10 + 2 = 32 -> 32 10 + 1 = 321
 */

package com.edaakyil.studywork.sw8

fun main() = runReverseTest()

fun runReverseTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        if (value == 0)
            break

        println("$value sayısının tersi: ${reverse(value)}")
    }
}

fun reverse(a: Int): Int {
    var temp = a
    var result = 0

    while (temp != 0) {
        result = result * 10 + temp % 10
        temp /= 10
    }

    return result
}
