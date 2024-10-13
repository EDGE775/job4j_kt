package ru.job4j.tracker.store

import ru.job4j.tracker.model.Item


class MemTracker : Store {

    private val items = ArrayList<Item>()

    private var ids = 1;

    override fun add(item: Item): Item {
        item.id = ids++
        items.add(item)
        return item
    }

    override fun findAll(): List<Item> = items

    override fun findByName(key: String): List<Item> {
        val rsl = ArrayList<Item>()
        for (item in items) {
            if (item.name == key) {
                rsl.add(item)
            }
        }
        return rsl
    }

    override fun replace(id: Int, item: Item): Boolean {
        var idx = indexOf(id)
        var isExists = idx != -1
        if (isExists) {
            item.id = id
            items.set(idx, item)
        }
        return isExists
    }

    override fun delete(id: Int): Boolean {
        var idx = indexOf(id)
        var isExists = idx != -1
        if (isExists) {
            items.removeAt(idx)
        }
        return isExists
    }

    override fun findById(id: Int): Item? = items.getOrNull(indexOf(id))

    override fun clearAll() {
        items.clear()
        ids = 1
    }

    private fun indexOf(id: Int): Int {
        var resultIdx = -1
        for ((index, item) in items.withIndex()) {
            if (item.id == id) {
                resultIdx = index
                break
            }
        }
        return resultIdx
    }
}