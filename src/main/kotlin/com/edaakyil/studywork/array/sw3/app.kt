/*
Sınıf Çalışması: Parametresi ile aldığı 1, 2 veya 3 basamaklı bir sayının Türkçe yazı karşılığını
döndüren numToStr3DigitsTR fonksiyonunu yazınız ve aşağıdaki kod ile test ediniz.

Açıklamalar:
    - Fonksiyon basamak sayısı kontrolü yapmayacaktır
    - Bu fonksiyonun daha geneli yazıldığında private olarak bildirilecektir. Şimdilik bunu görmezden geliniz
 */

package com.edaakyil.studywork.array.sw3

import com.edaakyil.kotlin.util.numeric.numToStr3DigitsTR

fun main() = runNumToStr3DigitsTRTest()

fun runNumToStr3DigitsTRTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val a = readln().toInt()

        if (a < 0)
            break

        println(numToStr3DigitsTR(a))
        println("-------------------")
    }
}
