/*
Sınıf Çalışması: Klavyeden girilen iki tamsayının toplamını, çarpımını ve farkını ekrana yazdıran programı yazınız.
 */

package com.edaakyil.studywork.sw1

fun main() {
    print("Birinci sayısı giriniz: ")
    val a = readln().toInt()

    print("İkinci sayısı giriniz: ")
    val b = readln().toInt()

    println("$a + $b = ${a + b}")
    println("$a - $b = ${a - b}")
    println("$a * $b = ${a * b}")

    /*
    println("%d + %d = %d".format(a, b, a + b))
    println("%d - %d = %d".format(a, b, a - b))
    println("%d * %d = %d".format(a, b, a * b))
    */
}