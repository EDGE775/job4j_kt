package ru.job4j.tracker.output

internal class ConsoleOutput : Output {
    override fun println(obj: Any?) {
        println(obj)
    }
}