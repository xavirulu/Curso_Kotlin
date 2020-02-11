import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestFlatMap {
    @Test(timeout = 1000)
    fun testGetOrderedProductsSet() {
        Assert.assertTrue(errorMessage("Customer.getFirstProduct"),
                listOf(idea, idea, idea) == customers[reka]?.getFirstProduct())
    }
}
