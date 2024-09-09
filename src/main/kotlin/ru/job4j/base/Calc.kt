package ru.job4j.base

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

fun multiplication(first: Int, second: Int): Int {
    return first * second
}

fun division(first: Int, second: Int): Int {
    return first / second
}

fun main() {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val multi = multiplication(2, 2)
    println("2 * 2 = $multi")

    val div = division(3, 3)
    println("3 / 3 = $div")
}