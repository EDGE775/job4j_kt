package ru.job4j.tracker.action

import ru.job4j.tracker.input.Input
import ru.job4j.tracker.store.Store

interface UserAction {
    fun name(): String
    fun execute(input: Input, tracker: Store): Boolean
}