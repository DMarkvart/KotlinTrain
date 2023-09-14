package com.markvart.training.lesson_1

fun main() {
    val seconds: Short = 6480

    val hourToOutput = seconds / 3600
    val minutesToOutput = (seconds % 3600) / 60
    val secondsToOutput = seconds % 60

    println(String.format("%02d:%02d:%02d", hourToOutput, minutesToOutput, secondsToOutput))

}
