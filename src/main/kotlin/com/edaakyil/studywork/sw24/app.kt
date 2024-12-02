/*
Sınıf Çalışması: Hilesiz iki zar atma deneyinde çift (ikisinin aynı olması) gelme olasılığını
yaklaşık olarak hesaplayan basit simülasyon programını yazınız.
 */

package com.edaakyil.studywork.sw24

import kotlin.random.Random

fun main() = runSameDiceProbabilityApp()

fun runSameDiceProbabilityApp() {
    while (true) {
        print("Bir sayı giriniz: ")
        val n = readln().toInt()

        if (n <= 0)
            break

        println("p = ${calculateSameDiceProbability(n)}")
    }
}

fun calculateSameDiceProbability(n: Int): Double {
    fun areSame() = Random.nextInt(1, 7) == Random.nextInt(1, 7)
    var count = 0

    for (i in 1..n)
        if (areSame())
            ++count

    return count.toDouble() / n
}


/*
fun calculateSameDiceProbability(n: Int): Double {
    var count: Int = 0

    for (i in 1..n)
        if (Random.nextInt(1, 7) == Random.nextInt(1, 7))
            ++count

    return count.toDouble() / n
}
*/