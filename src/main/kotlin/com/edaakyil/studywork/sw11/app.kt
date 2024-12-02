/*
Sınıf Çalışması: Parametresi ile aldığı bir sayının basamaklarının basamak sayıncı kuvvetleri toplamının
kendisine eşit olup olmadığını test eden isArmstrong isimli fonksiyonu yazınız ve aşağıdaki kod ile test ediniz.
Fonksiyon negatif değerler için false değerini döndürecektir.

Açıklama: Kuvvet alma işlemi için bir önceki örnekte yazılan pow fonksiyonu kullanılacaktır.
 */

package com.edaakyil.studywork.sw11

fun main() = runIsArmstrongTest()

fun runIsArmstrongTest() {
    for (a in -10..99999)
        if (isArmstrong(a))
            print("$a ")
}

fun isArmstrong(a: Int): Boolean {
    fun digitsPowSum(): Int {
        var temp = a
        val n = countDigits(a)
        var result = 0

        while(temp != 0) {
            result += pow(temp % 10, n)
            temp /= 10
        }

        return result
    }

    if (a < 0)
        return false

    return digitsPowSum() == a
}

fun pow(a: Int, b: Int): Int {
    var result = 1

    for (i in 1..b)
        result *= a

    return result
}

fun countDigits(a: Int): Int {
    var temp = a
    var count = 0

    do {
        ++count
        temp /= 10
    } while (temp != 0)

    return count
}
