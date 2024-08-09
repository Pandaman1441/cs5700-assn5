package EmailExpression

interface EmailState {
    fun consumeCharacter(char: String, emailVerifier: EmailVerifier)
}