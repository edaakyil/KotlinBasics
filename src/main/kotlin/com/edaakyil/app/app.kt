package com.edaakyil.app

import com.edaakyil.kotlin.math.geometry.Point
import com.edaakyil.kotlin.util.console.printArray

fun main() {
    println(2 === 2)
    println("e" === "e")

    println("----------")

    val a = 2
    val b = 2
    println(a === b)

    println("----------")

    val s1 = "e"
    val s2 = "e"
    println(s1 === s2)

    println("----------")

    val p1 = Point(10.0, 10.0)
    val p2 = Point(10.0, 10.0)
    println(p1 === p2)

    /*val d1 = DayOfWeek.entries.toTypedArray()
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
        println(if (d1[i] === d2[i]) "Aynı nesne" else "Farklı nesneler")*/
}

enum class DayOfWeek {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

fun printDayOfWeekArray(arr: Array<DayOfWeek>) {
    for (i in arr.indices)
        print("${arr[i]} ")

    println()
}

open class A {
    open fun foo() {
        println("A.foo")
    }
}

open class B : A() {
    final override fun foo() {
        println("B.foo")
    }
}

open class C : B() {

}
