package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun multiply(first: Int, second: Int) : Int {
    return first * second
}

fun division(first: Double, second: Double) : Double {
    return first / second
}

fun main() {
    val plus = add(2, 5)
    println("2 + 5 = $plus")

    val minus = subtract(72, 18)
    println("72 - 18 = $minus")

    val multiply = multiply(2, 5)
    println("2 * 5 = $multiply")

    val divide = division(15.0, 2.0)
    println("15.0 / 2.0 = $divide")
}