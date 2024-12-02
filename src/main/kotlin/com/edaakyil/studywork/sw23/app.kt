/*
Sınıf Çalışması: Hilesiz bir paranın yazı gelme olasığını yaklaşık
olarak hesaplayan basit bir simülasyon programını yazınız.
 */

package com.edaakyil.studywork.sw23

import kotlin.random.Random

fun main() = runCoinProbabilitySimulationApp()

fun runCoinProbabilitySimulationApp() {

    while (true) {
        print("Bir sayı giriniz: ")
        val n = readln().toInt()

        if (n <= 0)
            break

        println("p = ${calculateCoinProbability(n)}")
    }
}

fun calculateCoinProbability(n: Int): Double {
    var count = 0

    for (i in 1..n)
        count += Random.nextInt(2)

    return count.toDouble() / n
}

/*
fun calculateCoinProbability(n: Int): Double {
    var count = 0

    for (i in 1..n)
        if (Random.nextBoolean())
            ++count

    return count.toDouble() / n
}
 */