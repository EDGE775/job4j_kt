package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalcTest{

    @Test
    fun when1Plus1() {
        assertThat(add(1, 1)).isEqualTo(2)
    }

    @Test
    fun when1Minus1() {
        assertThat(subtract(1, 1)).isEqualTo(0)
    }

    @Test
    fun when2Multiply2() {
        assertThat(multiply(2, 2)).isEqualTo(4)
    }

    @Test
    fun when2Divide2() {
        assertThat(divide(2, 2)).isEqualTo(1)
    }

    @Test
    fun whenMaxOfTwo() {
        assertThat(maxOfTwo(3, 6)).isEqualTo(6)
    }

    @Test
    fun whenMaxOfThree() {
        assertThat(maxOfThree(9, 3, 6)).isEqualTo(9)
    }
}