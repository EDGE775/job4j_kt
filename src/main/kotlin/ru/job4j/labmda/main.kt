package ru.job4j.labmda

fun main() {
    val max = { x: Int, y: Int -> if (x > y) x else y }
    val rsl = max(1, 2)
    println(rsl)

    val decrement = { x: Int -> x.dec() }
    println(decrement(4))

    val square = { x: Int -> x * x }
    println(square(3))
}