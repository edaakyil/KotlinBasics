/*
Sınıf Çalışması: Parametresi ile aldığı 3 basamaklı Int türden bir sayının basamakları toplamını döndüren sum3Digits
fonksiyonunu ve test kodunu yazınız. Açıklamalar:

    1. Fonksiyon basamak sayısı kontrolü yapmayacaktır.
    2. Sayı negatif ise sonuç pozitif olarak elde edilecektir
 */

package com.edaakyil.studywork.sw2

import kotlin.math.abs

fun main() = runSum3DigitsTest()

fun runSum3DigitsTest() {
    print("3 basamaklı bir sayı giriniz: ")
    val value = readln().toInt()

    println("$value sayısının basamakları toplamı: ${sum3Digits(value)}")
}

fun sum3Digits(a: Int) = abs(a / 100 + a / 10 % 10 + a % 10)

/*
fun sum3Digits(value: Int) : Int {
    val a = value / 100
    val b = value / 10 % 10
    val c = value % 10

    return abs(a + b + c)
}
 */

/*
fun sum3Digits(value: Int) : Int {
    val a = value.div(100)
    val b = value.div(10).rem(10)
    val c = value.rem(10)

    return abs(a + b + c)
}
 */