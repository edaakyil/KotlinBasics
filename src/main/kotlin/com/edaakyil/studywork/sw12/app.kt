/*
Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayılardan pozitif ve negatif
olanlarının ayrı ayrı toplamlarını ve kaçar tane olduklarını bulan programı yazınız.

Not: Örnek Kotlin'de şu ana kadar görülen konular kullanılarak yazılmıştır.
 */

package com.edaakyil.studywork.sw12

fun main() = runPosNegCountApp()

fun runPosNegCountApp() {
    var posCount = 0
    var negCount = 0
    var posTotal = 0
    var negTotal = 0

    while (true) {
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        if (value == 0)
            break

        if (value > 0) {
            posTotal += value
            ++posCount
        }
        else {
            negTotal += value
            ++negCount
        }
    }

    printResult(posCount, negCount, posTotal, negTotal)
}

fun printResult(posCount: Int, negCount: Int, posTotal: Int = 0, negTotal: Int) {
    if (posCount > 0)
        println("$posCount adet pozitif sayı girdiniz. Toplamları:$posTotal")
    else
        println("Hiç pozitif sayı girmediniz")

    if (negCount > 0)
        println("$negCount adet pozitif sayı girdiniz. Toplamları:$negTotal")
    else
        println("Hiç negatif sayı girmediniz")
}