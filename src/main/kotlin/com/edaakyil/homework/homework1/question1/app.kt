/*
1. Klavyeden alınan Int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve =
sembolleriyle gösteriniz:

Açıklama:
    - Program üç tane Int türden sayı isteyecektir, aralarındaki ilişkiyi ekranda gösterecektir. İşte birkaç örnek:
        Giriş: 10 20 30
        Yanıt: 10 < 20 < 30
        Giriş: 30 10 20
        Yanıt: 10 < 20 < 30
        Giriş: 10 10 15
        Yanıt: 10 = 10 < 15
        Giriş: 40 50 50
        Yanıt: 40 < 50 = 50
    - Programda herhangi bir sıralama algoritması kullanılmayacaktır zaten gerek de yoktur
 */

package com.edaakyil.homework.homework1.question1

fun main() = runCompareNumbersTest()

fun runCompareNumbersTest() {
    while (true) {
        println("Üç tane sayı giriniz: ")
        val a = readln().toInt()
        val b = readln().toInt()
        val c = readln().toInt()

        compareNumbers(a, b, c)

        if (a == 0 && b == 0 && c == 0)
            break
    }
}

fun compareNumbers(a: Int, b: Int, c: Int) {
/*    if (a < b)
        println(if (b < c) "$a < $b < $c" else if (a == c) "$a = $c < $b" else if (b == c) "$a < $b = $c" else "$a < $c < $b")
    else if (b < a)
        println(if (a < c) "$b < $a < $c" else if (a == c) "$b < $a = $c" else if (b == c) "$b = $c < $a" else "$b < $c < $a")
    else
        println(if (a < c) "$a = $b < $c" else if (a == c) "$a = $b = $c" else "$c < $a = $b")
*/
    println("${equalOrNot(a, b)}")

}

fun max(a: Int, b: Int) = if (a < b) b else a
fun min(a: Int, b: Int) = if (a < b) a else a

fun equalOrNot(a: Int, b: Int) = if (a < b) "$a < $b" else if(a == b) "$a = $b" else "$b < $a"

fun find(a: Int, b: Int, c: Int) {
    val minValue = min(a, min(b, c))
    val maxValue = max(a, max(b, c))
}