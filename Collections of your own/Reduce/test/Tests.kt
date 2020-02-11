import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test
    fun `sum`() {
        assertReduce(listOf(1, 2, 3), Int::plus, 6)
    }

    @Test
    fun `subtract`() {
        assertReduce(listOf(1, 2, 3), Int::minus, -4)
    }

    fun <INPUT : OUTPUT, OUTPUT> assertReduce(input: List<INPUT>, mapper: (OUTPUT, INPUT) -> OUTPUT, expected: OUTPUT) {
        assertEquals(expected, myReduce(input, mapper))
        assertEquals(input.reduce(mapper), myReduce(input, mapper))
    }
}
