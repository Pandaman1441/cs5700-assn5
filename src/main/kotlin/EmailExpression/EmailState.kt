package EmailExpression

interface BinaryState {
    fun consumeCharacter(char: String, emailVerifier: EmailVerifier)
}