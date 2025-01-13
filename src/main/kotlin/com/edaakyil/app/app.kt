package com.edaakyil.app

import com.edaakyil.kotlin.util.console.printArray

fun main() {
    val d1 = DayOfWeek.entries.toTypedArray()
    val d2 = DayOfWeek.values()

    println(d1)
    println(d2)

    println("----------")

    printDayOfWeekArray(d1)
    printDayOfWeekArray(d2)

    println("----------")

    println(d1[1])
    println(d2[1])

    println("----------")

    for (i in d1.indices)
        println(if (d1[i] === d2[i]) "Aynı nesne" else "Farklı nesneler")
}

enum class DayOfWeek {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

fun printDayOfWeekArray(arr: Array<DayOfWeek>) {
    for (i in arr.indices)
        print("${arr[i]} ")

    println()
}