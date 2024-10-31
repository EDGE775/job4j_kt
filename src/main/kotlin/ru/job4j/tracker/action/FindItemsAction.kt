package ru.job4j.tracker.action

import ru.job4j.tracker.input.Input
import ru.job4j.tracker.output.Output
import ru.job4j.tracker.store.Store

class FindItemsAction(private val out: Output) : UserAction {
    override fun name(): String {
        return "Find all Items"
    }

    override fun execute(input: Input, tracker: Store): Boolean {
        println("=== Find all Items ====")
        tracker.findAll().forEach { x -> println(x) }
        return true
    }
}