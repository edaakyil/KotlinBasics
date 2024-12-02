/*
Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birincisi içerisinde ikincisinden kaç tane olduğunu
döndüren countString isimli fonksiyonu ignoreCase parametresi de içerecek şekilde yazınız.
 */

package com.edaakyil.studywork.sw25

fun main() = runCountStringTest()

fun runCountStringTest() {
    while (true) {
        print("Input first text: ")
        val s1 = readln()

        if ("quit" == s1)
            break

        print("Input second text: ")
        val s2 = readln()

        println("Count: ${countString(s1, s2)}")
        println("Count(Ignore case): ${countString(s1, s2, true)}")
        println("------------------------------------------------")
    }
}

fun countString(text1: String, text2: String, ignoreCase: Boolean = false): Int {
    var count = 0
    var index = -1

    while (true) {
        index = text1.indexOf(text2, index + 1, ignoreCase)

        if (index == -1)
            break

        ++count
    }

    return count
}