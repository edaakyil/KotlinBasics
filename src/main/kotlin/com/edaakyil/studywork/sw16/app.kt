/*
Sınıf Çalışması: Parametresi ile aldığı Int türden bir n sayısı için n-inci asal sayıyı döndüren
getPrime isimli fonksiyonu yazınız ve aşağıdaki kod ile test ediniz. Açıklamalar:

Fonksiyon n'nin pozitif olmayan değerleri için kontrol yapmayacaktır.
Fonksiyonu isPrime fonksiyonunun etkinliğini düşünerek yazınız
 */

package com.edaakyil.studywork.sw16

import kotlin.math.sqrt

fun main() = runGetPrimeTest()

fun runGetPrimeTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val n = readln().toInt()

        if (n <= 0)
            break

        println("$n. asal sayı: ${getPrime(n)}")
    }
}

fun getPrime(n: Int): Long {
    var count = 0
    var number = 2L

    while (true) {
        if (isPrime(number))
            ++count

        if (count == n)
            return number

        ++number
    }
}

fun isPrime(a: Long): Boolean {
    if (a <= 1)
        return false

    if (a % 2 == 0L)
        return a == 2L

    if (a % 3 == 0L)
        return a == 3L

    if (a % 5 == 0L)
        return a == 5L

    if (a % 7 == 0L)
        return a == 7L

    for (i in 11..sqrt(a / 2.0).toInt() step 2)
        if (a % i == 0L)
            return false

    return true
}

/*
fun isPrime(a: Long): Boolean {
    if (a <= 1)
        return false

    if (a % 2 == 0L)
        return a == 2L

    if (a % 3 == 0L)
        return a == 3L

    if (a % 5 == 0L)
        return a == 5L

    if (a % 7 == 0L)
        return a == 7L

    var i = 11L

    var count = 0L

    while (i * i <= a) {
        ++count
        if (a % i == 0L)
            return false

        i += 2
    }

    println("isPrime:count = $count")

    return true
}
 */