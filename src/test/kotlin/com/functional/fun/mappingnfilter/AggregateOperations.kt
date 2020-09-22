package com.functional.`fun`.mappingnfilter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregateOperations {

    @Test
    fun `Get sum of all numbers in a list`() {
        val listOfNumber = listOf(1, 4, 6, 30, 55, 3, 67, 100, 200)

        val totalSum = listOfNumber.sum()

        assertThat(totalSum)
            .isEqualTo(466)
    }

    @Test
    fun `Get sum of all numbers in a int range list`() {
        val listOfNumber = listOf(1..10)

        val totalSum = listOfNumber.sumBy(IntRange::sum)

        assertThat(totalSum)
            .isEqualTo(55)
    }
}
