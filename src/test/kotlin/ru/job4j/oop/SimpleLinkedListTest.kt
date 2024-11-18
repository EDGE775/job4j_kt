package ru.job4j.oop

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
class SimpleLinkedListTest {
    private val list: SimpleLinkedList<String> = SimpleLinkedList()

    private fun fillList() {
        list.add("root")
        list.add("second")
        list.add("third")
    }

    @Test
    fun whenAddElementAndGetBefore() {
        assertThat(list.add("root")).isTrue
        assertThat(list.add("second")).isTrue
        assertThat(list.get(0)).isEqualTo("root")
        assertThat(list.get(1)).isEqualTo("second")
    }

    @Test
    fun whenThrowIndexOutOfBoundsException() {
        fillList()
        assertThat(list.get(0)).isEqualTo("root")
        assertThat(list.get(1)).isEqualTo("second")
        assertThrows<IndexOutOfBoundsException> {
            list.get(-1)
        }
    }

    @Test
    fun whenRemoveHead() {
        fillList()
        list.removeAt(0)
        assertThat(list.get(0)).isEqualTo("second")
        assertThat(list.get(1)).isEqualTo("third")
    }

    @Test
    fun whenRemoveMiddle() {
        fillList()
        list.removeAt(1)
        assertThat(list.get(0)).isEqualTo("root")
        assertThat(list.get(1)).isEqualTo("third")
    }

    @Test
    fun whenRemoveTail() {
        fillList()
        list.removeAt(2)
        assertThat(list.get(0)).isEqualTo("root")
        assertThat(list.get(1)).isEqualTo("second")
        assertThrows<IndexOutOfBoundsException> {
            list.get(2)
        }
    }

    @Test
    fun whenIsEmptyCorrect() {
        assertThat(list.isEmpty()).isTrue
        list.add("test")
        assertThat(list.isEmpty()).isFalse
    }
}