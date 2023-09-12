package com.markvart.training.lesson_1

fun main() {
    val year = "1961"
    var hour = "09"
    var minute = "07"

    println(String.format("Год полета - %s", year))
    println(String.format("Взлет - %s:%s", hour, minute))

    hour = "10"
    minute = "55"

    println(String.format("Посадка - %s:%s", hour, minute))

}