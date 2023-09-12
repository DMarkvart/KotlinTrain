package com.markvart.training.lesson_2

fun main() {
    val scoreFirstPerson = 3
    val scoreSecondPerson = 4
    val scoreThirdPerson = 3
    val scoreFourthPerson = 5

    val sum = scoreFirstPerson + scoreSecondPerson + scoreThirdPerson + scoreFourthPerson
    val average = sum * 1.0 / 4

    println(String.format(" %.2f", average))

}
