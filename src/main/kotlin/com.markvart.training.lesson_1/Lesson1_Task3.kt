package com.markvart.training.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7

    println(String.format("Год полета - %d", year))
    println(String.format("Взлет - %02d:%02d", hour, minute))

    hour = 10
    minute = 55

    println(String.format("Посадка - %02d:%02d", hour, minute))

}