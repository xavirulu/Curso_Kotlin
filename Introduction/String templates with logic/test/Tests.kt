import org.junit.Test
import org.junit.Assert

class Test {
    @Test(timeout = 1000)
    fun `check description when plural`() {
        Assert.assertEquals("Should be plural", describeUnits(0), "0 units")
        Assert.assertEquals("Should be plural", describeUnits(2), "2 units")
    }

    @Test(timeout = 1000)
    fun `check description when singular`() {
        Assert.assertEquals("Should be singular", describeUnits(1), "1 unit")
    }
}
