package ru.job4j.base

fun fitness(ivan: Int, nik: Int): Int {
    var month = 0;
    var powerIvan = ivan
    var powerNik = nik
    while (powerIvan < powerNik) {
        powerIvan *= 3;
        powerNik *= 2
        month++
    }
    return month
}

fun addExample(start: Int, finish: Int): Int {
    var rsl = 0;
    for (value in start .. finish) {
        rsl += value
    }
    return rsl
}


fun main() {
    val rsl = fitness(50, 90)
    println("Month : $rsl")
    val example = addExample(20, 30)
    println("Sum from 20 to 30 = $example")
}