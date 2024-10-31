package ru.job4j.tracker.input

interface Input {
    fun askStr(question: String?): String?
    fun askInt(question: String?): Int
}