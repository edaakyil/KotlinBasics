/*
Sınıf Çalışması: Parametresi ile aldığı Int türden bir sayının basamak sayısını döndüren
countDigits isimli fonksiyonu döngü kullanarak yazınız ve aşağıdaki kod ile test ediniz.
 */

package com.edaakyil.studywork.sw6

fun main() = com.edaakyil.studywork.sw6.runCountDigitsTest()

fun runCountDigitsTest() {
    while (true){
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        println("$value sayısının basamak sayısı: ${com.edaakyil.studywork.sw6.countDigits(value)}")

        if (value == 0)
            break
    }
}

fun countDigits(a: Int): Int {
    var count = 0
    var temp = a

    do {
        ++count
        temp /= 10
    } while (temp != 0)

    return count
}