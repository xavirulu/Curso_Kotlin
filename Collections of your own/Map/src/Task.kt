TODO()

data class IntegerWrapper(val int: Int) {
    fun increment(): IntegerWrapper {
        return this.copy(int = int + 1)
    }
}
