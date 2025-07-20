package ru.job4j.oop.profession

open class Profession(val name: String, val age: Int) {

    open fun getFullName(): String {
        return name
    }

    open fun action() {
        println("some action")
    }
}

class Developer(name: String, age: Int, val salary: Double) : Profession(name, age) {

    override fun getFullName(): String {
        return super.getFullName() + " from subclass"
    }

    override fun action() {
        super.action()
        println("some action from subclass")
    }
}

class Engineer(name: String, age: Int, val exp: Int) : Profession(name, age)

fun main() {
    val dev: Developer = Developer("Дима", 31, 100000.0)
    val eng: Engineer = Engineer("Сёма", 46, 20)
}