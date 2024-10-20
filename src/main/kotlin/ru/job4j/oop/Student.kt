package ru.job4j.oop

data class Student(
    var name: String = "",
    var surname: String = "",
    var phone: String = "",
    var email: String = ""
) {
    constructor(name: String) : this() {
        this.name = name
    }

    constructor(name: String, surname: String) : this(name) {
        this.surname = surname
    }

    constructor(name: String, surname: String, phone: String) : this(name, surname) {
        this.phone = phone
    }
}