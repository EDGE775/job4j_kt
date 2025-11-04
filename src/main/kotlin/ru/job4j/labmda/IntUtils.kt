package ru.job4j.labmda

fun count(list: List<Int>) =
    list
        .stream()
        .mapToInt { it }
        .filter { it % 2 != 0 }
        .map { it.inc() }
        .sum()

fun main() {
    val list = listOf(1, 2, 4, 5, 6, 7)

    println(count(list))
}