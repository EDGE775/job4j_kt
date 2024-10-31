package ru.job4j.tracker

import ru.job4j.tracker.action.CreateItemAction
import ru.job4j.tracker.action.ExitAction
import ru.job4j.tracker.action.FindItemsAction
import ru.job4j.tracker.action.UserAction
import ru.job4j.tracker.input.ConsoleInput
import ru.job4j.tracker.input.Input
import ru.job4j.tracker.output.ConsoleOutput
import ru.job4j.tracker.output.Output
import ru.job4j.tracker.store.MemTracker
import ru.job4j.tracker.store.Store
import java.lang.Exception

object StartUI {

    private val output: Output = ConsoleOutput()

    fun init(input: Input, tracker: Store, actions: List<UserAction>) {
        var run = true
        while (run) {
            showMenu(actions)
            val select: Int = input.askInt("Select: ")
            if (select < 0 || select >= actions.size) {
                output.println("Wrong input, you can select: 0 .. " + (actions.size - 1))
                continue
            }
            val action: UserAction = actions[select]
            run = action.execute(input, tracker)
        }
    }

    private fun showMenu(actions: List<UserAction>) {
        println("Menu.")
        for (i in actions.indices) {
            println("${i}. ${actions[i].name()}")
        }
    }
}

fun main(args: Array<String>) {
    val output: Output = ConsoleOutput()
    val input: Input = ConsoleInput()
    try {
        val actions = arrayListOf(
            CreateItemAction(output),
            FindItemsAction(output),
            ExitAction()
        )
        StartUI.init(input, MemTracker, actions)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
