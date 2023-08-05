package ru.job4j.base

fun max(first: Int, second: Int) = if (first > second) first else second

fun maxOf3Num(first: Int, second: Int, third: Int) : Int = max(first, max(second, third))

fun main() {
    val rsl = max(1, 2)
    println("max from 1 and 2 is $rsl")
    val rsl2 = maxOf3Num(7,10,12)
    println("max from 7, 10, 12 is $rsl2")
}