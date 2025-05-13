package ru.job4j.base

import java.lang.IllegalArgumentException

/**
 * Метод, который рисует букву Х в консоли
 */
fun draw(size: Int) {
    if (size % 2 == 0) {
        throw IllegalArgumentException("The argument must be an odd number")
    }
    var firstIdx = 0
    var secondIdx = size - 1
    for (verticalValue in 0 until size) {
        for (horizontalValue in 0 until size) {
            if (horizontalValue == firstIdx || horizontalValue == secondIdx) print("X") else print(" ")
        }
        firstIdx++
        secondIdx--
        println()
    }
}

fun main() {
    val size = 11
    draw(size)
}