package ru.job4j.base

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ArraysKtTest {

    @Test
    fun whenDefragmentArrayWithOneElementThenMoveNullsToEnd() {
        val array = arrayOfNulls<String>(5)
        array[4] = "Value"
        defragment(array)
        assertThat(array[0]).isEqualTo("Value")
        assertThat(array[4]).isNull()
    }

    @Test
    fun whenDefragmentArrayWithSeveralElementsThenMoveNullsToEnd() {
        val array = arrayOfNulls<String>(5)
        array[4] = "Value"
        array[3] = "Value"
        array[2] = "Value"
        defragment(array)
        assertThat(array).startsWith("Value", "Value", "Value")
        assertThat(array).endsWith(null, null)
    }
}