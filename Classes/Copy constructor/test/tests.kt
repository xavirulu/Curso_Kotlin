import org.junit.Assert
import org.junit.Test

class TestCopyConstructor {
    @Test(timeout = 1000)
    fun testListOfPeople() {
        Assert.assertEquals("The rename did not work",
                "Person(name=Alice In Wonderland, age=29)",
                Person("Alice", 29).rename("Alice In Wonderland").toString())
    }
}
