package IntegerExpression

interface IntegerState {
    fun consumeCharacter(char: String, integerVerifier: IntegerVerifier)
}