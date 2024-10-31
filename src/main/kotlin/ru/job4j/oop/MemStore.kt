package ru.job4j.oop

object MemStore {
    private val data = arrayListOf<String>()

    fun add(value: String) {
        data.add(value)
    }

    fun getAll() = data
}

fun main() {
    MemStore.add("Petr Arsentev")
    MemStore.add("Dmitry Khlapov")
    println("${MemStore.getAll()}")
}