import org.junit.Test
import org.junit.Assert

class IfExpressionTest {
    @Test(timeout = 1000)
    fun `test fizz`() {
        assertFizz(3)
        assertFizz(6)
        assertFizz(9)
        assertFizz(12)
    }

    @Test(timeout = 1000)
    fun `test buzz`() {
        assertBuzz(5)
        assertBuzz(10)
        assertBuzz(20)
    }

    @Test(timeout = 1000)
    fun `test fizzbuzz`() {
        assertFizzBuzz(15)
        assertFizzBuzz(30)
        assertFizzBuzz(45)
        assertFizzBuzz(60)
    }


    @Test(timeout = 1000)
    fun `test number`() {
        assertNumber(2)
        assertNumber(1)
        assertNumber(4)
    }

    private fun assertFizz(number: Int) {
        Assert.assertEquals("A multiple of 3 is not converted to Fizz", "Fizz", fizzBuzz(number))
    }

    private fun assertBuzz(number: Int) {
        Assert.assertEquals("A multiple of 5 is not converted to Buzz", "Buzz", fizzBuzz(number))
    }

    private fun assertFizzBuzz(number: Int) {
        Assert.assertEquals("A multiple of 5 is not converted to FizzBuzz", "FizzBuzz", fizzBuzz(number))
    }

    private fun assertNumber(number: Int) {
        Assert.assertEquals("Otherwise is not converted to the same number", "" + number, fizzBuzz(number))
    }

}
