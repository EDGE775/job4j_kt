package ru.job4j.oop.profession

open class Profession(val name: String, val age: Int)

class Developer(name: String, age: Int, val salary: Double) : Profession(name, age)

class Engineer(name: String, age: Int, val exp: Int) : Profession(name, age)

fun main() {
    val dev: Developer = Developer("Дима", 31, 100000.0)
    val eng: Engineer = Engineer("Сёма", 46, 20)
}