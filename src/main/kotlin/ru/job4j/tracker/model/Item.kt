package ru.job4j.tracker.model

import java.time.LocalDateTime

data class Item(
    var id: Int = 0,
    var name: String? = null,
    var description: String? = null,
    var created: LocalDateTime = LocalDateTime.now()
)