package EmailExpression

class PartOne : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        when (char) {
            in  "@" -> emailVerifier.state = AtSymbol()
                "" -> emailVerifier.state = InvalidEmail()
                " " -> emailVerifier.state = InvalidEmail()
                else -> emailVerifier.state = PartOne()
        }
    }
}