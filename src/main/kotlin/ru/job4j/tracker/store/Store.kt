package ru.job4j.tracker.store

import ru.job4j.tracker.model.Item

interface Store {
    fun add(item: Item): Item

    fun replace(id: Int, item: Item): Boolean

    fun delete(id: Int): Boolean

    fun findAll(): List<Item>

    fun findByName(key: String): List<Item>

    fun findById(id: Int): Item?

    fun clearAll()
}