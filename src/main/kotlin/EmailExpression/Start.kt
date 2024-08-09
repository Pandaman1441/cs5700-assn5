package EmailExpression

class Start : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        when (char) {
            "" -> emailVerifier.state = InvalidEmail()
            " " -> emailVerifier.state = InvalidEmail()
            else -> emailVerifier.state = PartOne()
        }
    }
}