package ru.job4j.oop

fun main() {
    val steve = Driver();
    println("Steve wants the trucker job.")
    if (!steve.hasLicense()) {
        println("Steve need to get a license!")
        steve.passExamOn('A')
    }
    if (steve.canDrive('C')) {
        println("Steve works on truckers!")
    } else if (steve.canDrive('B')) {
        println("Steve works in taxi.")
    } else {
        println("Steve does not have a job, but ride on motorbike!");
    }
}