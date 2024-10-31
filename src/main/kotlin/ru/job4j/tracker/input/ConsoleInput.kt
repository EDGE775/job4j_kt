package ru.job4j.tracker.input

import java.util.*

class ConsoleInput: Input {

    private val scanner = Scanner(System.`in`)

    override fun askStr(question: String?): String? {
        println(question)
        return scanner.nextLine()
    }

    override fun askInt(question: String?): Int {
        return Integer.valueOf(askStr(question))
    }
}