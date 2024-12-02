/*
Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların toplamını bulan programı yazınız. Örnekte break deyimini kullanabilirsiniz.

Anahtar Notlar: Kotlin'de break deyiminin etiketsiz kullanımı Java ile aynıdır
 */

package com.edaakyil.studywork.sw5

fun main() = runApp()

fun runApp() {
    println("Sayıları girmeye başlayınız:")
    var total = 0

    while (true) {
        val a = readln().toInt()

        if (a == 0)
            break

        total += a
    }

    println("Toplam:$total")
}