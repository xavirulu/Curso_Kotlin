import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test
    fun `flatmap on the same type`() {
        val input = listOf(1, 2, 3)
        val mapper: (Int) -> List<Int> = { it -> listOf(it, it) }
        val expected = listOf(1, 1, 2, 2, 3, 3)

        assertFlatMap(input, mapper, expected)
    }

    @Test
    fun `flatmap on different type`() {
        val input = listOf(1, 2, 3)
        val mapper: (Int) -> List<IntegerWrapper> = { it -> listOf(IntegerWrapper(it)) }
        val expected = listOf(IntegerWrapper(1), IntegerWrapper(2), IntegerWrapper(3))

        assertFlatMap(input, mapper, expected)
    }

    private fun <INPUT, OUTPUT> assertFlatMap(input: List<INPUT>, mapper: (INPUT) -> List<OUTPUT>, expected: List<OUTPUT>) {
        assertEquals("Error on function 'flatMap'", expected, myFlatMap(input, mapper))
        assertEquals("Error on function 'flatMap'", input.flatMap(mapper), myFlatMap(input, mapper))
    }
}
