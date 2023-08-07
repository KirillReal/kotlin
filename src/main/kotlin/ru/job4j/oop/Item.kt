package ru.job4j.oop

data class Item(var id : Int = 0, var name: String = "") {
    constructor(name: String) : this() {
        this.name = name
    }
}