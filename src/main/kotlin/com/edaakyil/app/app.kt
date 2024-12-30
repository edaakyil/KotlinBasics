package com.edaakyil.app

fun main() {
    val a = 20
    val any: Any = a //boxing

    println(a.javaClass.name)
    println(any.javaClass.name)

    val value = any as Int //unboxing

    println(value)
    println(value.javaClass.name)
}