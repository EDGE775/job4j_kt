package ru.job4j.base

import kotlin.collections.ArrayList

fun createArray() {
    val names = arrayOfNulls<String>(10)
    names[0] = "Petr Arsentev"
    for ((index, name) in names.withIndex()) {
        println("$index " + name?.length)
    }
}

fun createArrayList() {
    val names = ArrayList<String>()
    names.add("Petr Arsentev")
    for (name in names) {
        println(name)
    }
}

fun defragment(array: Array<String?>) {
    var indexForInsert = 0
    for ((index, value) in array.withIndex()) {
        if (value != null) {
            if (index != indexForInsert) {
                array[indexForInsert] = value
                array[index] = null
            }
            indexForInsert++
        }
    }
}

fun main() {
    val names = arrayOfNulls<String>(10)
    names[2] = "Petr Arsentev"
    names[4] = "Dmitriy"
    names[6] = "Polina"
    names[8] = "Svetlana"
    names[9] = "Viktor"
    defragment(names)
    println(names.contentDeepToString())
}