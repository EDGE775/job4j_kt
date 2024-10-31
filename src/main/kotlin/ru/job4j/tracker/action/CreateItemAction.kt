package ru.job4j.tracker.action

import ru.job4j.tracker.input.Input
import ru.job4j.tracker.model.Item
import ru.job4j.tracker.output.Output
import ru.job4j.tracker.store.Store

class CreateItemAction(private val out: Output) : UserAction {
    override fun name(): String {
        return "Create"
    }

    override fun execute(input: Input, tracker: Store): Boolean {
        println("=== Create a new Item ====")
        val name = input.askStr("Enter name: ")
        val item = Item(name = name)
        tracker.add(item)
        return true
    }
}