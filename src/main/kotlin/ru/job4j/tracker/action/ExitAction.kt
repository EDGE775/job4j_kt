package ru.job4j.tracker.action

import ru.job4j.tracker.input.Input
import ru.job4j.tracker.store.Store

class ExitAction : UserAction {
    override fun name(): String {
        return "Exit program"
    }

    override fun execute(input: Input, tracker: Store): Boolean {
        return false
    }
}