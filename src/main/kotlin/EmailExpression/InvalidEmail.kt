package EmailExpression

class InvalidEmail : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
    }
}