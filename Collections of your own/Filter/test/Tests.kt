import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test
    fun `test on Int`() {
        val predicate = { it: Int -> it > 10 }

        val input = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
        val expected = listOf(13, 21, 34)

        assertFilter(input, predicate, expected)
    }

    @Test
    fun `keep odd numbers`() {
        val predicate = { it: Int -> it % 2 == 0 }

        val input = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
        val expected = listOf(2, 8, 34)

        assertFilter(input, predicate, expected)
    }


    @Test
    fun `remove odd numbers`() {
        val predicate = { it: Int -> it % 2 == 1 }

        val input = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
        val expected = listOf(1, 1, 3, 5, 13, 21)

        assertFilter(input, predicate, expected)
    }

    @Test
    fun `test on Doubles`() {
        val predicate = { it: Double -> Math.floor(it) != it }

        val input = listOf(1.1, 1.0, 2.1, 2.0)
        val expected = listOf(1.1, 2.1)

        assertFilter(input, predicate, expected)
    }

    private fun <INPUT> assertFilter(input: List<INPUT>, predicate: (INPUT) -> Boolean, expected: List<INPUT>) {
        assertEquals("Failure in function 'filter'", expected, myFilter(input, predicate))
        assertEquals("Failure in function 'filter'", input.filter(predicate), myFilter(input, predicate))
    }
}
