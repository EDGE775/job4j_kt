package ru.job4j.tracker.model

import java.time.LocalDateTime

data class Item(
    var id: Int,
    var name: String?,
    var description: String?,
    var created: LocalDateTime = LocalDateTime.now()
) {
    constructor() : this(0, null, null)
}