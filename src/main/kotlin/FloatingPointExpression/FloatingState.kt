package FloatingPointExpression

interface FloatingState {
    fun consumeCharacter(char: String, floatingVerifier: FloatingVerifier)
}