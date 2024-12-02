package com.edaakyil.kotlin.util.numeric

import kotlin.math.abs
import kotlin.math.log10

val ones = arrayOf("", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz")
val tens = arrayOf("", "on", "yirmi", "otuz", "kırk", "elli", "atmış", "yetmiş", "seksen", "doksan")

fun countDigits(a: Int) = countDigits(a.toLong())

fun countDigits(a: Long) = if (a != 0L) log10(abs(a).toDouble()).toInt() + 1 else 1

fun digits(a: Byte) = digits(a.toLong())

fun digits(a: Short) = digits(a.toLong())

fun digits(a: Int) = digits(a.toLong())

fun digits(a: Long): IntArray {
    val n = countDigits(a)
    val arr = IntArray(n)
    var temp = abs(a)

    for (i in n - 1 downTo 0) {
        arr[i] = (temp % 10).toInt()
        temp /= 10
    }

    return arr
}

fun getPrime(n: Int): Long {
    if (n == 1)
        return 2

    var count = 2
    var number = 3L

    while (count < n) {
        ++number

        if (isPrime(number))
            ++count
    }

    return number
}

/*
fun getPrime(n: Int): Long {
    var count = 0
    var a = 2L

    while (true) {
        if (isPrime(a))
            ++count

        if (count == n)
            return a

        ++a
    }
}

*/

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

fun isPalindrome(a: Int) = a == reverse(a)

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

    var i = 11

    while (i * i <= a) {
        if (a % i == 0L)
            return false

        i += 2
    }

    return true
}

fun pow(a: Int, b: Int): Int {
    var result = 1

    for (i in 1..b)
        result *= a

    return result
}

fun reverse(a: Int): Int {
    var temp = a
    var result = 0

    while (temp != 0) {
        result = result * 10 + temp % 10
        temp /= 10
    }

    return result
}

fun numToStr3DigitsTR(value: Int): String {
    if (value == 0)
        return "sıfır"

    val sb = if (value > 0) StringBuilder() else StringBuilder("eksi")

    val temp = abs(value)
    val a = temp / 100
    val b = temp / 10 % 10
    val c = temp % 10

    if (a != 0) {
        if (a != 1)
            sb.append(ones[a])

        sb.append("yüz")
    }

    if (b != 0)
        sb.append(tens[b])

    if (c != 0)
        sb.append(ones[c])

    return sb.toString()
}