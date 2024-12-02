/*
Sınıf Çalışması: Parametresi ile aldığı Int türden bir sayının basamakları toplamını döndüren sumDigits
fonksiyonunu yazınız ve aşağıdaki kod ile test ediniz. Açıklama: Fonksiyon negatif sayılar için de pozitif
değere geri dönecektir
 */

package com.edaakyil.studywork.sw7

import kotlin.math.abs

fun main() = runSumDigitsTest()

fun runSumDigitsTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        println("$value sayısının basamakları toplamı: ${sumDigits(value)}")

        if (value == 0)
            break
    }
}

fun sumDigits(a: Int): Int {
    var temp = abs(a)
    var total = 0

    while (temp != 0) {
        total += temp % 10
        temp /= 10
    }

    return total
}