fun fizzBuzz(number: Int): String {
    when {
        number % 15 == 0 -> return "FizzBuzz"
        number % 3 == 0 -> return "Fizz"
        number % 5 == 0 -> return "Buzz"
        else -> return "" + number
    }
}
