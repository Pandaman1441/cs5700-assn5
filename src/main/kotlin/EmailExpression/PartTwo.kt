package EmailExpression

class PartTwo : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        when (char){
            in  "" -> emailVerifier.state = InvalidEmail()
                " " -> emailVerifier.state = InvalidEmail()
                "@" -> emailVerifier.state = InvalidEmail()
                "." -> emailVerifier.state = Period()
                else -> emailVerifier.state = PartTwo()
        }
    }
}