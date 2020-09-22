# Kotlin fun

## Aggregate Operations
### Sum
- sumBy
```kotlin
    @Test
    fun `Get sum of all numbers in a int range list`() {
        val listOfNumber = listOf(1..10)

        val totalSum = listOfNumber.sumBy(IntRange::sum)
    
        assertThat(totalSum)
            .isEqualTo(55)
    }
```


