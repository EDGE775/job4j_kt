package ru.job4j.base

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

fun multiply(first: Int, second: Int): Int {
    return first * second
}

fun divide(first: Int, second: Int): Int {
    return first / second
}

fun maxOfTwo(first: Int, second: Int) : Int
        = if (first > second) first else second

fun maxOfThree(first: Int, second: Int, third: Int) : Int
        = if (first > second) maxOfTwo(first, third) else maxOfTwo(second, third)

fun main() {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val multi = multiply(2, 2)
    println("2 * 2 = $multi")

    val div = divide(3, 3)
    println("3 / 3 = $div")

    val maxOfTwo = maxOfTwo(1, 2)
    println("max from 1 and 2 is $maxOfTwo")

    val maxOfThree = maxOfThree(1, 2, 3)
    println("max from 1, 2 and 3 is $maxOfThree")
}