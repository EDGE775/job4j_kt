package ru.job4j.labmda

import java.time.Instant
import java.util.*

fun campaingMapper(campaings: List<Campaing>): List<String> {
    return campaings.map { x -> "Campaing: name=${x.name}, address=${x.address}, created=${x.created}" }
}

fun main() {
    val list = mutableListOf(
        Campaing(
            name = "camp1",
            address = Address(
                street = "Stroiteley",
                houseNumber = "15"
            ),
            created = Date.from(
                Instant.now()
            )
        )
    )

    campaingMapper(list)
        .forEach { println(it) }
}