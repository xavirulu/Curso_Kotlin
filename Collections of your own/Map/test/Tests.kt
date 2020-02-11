import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test
    fun `test map on Integers`() {
        val f = { it: Int -> it + 1 }

        val input = listOf(1, 2, 3)
        val expected = listOf(2, 3, 4)

        assertMap(input, f, expected)
    }

    @Test
    fun `test map on Doubles`() {
        val f = { it: Double -> it + 1 }

        val input = listOf(1.0, 2.0, 3.0)
        val expected = listOf(2.0, 3.0, 4.0)

        assertMap(input, f, expected)
    }

    @Test
    fun `test map on any Class`() {
        val f = IntegerWrapper::increment

        val input = listOf(IntegerWrapper(1), IntegerWrapper(3), IntegerWrapper(5))
        val expected = input.map(f)

        assertMap(input, f, expected)
    }

    private fun <INPUT, OUTPUT> assertMap(input: List<INPUT>, f: (INPUT) -> OUTPUT, expected: List<INPUT>) {
        assertEquals("Failure on 'map' function", expected, myMap(input, f))
        assertEquals("Failure on 'map' function", input.map(f), myMap(input, f))
    }

}
